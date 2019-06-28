package EmpDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.List.*;

import com.app.pojo.Employee;

import DBUtil.DButil;

public class EmpDaoImpl implements EmpDaoInt {

	
	Connection cn;
	PreparedStatement pstn,pstn1,pstn2,pstn3;
	
	public EmpDaoImpl() throws Exception{
		
		cn=DButil.fechConnection();
		pstn=cn.prepareStatement("select * from emp1");
		pstn1=cn.prepareStatement("update emp1 set name=? lname=? where Id=?");
		pstn2=cn.prepareStatement("delete from emp1 where Id=?");
		pstn3=cn.prepareStatement("insert into emp1 values(?,?,?)");
	}

	@Override
	public List<Employee> GetEmpDetails() throws Exception {
		// TODO Auto-generated method stub
     ArrayList<Employee> emp=new ArrayList<>();
		
		try(ResultSet rst=pstn.executeQuery())
		{
		
			while(rst.next())
			{
				emp.add(new Employee(rst.getInt(1), rst.getString(2),rst.getString(3)));	

			}
			return emp;
		}
		
	 
		
		
		
	}

	@Override
	public String UpdateEmployee(int Id, String name, String lname) throws Exception {
		pstn1.setInt(1,Id);
		pstn1.setString(2,name);
		pstn1.setString(3,lname);
		
	int UpdateCount=pstn1.executeUpdate();
	if(UpdateCount==1)
		return"update sucessfully";
		return "not updated";
	}

	@Override
	public String DeleteEmployee(int Id) throws Exception {
		
		
       pstn2.setInt(1,Id);
		int updateCount=pstn2.executeUpdate();
		
		    if(updateCount==1)
			return"deleted successfully";
		    return "not deleted";
	}

	@Override
	public String InsertEmployee(int Id, String name, String lname) throws Exception {
		
		pstn3.setInt(1,Id);
		pstn3.setString(2,name);
		pstn3.setString(3,lname);
	int updateCount=pstn3.executeUpdate();
	   if(updateCount==1)
		   return "insert sucessfully";
	       return "not inserted";
		
		
	}
	
	
	
	
	
	}
