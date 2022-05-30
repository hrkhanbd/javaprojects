package testNGPractice;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import test.launcher.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class LinkTesting1  {
	
	WebDriver driver;
  
	@BeforeMethod
	public void beforeMethod() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
	//ChromeOptions option = new ChromeOptions();
	//option.addArguments("--disable-notifications");
	//option.addArguments("--start-maximized");
	//WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.singaporeair.com/en_UK/gb/home#/book/bookflight");
	driver.findElement(By.xpath("//*[@id=\"explicit-cookie\"]/a/div/div[2]")).click();
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'consent.google.com')]")));
	//driver.findElements(By.xpath("//iframe[startswith(getAttribute('src','consent.google.com')"));
	//driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
	//driver.switchTo().defaultContent();
	
	////*[@id="CXQnmb"]/div/div
	
	////*[@id="L2AGLb"]/div	
	  }
	
	@Test
	public void linkTesting1() throws Exception 
	{
		
		  String expval = "Singapore Airlines Official Website | Book International Flight Tickets";
		 // driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		  driver.findElement(By.xpath("//*[@id=\"hwidget\"]/div[2]/div[1]/div[1]/li[3]/div/div/span")).click();
			/*
			 * WebDriverWait wait = new WebDriverWait(driver, 30);
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
			 * "//*[@id=\"gb\"]/div/div[1]/div/div[2]/a"))).isDisplayed();
			 * 
			 * driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click
			 * ();
			 */
		  String actval = driver.getTitle();
		  System.out.println(actval);
		  Assert.assertEquals(actval, expval);
		 
		
	}
  

	@AfterMethod
	public void afterMethod() 
	{
		
		driver.close();
		
	}

}
