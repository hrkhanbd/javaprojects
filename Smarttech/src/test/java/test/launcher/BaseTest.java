package test.launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void launch(String browser)
	{
		if (browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
						
		}
		
		else if(browser.equals("firefox")) 
		
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\hkhan\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
							
			FirefoxOptions option = new FirefoxOptions();						
			option.addPreference("dom.webnotifications.enabled", false);
			driver = new FirefoxDriver(option);
			
		}
			
		
		
		
		
	}
	
	
}
