/**
 * 
 */
package de.ShiningPho3nix.SpringFramework.DependencyInjection.ConstructorInjection;

import java.util.Date;

/**
 * @author Steffen Dworsky
 *
 */
public class AnswerWithDate {

	private int id;
	private String name;
	private Date date;

	public AnswerWithDate() {

	}
	
	public AnswerWithDate(int id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public String toString() {
		return "ID: " + id + " Answer: " + name + " Posted Date: " + date;
	}
}
