package de.ShiningPho3nix.SpringFramework.DependencyInjection.SetterInjection;

public class EmployeeSetterInjection {

	private String name;
	private int id;
	private AddressSetterInjection address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AddressSetterInjection getAddress() {
		return address;
	}

	public void setAddress(AddressSetterInjection address) {
		this.address = address;
	}

	public void printEmployee() {
		System.out.println("Name: " + name);
		System.out.println("EmployeeID: " + id);
		if (address != null)
			System.out.println("Address: " + address);
	}

}
