package oracle.java.smyBatis3.service;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oracle.java.smyBatis3.dao.DeptDao;
import oracle.java.smyBatis3.dao.EmpDao;
import oracle.java.smyBatis3.dao.Member1Dao;
import oracle.java.smyBatis3.model.Dept;
import oracle.java.smyBatis3.model.DeptVO;
import oracle.java.smyBatis3.model.Emp;
import oracle.java.smyBatis3.model.EmpDept;
import oracle.java.smyBatis3.model.Member1;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao ed;
	@Autowired
	private DeptDao dd;
	@Autowired
	private Member1Dao md;
	
		// ed->EmpDaoImpl 
	public List<Emp> list(Emp emp) {
		return ed.list(emp);
	}
	// ed->EmpDaoImpl 
	public int total() {
		return ed.total();
	}
	// ed->EmpDaoImpl 
	public Emp detail(int empno) {
		return ed.detail(empno);
	}
	
	// ed->EmpDaoImpl 
		public void insertEmp() {
			ed.insertEmp();
	}	
	


	// ed->EmpDaoImpl 
	public int update(Emp emp) {
		return ed.update(emp);
	}

	// ed->EmpDaoImpl 
	@Override
	public List<Emp> listManager() {
		// TODO Auto-generated method stub
		return ed.listManager();
	}		
	// dd->DeptDao 
	public List<Dept> select() {
		return dd.deptSelect();
	}

	public int insert(Emp emp) {
		return ed.insert(emp);
	}	

	// ed->EmpDaoImpl 
	public int delete(int empno) {
		return ed.delete(empno);
	}

	// ed->EmpDaoImpl 
	public List<EmpDept> listEmp(EmpDept empDept) {
		return ed.listEmp(empDept);
	}
	
	@Override
	public String deptName(int deptno) {
		// TODO Auto-generated method stub
		return ed.deptName(deptno);
	}

	// Member1 -> InterCeptor
	@Override
	public int memCount(String id) {
		// TODO Auto-generated method stub
		System.out.println("EmpServiceImpl memCount id ->"+id);
	    return md.memCount(id); 
	}

	// Member1 -> InterCeptor
	@Override
	public List<Member1> listMem(Member1 member1) {
		// TODO Auto-generated method stub
		System.out.println("EmpServiceImpl listMem ");
		return md.listMem(member1);
	}


	// Procedure Call Test 
	@Override
	public void insertDept(DeptVO deptVO) {
		// TODO Auto-generated method stub
		 dd.insertDept(deptVO);
	}
	
	// Procedure Call Cursor Test 

	@Override
	public void SelListDept(Map<String, Object> map) {
		// TODO Auto-generated method stub
		dd.SelListDept(map);
	}
	
	/*	

	// ed->EmpDaoImpl 
	public int insert2(Crawling crawl) {
		return ed.insert2(crawl);
	}
	
*/

	
	
	
	
	
	
}