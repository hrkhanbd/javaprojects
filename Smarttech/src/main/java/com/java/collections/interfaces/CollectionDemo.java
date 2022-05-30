package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> fruitcollection = new ArrayList<String>();
		
		//add fruits by add method
		fruitcollection.add("banana");
		fruitcollection.add("apple");
		fruitcollection.add("mango");
		System.out.println(fruitcollection);
		
		//remove fruit by remove method
		fruitcollection.remove("banana");
		System.out.println(fruitcollection);
		
		//check if particular item is available in list
		
		boolean a =fruitcollection.contains("banana");
		System.out.println(a);
		
		//clear the list
		
		fruitcollection.clear();
		System.out.println(fruitcollection);
	}

}
