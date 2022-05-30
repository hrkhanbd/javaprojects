package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAutomation {
	
	@Test
	public static void baseLogin() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		//driver.get("https://www.automationpractice.com");
		driver.navigate().back();
		driver.quit();
		
		
	}
	

}
