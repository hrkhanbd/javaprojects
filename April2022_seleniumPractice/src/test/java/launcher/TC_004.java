package launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_004 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--incognito");
		option.addArguments("user-data-dir=C:\\Users\\hkhan\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		option.addArguments("--start-maximized");
		option.addArguments("--disable-notifications");
		//option.addArguments("--ignore-certificate-errors-spki-list");
		
		
		//driver = new ChromeDriver();
		driver = new ChromeDriver(option);
		
		driver.navigate().to("https://www.icicibank.com/");
		

	}

}
