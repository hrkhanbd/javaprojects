package com.usa;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int ans = sum2();
		//System.out.println(ans);
		int anssum3 = sum3(50,70);
		System.out.println(anssum3);

	}
	
	static int sum3(int a, int b ) {
		int sum = a + b;
		return sum;
	}
//return the value
	
	static int sum2() {
		int sum, number1, number2;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	number1 = in.nextInt();
		System.out.println("Enter the second number: ");
	number2=in.nextInt();
	in.close();
	sum= number1+number2;
	return sum;
	
	}
}
