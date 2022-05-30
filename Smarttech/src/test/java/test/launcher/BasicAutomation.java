package test.launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutomation extends BaseTestPractice {

	
	public static PageFactoryPractice page;
	
	public static void main(String[] args) throws Exception {
		
		init();
		launch("firefoxbrowser");
		navigateUrl("automationpracticeurl");
				
		
		page = new PageFactoryPractice();
		page.getSignIn().click();
		page.getUserName().sendKeys(p.getProperty("automationpracticeusername"));
		page.getPassWord().sendKeys(p.getProperty("automationpracticepw"));
		page.getSubmitBtn().click();
		
		
		//driverClose();

	}

}
