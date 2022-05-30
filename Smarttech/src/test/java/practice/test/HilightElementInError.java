package practice.test;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HilightElementInError {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		//Storing the text of the heading in a string
		
		WebElement elementNode = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[3]"));
		String linkHeading = elementNode.getText();
		
		System.out.println("The expected heading is ---"+linkHeading);
		
		// Test
		
		String expectedHeading = "Customer service";
		if(expectedHeading.contentEquals(linkHeading))
			System.out.println("The expected heading is same as actual heading --- "+ linkHeading);
		else {
			System.out.println("The expected heading doesn't match the actual heading --- " + linkHeading);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].style.border='3px solid red'",elementNode);
			Thread.sleep(1000);
			
			//capture screenshot
			
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(file, new File("C:\\Users\\hkhan\\eclipse-workspace\\Smarttech\\Screenshot\\HighlightElement.png"), true);
			FileHandler.copy(file, new File("C:\\Users\\hkhan\\eclipse-workspace\\Smarttech\\Screenshot\\HighlightElement.png"));
			
			
			
			
		}
		
		// close driver
		
		//driver.close();
		

	}

}
