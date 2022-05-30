package practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static void main(String[] args) throws Exception {
		
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
		//ChromeOption class
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
				
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//div[@class='nav-search-scope nav-sprite']/child::select/option[11]
		driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']/child::select/option[11]")).click();
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.name("field-keywords")).clear();
		
		
		
		
		
		
		/*
		 * WebDriverManager.firefoxdriver().setup(); FirefoxDriver driver1 = new
		 * FirefoxDriver(); driver1.manage().window().maximize();
		 * driver1.navigate().to("https://www.prothomalo.com/");
		 */
		
		
		

	}

}
