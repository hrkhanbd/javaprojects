package testNG;

import org.testng.annotations.Test;

import test.launcher.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RadioButton1 extends BaseTest {
	
	//WebDriver driver;
	@BeforeMethod(groups = {"regression", "smoke"})
	@Parameters("browser")
	public void beforeMethod(String bType) {
		launch(bType);
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		//driver.manage().window().maximize();
	  }
	@Test(groups = {"regression", "smoke"})
	public void radioButtonTest() {
		
		List<WebElement> rbutton=driver.findElements(By.xpath("//td[@class='table5']/input[@type='radio']"));
		for(int i=0;i<rbutton.size();i++)
			{
				System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
			}
		
	
  }
 

	@AfterMethod(groups = {"regression", "smoke"})
	public void afterMethod() {
		
	driver.close();
  }

}
