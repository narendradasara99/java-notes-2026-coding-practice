package com.objectclass;

public class Employee extends Object{
	
	private String name;
	private String dept;
	private Double Sal;
	public Employee(String name, String dept, Double sal) {
		super();
		this.name = name;
		this.dept = dept;
		Sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getSal() {
		return Sal;
	}
	public void setSal(Double sal) {
		Sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", Sal=" + Sal + "]";
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		
		if(this==o)
			return true;
		if(o==null||getClass()!=o.getClass())
			return false;
		
		Employee e=(Employee) o;
		
		return this.name.equals(e.name)&& dept.equals(e.dept)&& Sal==e.Sal;
		
		
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	

}
