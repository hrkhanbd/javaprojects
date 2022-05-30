package com.testng;

import org.testng.annotations.Test;

public class TestNgClass {
	
	
	
	
	@Test
	public static void openBrowser() {
		
		System.out.println("Testing Test NG");
		
	}
	@Test
	public static void getUserName() {
		
		System.out.println("I typed my user name");
		
	}
	
	@Test
	public static void getPassword() {
		
		System.out.println("I typed my password");
	}
	
	@Test
	public static void closeBrowser() {
		
		System.out.println("I closed browser");
	}

}
