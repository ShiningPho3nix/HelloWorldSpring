package de.ShiningPho3nix.SpringFramework.DependencyInjection.ConstructorInjection;

public class Address {

	private String address;
	private String city;
	private int houseNumber;

	public Address(String address, int houseNumber, String city) {
		this.address = address;
		this.houseNumber = houseNumber;
		this.city = city;
	}

	public String toString() {
		return city + ": " + address + ", " + houseNumber;
	}

}
