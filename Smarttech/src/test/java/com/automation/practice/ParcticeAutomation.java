package com.automation.practice;

public class ParcticeAutomation extends TestBase {
	
	public static PageFactoryPracticeTest page; 

	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		navigateUrl("automationpracticeurl");
		
		page =new PageFactoryPracticeTest();
		
		page.getSignIn().click();
		page.getUserName().sendKeys(p.getProperty("automationpracticeusername"));
		page.getPassWord().sendKeys(p.getProperty("automationpracticepw"));
		page.getSubmitBtn().click();
		
		driverClose();	
		

	}

}
