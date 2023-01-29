package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLoginPage {
	//webElement find out 
	
	@FindBy (xpath="//input[@name='uid']")
    WebElement UserIdBox;
	@FindBy (xpath="//input[@name='password']")
	WebElement PasswordBox;
	@FindBy (xpath="//input[@value='LOGIN']")
	WebElement LoginBox;
	
	//Constructor create
	public BLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void EnterUserIdBox(String Id) {
		if(UserIdBox.isEnabled()) {
			UserIdBox.sendKeys(Id);
		}
	}
	public void EnterPasswordBox(String pass) {
		if(PasswordBox.isEnabled()) {
			PasswordBox.sendKeys(pass);
		}
	}
	public void ClickLoginBox() {
		if(LoginBox.isDisplayed()){
			LoginBox.click();
		}
	}
}
