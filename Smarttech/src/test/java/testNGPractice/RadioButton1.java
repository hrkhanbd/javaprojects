package testNGPractice;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RadioButton1  {
	
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://echoecho.com/htmlforms10.htm");
	driver.manage().window().maximize();
	  }
	@Test
	public void radioButtonTest() {
		
		List<WebElement> rbutton=driver.findElements(By.xpath("//td[@class='table5']/input[@type='radio']"));
		for(int i=0;i<rbutton.size();i++)
			{
				System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
			}
		
	
  }
 

	@AfterMethod
	public void afterMethod() {
		
	driver.close();
  }

}
