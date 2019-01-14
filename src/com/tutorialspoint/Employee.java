package com.tutorialspoint;

public class Employee {

	private String name;
	private int id;
	private Address address;

	public Employee() {
		super();
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Employee(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public void printEmployee() {
		System.out.println("Name: " + name);
		System.out.println("EmployeeID: " + id);
		System.out.println("Address: " + address.toString());
	}

}
