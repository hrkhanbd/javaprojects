package switches;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow1 {
	
	public static void main(String[] args) throws Exception {
		
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com");
		
		
		//get the window handle
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		//get the window title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//Thread.sleep(10000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='slick-slide00']/div/child::div[@class='d-img image-media']/a/img"))).isDisplayed(); 
		//{
			
			//driver.findElement(By.xpath("//div[@class='banner-slider i-home-banner desktop slick-initialized slick-slider slick-dotted']/button[contains(text(),'Next')]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='slick-slide00']/div/child::div[@class='d-img image-media']/a/img"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		
		// Get the window handles
		
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> nwinds = new ArrayList<String>(windows);
		
		for( String i:nwinds) {
			
			System.out.println(i);
		}
		
		//Switch window to child
		
		driver.switchTo().window(nwinds.get(1));
		
		//Title for second window
		
		String title1= driver.getTitle();
		System.out.println(title1);
		
		driver.close();
		
		// go back to parent window
		
		driver.switchTo().window(nwinds.get(0));
		
		String title2= driver.getTitle();
		System.out.println(title2);
		
		
		
		
	}
	}
	// "//img[@alt='PL'][@class='lazy loaded'][@src='/managed-assets/images/personal/home-page-banners/Desktop/dream-about-it-own-d.jpg']"

	//different way to write xpath

		// //div[@id='slick-slide00']/div/child::div[@class='d-img image-media']/a/img
		//*[@id=\"slick-slide00\"]/div/div[1]/a/img
		
		//driver.findElement(By.xpath("//*[@id=\"slick-slide00\"]/div/div[1]/a/img")).sendKeys(Keys.ENTER);
		//}
		
		//driver.findElement(By.xpath("//*[@id=\"slick-slide00\"]/div/div[1]/a/img")).sendKeys(Keys.ENTER);

