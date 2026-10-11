package com.immutableclass;

public final class Employee {

	final Integer id;
	final String name;
	Address a;

	Employee(Integer id, String name, Address a) {
		this.id = id;
		this.name = name;
		this.a = new Address(a.getAd());
	}

	public Integer getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",add" + a + "]";
	}

	public static void main(String[] args) {
		Address a = new Address();
		a.setAd("ndg");
		Employee employee = new Employee(10, "narendra", a);

		a.setAd("Hyd");
		

		System.out.println(employee);
	}

}
