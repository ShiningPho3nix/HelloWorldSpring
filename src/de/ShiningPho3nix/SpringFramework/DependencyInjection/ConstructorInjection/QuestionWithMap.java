package de.ShiningPho3nix.SpringFramework.DependencyInjection.ConstructorInjection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class QuestionWithMap {

	private int id;
	private String name;
	private Map<String, String> mapAnswers;

	public QuestionWithMap() {

	}

	public QuestionWithMap(int id, String name, Map<String, String> mapAnswers) {
		this.id = id;
		this.name = name;
		this.mapAnswers = mapAnswers;
	}

	public void displayInfo() {
		System.out.println("question id: " + id);
		System.out.println("question name: " + name);
		Set<Entry<String, String>> set = mapAnswers.entrySet();
		Iterator<Entry<String, String>> itrMap = set.iterator();
		while (itrMap.hasNext()) {
			Entry<String, String> entry = itrMap.next();
			System.out.println("Answer: " + entry.getKey() + " Posted By: " + entry.getValue());
		}
	}
}
