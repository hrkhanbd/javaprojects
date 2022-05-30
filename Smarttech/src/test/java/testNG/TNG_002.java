package testNG;

import org.testng.annotations.Test;

import test.launcher.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest {
	
  //WebDriver driver;
  
  @BeforeMethod(groups = {"regression", "sanity"})
  @Parameters("browser")
  public void startup(String bType)
  {
	launch(bType);
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
	//driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	  
  }
  
  @Test(groups = {"regression", "sanity"})
  public void amazon() 
  {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
	  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	  
  }

  @AfterMethod(groups = {"regression", "sanity"})
  public void endprocess() 
  {
	driver.close(); 
	  
  }

}
