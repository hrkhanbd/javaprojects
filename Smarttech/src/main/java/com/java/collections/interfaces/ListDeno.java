package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDeno {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// list allow duplicate element
		//list.add("element1");
		//list.add("element1");
		//list.add("element2");
		//list.add("element2");
		
		//System.out.println(list);
		
		// list allow null element
		
		//list.add(null);
		//list.add(null);
		//System.out.println(list);
		
		// follow insertion order
		
		list.add("element1");
		list.add("element3");
		list.add("element4");
		list.add("element5");
		list.add("element2");
		System.out.println(list);
		
		//access list
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
		
		

	}

}
