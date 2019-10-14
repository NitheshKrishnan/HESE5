package edu.jspiders.constructorinjection.util;

public class Employee 
{
	private int empId;
	private String name;
	private String gender;
	private double salary;
	
	public Employee()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Employee(int empId, String name, String gender, double salary)
	{
		System.out.println(this.getClass().getSimpleName()+
				" Object Created using arg-constructor(empId,name,gender,salary)");
		
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public Employee(String name,int empId, String gender, double salary)
	{
		System.out.println(this.getClass().getSimpleName()+
				" Object Created using arg-constructor(name,empId,gender,salary)");
		
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public Employee(int empId, String name, double salary, String gender)
	{
		System.out.println(this.getClass().getSimpleName()+
				" Object Created using arg-constructor(empId,name,salary,gender)");
		
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public Employee(String gender, double salary,int empId,String name)
	{
		System.out.println(this.getClass().getSimpleName()+
				" Object Created using arg-constructor(gender,salary,empId,name)");
		
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
}