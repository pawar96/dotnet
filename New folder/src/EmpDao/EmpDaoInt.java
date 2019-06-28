package EmpDao;

import java.util.List;

import com.app.pojo.Employee;

public interface EmpDaoInt {

	List<Employee> GetEmpDetails() throws Exception;
	String UpdateEmployee (int Id,String name,String lname) throws Exception;
	String DeleteEmployee(int Id) throws Exception;
	String InsertEmployee(int Id,String name,String lname) throws Exception;
}
