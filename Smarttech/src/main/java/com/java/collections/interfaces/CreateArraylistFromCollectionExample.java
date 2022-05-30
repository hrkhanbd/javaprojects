package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CreateArraylistFromCollectionExample {

	public static void main(String[] args) {
		
		//create arraylist object
		List<Integer> firstFivePrimeNumbers = new ArrayList<Integer>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		//using arraylist constructor
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<Integer>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimeNumbers = new ArrayList<Integer>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		//Using addall method
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		System.out.println(firstTenPrimeNumbers);
		

	}
}
