package test.launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestPractice {
	
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static Properties p;
	
	public static void init() throws Exception {
		
		FileInputStream fis = new FileInputStream(projectPath+"\\src\\test\\resources\\data.properties");
		p = new Properties();
		p.load(fis);
		//String e = p.getProperty("chromebrowser");
		//System.out.println(e);
	}
	
	public static void launch(String browserkey)
	{
		if (p.getProperty(browserkey).equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
						
		}
		
		else if(p.getProperty(browserkey).equals("firefox")) 
		
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\hkhan\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
							
			FirefoxOptions option = new FirefoxOptions();						
			option.addPreference("dom.webnotifications.enabled", false);
			driver = new FirefoxDriver(option);
			
		}
				
	}
	
	public static void navigateUrl(String url) 
	{
		driver.get(p.getProperty(url));
		//driver.navigate().to(p.getProperty(url));
		
	}
	
	public static void driverClose() {
		
		driver.close();
	}
	
}
