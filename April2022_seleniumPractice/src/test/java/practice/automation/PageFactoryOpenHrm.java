package practice.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryOpenHrm extends TestBase {
	
		
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement submitBtn;
	
public PageFactoryOpenHrm()  {
		
		PageFactory.initElements(driver, this);
	}
	
			
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPassWord() {
		return passWord;
	}
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
	

}
