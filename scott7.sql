-- Spring���� DeptVO ���  DeptVO ���� ���� 
Create or Replace Procedure Dept_Insert3
 (vdeptno   in  dept.deptno%type,    vdname in dept.dname% type,     vloc in dept.loc%Type, 
  p_deptno OUT  dept.deptno%type,    p_dname OUT  dept.dname%TYPE,   p_loc OUT dept.loc%TYPE)
 Is
 BEGIN
      INSERT  INTO  dept values(vdeptno , vdname, vloc);
      commit;
    
      DBMS_OUTPUT.ENABLE;
      -- %TYPE �������� ���� ���
      SELECT   deptno,     dname,     loc
      INTO     p_deptno,   p_dname,   p_loc
      FROM     dept
      WHERE    deptno = vdeptno ;

      -- ����� ���
      DBMS_OUTPUT.PUT_LINE( '�μ���ȣ : ' || p_deptno );
      DBMS_OUTPUT.PUT_LINE( '�μ��̸� : ' || p_dname );
      DBMS_OUTPUT.PUT_LINE( '�μ���ġ : ' || p_loc );
 End;
