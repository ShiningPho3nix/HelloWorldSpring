package de.ShiningPho3nix.SpringFramework.DependencyInjection.ConstructorInjection;

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

	public Employee(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public Employee(int id, String name, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public void printEmployee() {
		System.out.println("Name: " + name);
		System.out.println("EmployeeID: " + id);
		if (address != null)
			System.out.println("Address: " + address);
	}

}
