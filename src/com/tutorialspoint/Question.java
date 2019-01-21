package com.tutorialspoint;

import java.util.Iterator;
import java.util.List;

/**
 * @author Steffen Dworsky
 *
 */
public class Question {

	private int id;
	private String name;
	private List<Answer> answers;

	public Question() {

	}

	public Question(int id, String name, List<Answer> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id: " + id);
		System.out.println("question name: " + name);
		System.out.println("Answers: ");
		Iterator<Answer> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
