package com.tutorialspoint;

public class HelloWorld {

	private String message;
	private int messageNumber;

	public void getMessage() {
		System.out.println("Your message: " + message);
		System.out.println("Your number: " + messageNumber);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessageNumber(int number) {
		this.messageNumber = number;
	}

}
