package com.app.pojo;

public class Employee {


	 private int Id;
	private String  name;
	 private String lname;

	 Employee()
	 {
		 this.Id=0;
		 this.name="VISHAL";
		 this.lname="Surase";
		 
	 }
	 public Employee(int Id,String name,String lname){
		 
		 this.Id=Id;
		 this.name=name;
		 this.lname=lname;
	 }
	 
	 
	
	
	 public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", lname=" + lname + "]";
	}
	
	
}
