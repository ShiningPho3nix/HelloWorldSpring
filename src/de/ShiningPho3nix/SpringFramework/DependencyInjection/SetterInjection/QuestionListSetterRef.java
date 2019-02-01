package de.ShiningPho3nix.SpringFramework.DependencyInjection.SetterInjection;

import java.util.Iterator;
import java.util.List;

public class QuestionListSetterRef {

	private int id;
	private String name;
	private List<AnswerListSetter> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AnswerListSetter> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerListSetter> answers) {
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are:");
		Iterator<AnswerListSetter> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
