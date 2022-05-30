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

public class HighLightElement {
	
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		// store the webelement
		WebElement element_node = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[3]"));
		// pass the stored webelement to javascript executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='2px solid red'", element_node);
		Thread.sleep(1000);
		// Capture ScreenShot
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// store the converted file as Image on D driver
		FileUtils.copyFile(file, new File("C:\\Users\\hkhan\\eclipse-workspace\\Smarttech\\Screenshot\\HighlightElement.png"), true);
	}

}
