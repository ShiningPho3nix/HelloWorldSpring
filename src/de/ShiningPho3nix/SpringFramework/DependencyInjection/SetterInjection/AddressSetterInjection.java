package de.ShiningPho3nix.SpringFramework.DependencyInjection.SetterInjection;

public class AddressSetterInjection {

	private String city;
	private String address;
	private String houseNumber;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String toString() {
		return city + ": " + address + ", " + houseNumber;
	}


}
