package test.launcher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryPractice extends BaseTestPractice
{
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signIn;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@id=\"SubmitLogin\"]")
	private WebElement submitBtn;
	
	public PageFactoryPractice() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSignIn() {
		return signIn;
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
