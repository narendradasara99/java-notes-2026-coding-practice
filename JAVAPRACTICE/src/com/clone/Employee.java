package com.clone;

public class Employee implements Cloneable{

	int id;
    String name;
    Address address;
    
    

    
    public Employee() {
		super();
	}
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	Employee e = (Employee) super.clone();
    	e.address =new Address();
    	
    	return e;
    }




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}




	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}




	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new Address();
		a.city="hyd";
		Employee e = new Employee();
		e.id=1;
		e.name="narendra";
		e.address=a;
		
		Employee c = (Employee) e.clone();
		
		c.address.city="ndg";
		
		System.out.println(e);
		System.out.println(c);
		
	}

}
