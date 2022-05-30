package test.launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutomation2 extends BaseTestPractice {

	//public static WebDriver driver;
	public static PageFactoryPractice page;
	
	public static void main(String[] args) throws Exception {
		
		init();
		launch("chromebrowser");
		navigateUrl("automationpracticeurl");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		page = new PageFactoryPractice();
		page.getSignIn().click();
		//driver.get("http://automationpractice.com/index.php");
		//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		page.getUserName().sendKeys(p.getProperty("automationpracticeusername"));
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("h88031@yahoo.com");
		page.getPassWord().sendKeys(p.getProperty("automationpracticepw"));
		//driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Barhatta2440");
		page.getSubmitBtn().click();
		//driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]")).click();

	}

}
