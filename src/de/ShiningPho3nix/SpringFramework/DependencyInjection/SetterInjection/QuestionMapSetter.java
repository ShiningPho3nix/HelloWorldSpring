package de.ShiningPho3nix.SpringFramework.DependencyInjection.SetterInjection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class QuestionMapSetter {

	private int id;
	private String name;
	private Map<String, String> answers;

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

	public Map<String, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id: " + id);
		System.out.println("question name: " + name);
		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> itrMap = set.iterator();
		while (itrMap.hasNext()) {
			Entry<String, String> entry = itrMap.next();
			System.out.println("Answer: " + entry.getKey() + " Posted By: " + entry.getValue());
		}
	}
}
