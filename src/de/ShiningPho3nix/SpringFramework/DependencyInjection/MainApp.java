package de.ShiningPho3nix.SpringFramework.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.ShiningPho3nix.SpringFramework.DependencyInjection.ConstructorInjection.Employee;
import de.ShiningPho3nix.SpringFramework.DependencyInjection.ConstructorInjection.HelloWorld;
import de.ShiningPho3nix.SpringFramework.DependencyInjection.ConstructorInjection.Question;
import de.ShiningPho3nix.SpringFramework.DependencyInjection.ConstructorInjection.QuestionWithDate;
import de.ShiningPho3nix.SpringFramework.DependencyInjection.ConstructorInjection.QuestionWithMap;
import de.ShiningPho3nix.SpringFramework.DependencyInjection.SetterInjection.EmployeeSetterInjection;
import de.ShiningPho3nix.SpringFramework.DependencyInjection.SetterInjection.QuestionListSetter;
import de.ShiningPho3nix.SpringFramework.DependencyInjection.SetterInjection.QuestionListSetterRef;
import de.ShiningPho3nix.SpringFramework.DependencyInjection.SetterInjection.QuestionMapSetter;
import de.ShiningPho3nix.SpringFramework.DependencyInjection.SetterInjection.QuestionMapSetterRef;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MainApp {

	private static Logger log = LogManager
			.getLogger(de.ShiningPho3nix.SpringFramework.DependencyInjection.MainApp.class.getName());

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		log.trace("Trace message. Also: Entering application.");
		log.debug("Debug message");
		log.info("Info message");

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		log.warn("Warn message. Also: Going to create HelloWord Obj and Employee");

		HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
		Employee employee = (Employee) context.getBean("employee1");
		Employee inheritingEmployee = (Employee) context.getBean("employee2");
		Question question = (Question) context.getBean("question");
		QuestionWithMap questionWithMap = (QuestionWithMap) context.getBean("questionMap");
		QuestionWithDate questionWithDate = (QuestionWithDate) context.getBean("questionDate");

		EmployeeSetterInjection employeeSet = (EmployeeSetterInjection) context.getBean("EmployeeSetter");
		QuestionListSetter qList = (QuestionListSetter) context.getBean("QuestionListSetter");
		QuestionListSetterRef qListRef = (QuestionListSetterRef) context.getBean("QuestionListSetterRef");
		QuestionMapSetter qMap = (QuestionMapSetter) context.getBean("QuestionMapSetter");
		QuestionMapSetterRef qMapRef = (QuestionMapSetterRef) context.getBean("QuestionMapSetterRef");

		hello.getMessage();
		System.out.println("\n");
		System.out.println("Constructor Injection Output:\n");
		employee.printEmployee();
		System.out.println("\n");
		inheritingEmployee.printEmployee();
		System.out.println("\n");
		question.displayInfo();
		System.out.println("\n");
		questionWithMap.displayInfo();
		System.out.println("\n");
		questionWithDate.displayInfo();
		System.out.println("\n");
		System.out.println("Setter Injection Output:\n");
		employeeSet.printEmployee();
		System.out.println("\n");
		qList.displayInfo();
		System.out.println("\n");
		qListRef.displayInfo();
		System.out.println("\n");
		qMap.displayInfo();
		System.out.println("\n");
		qMapRef.displayInfo();
		System.out.println("\n");

		log.error("Error message");
		log.fatal("Fatal message, also: Exiting the program");
	}

}
