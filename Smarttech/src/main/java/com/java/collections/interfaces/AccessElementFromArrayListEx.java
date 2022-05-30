package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayListEx {

	public static void main(String[] args) {
		List<String> topProgrammingLanguage = new ArrayList<String>();
		
		//Check if list is empty
		System.out.println("Is topProgrammingLanguage is empty: " + topProgrammingLanguage.isEmpty());

		topProgrammingLanguage.add("C");
		topProgrammingLanguage.add("Java");
		topProgrammingLanguage.add("c++");
		topProgrammingLanguage.add("python");
		topProgrammingLanguage.add(".net");
		System.out.println(topProgrammingLanguage);
		
		// size of the list
		System.out.println("Programming language list size: "+ topProgrammingLanguage.size());
		
		//retrive element at a given index
		
		String automationlanguage = topProgrammingLanguage.get(1);
		System.out.println("Automation language: " + automationlanguage);
		
		//modify the list
		topProgrammingLanguage.set(4, "C#");
		System.out.println(topProgrammingLanguage);
		
		System.out.println("Is topProgrammingLanguage is empty: " + topProgrammingLanguage.isEmpty());
		
	}
	

}
