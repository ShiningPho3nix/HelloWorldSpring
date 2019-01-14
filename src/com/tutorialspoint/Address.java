package com.tutorialspoint;

public class Address {

	private String address;
	private int houseNumber;
	
	public Address(String address, int houseNumber) {
		this.address = address;
		this.houseNumber = houseNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String toString() {
		return address + " " + houseNumber;
	}

}
