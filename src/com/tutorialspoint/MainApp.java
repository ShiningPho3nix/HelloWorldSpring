package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MainApp {

	private static Logger log = LogManager.getLogger(com.tutorialspoint.MainApp.class.getName());

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		log.trace("Trace message. Also: Entering application.");
		log.debug("Debug message");
		log.info("Info message");

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		log.warn("Warn message. Also: Going to create HelloWord Obj and Employee");

		HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
		Employee employee = (Employee) context.getBean("employee");

		hello.getMessage();
		employee.printEmployee();

		log.error("Error message");
		log.fatal("Fatal message, also: Exiting the program");
	}

}
