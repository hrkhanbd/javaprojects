package com.testng.practice;

import org.testng.annotations.Test;

import practice.test.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CheckBox1 extends BaseTest

{
	//WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String bType) {
	launch(bType);
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	//driver = new ChromeDriver();
	driver.get("https://echoecho.com/htmlforms09.htm");
	//driver.manage().window().maximize();
	  }
	
	@Test
	public void checkboxtest() {
		
		List<WebElement> check = driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		check.size();
		for(int i=0; i<check.size(); i++) {
			System.out.println(check.get(i).getAttribute("value") + "--" + check.get(i).getAttribute("checked"));
		}
		
		
		}
		
		
	@AfterMethod
	public void afterMethod() {
		
		driver.close();
	}

}
