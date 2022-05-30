package testNGPractice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TNG_002 {
	
	WebDriver driver;
	@BeforeMethod
	public void startup() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		
	  }
	
	@Test
	public void testmethod() 
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dishwasher");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
  }
  
	@AfterMethod
	public void closeTest() 
		{
		driver.close();
  }

}
