package oracle.java.omyBatis3.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oracle.java.omyBatis3.dao.DeptDao;
import oracle.java.omyBatis3.dao.EmpDao;
import oracle.java.omyBatis3.dao.Member1Dao;
import oracle.java.omyBatis3.model.Dept;
import oracle.java.omyBatis3.model.DeptVo;
import oracle.java.omyBatis3.model.Emp;
import oracle.java.omyBatis3.model.EmpDept;
import oracle.java.omyBatis3.model.Member1;


@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
	private EmpDao ed;
    @Autowired
	private DeptDao dd;
    @Autowired
    private Member1Dao md;
    
    
   
	
	@Override
	public List<Emp> list(Emp emp) {
		// TODO Auto-generated method stub
		return ed.list(emp);
	}


	@Override
	public int total() {
		System.out.println("EmpServiceImpl total...");

		return ed.total();
	}


	@Override
	public Emp detail(int empno) {
		System.out.println("EmpServiceImpl detail empno->" + empno);
		
		return ed.detail(empno);
	}


	@Override
	public int update(Emp emp) {
		System.out.println("EmpServiceImpl update empno->"+ emp.getEmpno());
		
		return ed.update(emp);
	}


	@Override
	public List<Emp> listManager() {
		System.out.println("EmpServiceImpl update listManager. . .");
		
		return ed.listManager();
	}


	@Override
	public List<Dept> select() {
		System.out.println("EmpServiceImpl update select. . .");
		
		return dd.deptSelect();
	}


	@Override
	public int insert(Emp emp) {
		System.out.println("EmpServiceImpl insert empno->" + emp.getEmpno());
		return ed.insert(emp);
	}


	@Override
	public int delete(int empno) {
		System.out.println("EmpServiceImpl delete empno->" + empno);
		return ed.delete(empno);
	}


	@Override
	public List<EmpDept> listEmp(EmpDept empDept) {
		System.out.println("EmpServiceImpl listEmp empDept->" + empDept);

		return ed.listEmp(empDept);
	}


	@Override
	public String deptName(int deptno) {
		System.out.println("EmpServiceImpl deptName deptno->" + deptno);
		return ed.deptName(deptno);
	}


	@Override
	public void insertDdept(DeptVo deptVO) {
		dd.insertDept(deptVO);
		
	}


	@Override
	public void SelListDept(HashMap<String, Object> map) {

		dd.SelListDept(map);
	}


	@Override
	public int memCount(String id) {
		
		System.out.println("EmpServiceImpl memCount id->" + id);
		return md.memCount(id);
	}


	@Override
	public List<Member1> listMem(Member1 member1) {
		System.out.println("EmpserviceImpl listMem ");
		
		return md.listMem(member1);
	}

	

	

}
