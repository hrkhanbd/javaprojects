package practice.automation;




public class OpenHrm extends TestBase {
	
	public static PageFactoryOpenHrm page;

	public static void main(String[] args) throws Exception {
		
		init();
		launch("chromebrowser");
		navigateUrl("hrmurl");
				
		page = new PageFactoryOpenHrm();
		
		page.getUserName().sendKeys(p.getProperty("openhrmun"));
		page.getPassWord().sendKeys(p.getProperty("openhrmpw"));
		page.getSubmitBtn().click();
		
		
		driverClose();

	}

}
