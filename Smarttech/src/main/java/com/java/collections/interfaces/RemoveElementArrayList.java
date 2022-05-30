package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementArrayList {

	public static void main(String[] args) {
		List<String> fruit = new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Mango");
		fruit.add("Pineapple");
		fruit.add("Orange");
		fruit.add("Grapes");
		System.out.println(fruit);
		
		// remove Pineapple index
		fruit.remove(3);
		System.out.println(fruit);
		
		// removing element object
		fruit.remove("Mango");
		System.out.println(fruit);
		
		// remove all the element is a given list
		
		List<String> removeFruit = new ArrayList<String>();
		removeFruit.add("Apple");
		removeFruit.add("Banana");
		
		fruit.removeAll(removeFruit);
		System.out.println(fruit);
		fruit.add(0, "Apple");
		System.out.println(fruit);
		
		//clear fruit list
		fruit.clear();
		System.out.println(fruit);
		

	}

}
