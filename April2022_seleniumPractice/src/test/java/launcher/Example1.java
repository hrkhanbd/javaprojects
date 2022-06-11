package launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Documents\\Computer\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/nse");
		driver.manage().window().maximize();
		//String name = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[16]/td[1]")).getText();
		//String price = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[16]/td[3]")).getText();
		//System.out.println(price +":"+ name);
		String price = driver.findElement(By.xpath("//a[contains(text(),'Global Education')]/parent::td/following-sibling::td[3]/child::font")).getText();
		String name = driver.findElement(By.xpath("//a[contains(text(),'Global Education')]/parent::td/child::a")).getText();
		System.out.println(name + ":" + price);

	}

}
