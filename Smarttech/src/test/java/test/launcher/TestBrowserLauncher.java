package test.launcher;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowserLauncher {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
			
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("user-data-dir=C:\\Users\\hkhan\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		//options.addArguments("--start-maximized");
		
		driver = new ChromeDriver();
				
		driver.get("https://www.amazon.in/");		
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		 * Thread.sleep(3000); driver.findElement(By.name("field-keywords")).clear();
		 * Thread.sleep(3000);
		 * driver.findElement(By.className("nav-input")).sendKeys("iphone");
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
		 * Thread.sleep(3000);
		 * driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(
		 * "Samgsung");
		 * driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		 * //driver.findElement(By.linkText("Customer Service")).click();
		 * driver.findElement(By.partialLinkText("tomer Serv")).click();
		 */
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++) {
			
			if(!links.get(i).getText().isEmpty())			
			System.out.println(links.get(i).getText());
		}
			
		

	}
	

}
