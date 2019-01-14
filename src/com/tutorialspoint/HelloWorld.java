package com.tutorialspoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

	private String message;
	private int messageNumber;
	private static Logger log = LogManager.getLogger(com.tutorialspoint.HelloWorld.class.getName());

	public void getMessage() {
		System.out.println("Your message: " + message);
		System.out.println("Your number: " + messageNumber);
		log.debug("Message has been printed out.");
	}

	public void setMessage(String message) {
		this.message = message;
		log.debug("Message has been set with value: " + message);
	}

	public void setMessageNumber(int number) {
		this.messageNumber = number;
		log.debug("Number message has been set with value: " + number);
	}

}
