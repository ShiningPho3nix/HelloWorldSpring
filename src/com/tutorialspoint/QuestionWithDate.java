/**
 * 
 */
package com.tutorialspoint;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author Steffen Dworsky
 *
 */
public class QuestionWithDate {

	private int id;
	private String name;
	private Map<AnswerWithDate, User> answerWithDate;

	public QuestionWithDate() {

	}

	public QuestionWithDate(int id, String name, Map<AnswerWithDate, User> answerWithDate) {
		super();
		this.id = id;
		this.name = name;
		this.answerWithDate = answerWithDate;
	}

	public void displayInfo() {
		System.out.println("question id: " + id);
		System.out.println("question name: " + name);
		System.out.println("Answers: ");
		Set<Entry<AnswerWithDate, User>> set = answerWithDate.entrySet();
		Iterator<Entry<AnswerWithDate, User>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<AnswerWithDate, User> entry = itr.next();
			AnswerWithDate ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information:");
			System.out.println(ans); // da toString bereits für eine andere konstellation überladen wurde
										// muss hier die methode verwendet werden.
			System.out.println("Posted By:");
			System.out.println(user);
		}
	}

}
