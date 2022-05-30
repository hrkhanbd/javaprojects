package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		//create list
	/*	
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);
		list.add(70);
		list.add(60);
				
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		*/
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(10, "Rana", 25, 40000));
		employees.add(new Employee(10, "Rina", 23, 30000));
		employees.add(new Employee(10, "Rima", 28, 50000));
		employees.add(new Employee(10, "Robi", 25, 35000));
		employees.add(new Employee(10, "Raima", 26, 48000));
		

	}

}
