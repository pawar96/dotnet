package tester;

import java.util.Scanner;

import EmpDao.*;

public class EmpTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmpDaoImpl Emp= new EmpDaoImpl();
	    Scanner sc=new Scanner(System.in);
	    boolean exit=false;
	    
	    do { System.out.println("Employee Management");
	      	 System.out.println("\n****************************************************");
	    	 System.out.println("enter Your Choice ");
	    	
	    	System.out.println("1)List of Employee 2)Delete Employee 3)Insert employee");
	  
	  
	    	switch(sc.nextInt())
	    	 
		{
	    	
	    	
		case 1:
	     	
		   
			System.out.println("citizen daitalils"+Emp.GetEmpDetails());
			sc.nextLine();
			break;
		
		case 2:	
			
			System.out.println("enter employye id to delete");
	
		      String Emp1=Emp.DeleteEmployee(sc.nextInt());
		      System.out.println(Emp1);
		      sc.nextLine();
		      break;
		
		case 3:    
		 
		 System.out.println("insert employee data");
	     String Emp3=Emp.InsertEmployee(sc.nextInt(),sc.next(),sc.next());
	     
	      System.out.println(Emp3);
	      sc.nextLine();
	      break;
	      
		case 4:
			exit = true;
			break;
		}
	}while(!exit);
}
}
 