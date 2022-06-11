package launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncher {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.className("dropDownContainer d-none")).click();
		driver.findElement(By.className("login")).click();
		//driver.findElement(By.name("agree")).click();
		driver.findElement(By.id("email")).sendKeys("h88031@yahoo.com");
		driver.findElement(By.name("passwd")).sendKeys("Barhatta2440");
		//driver.findElement(By.className("icon-lock left")).click();
		driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
		
		//WebDriverManager.firefoxdriver().setup();		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\hkhan\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
		
		//driver = new FirefoxDriver();
		//driver.navigate().to("https://bestbuy.com");
		
		//webdriver.ie.driver
		//webdriver.edge.driver
		//webdriver interface is the patent for all Drivers classes like ChromeDriver

	}

}
