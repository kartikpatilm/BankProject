package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.BLoginPage;
@Listeners(utility.BListener.class) 
public class BLoginTest extends BaseTest{
	//WebDriver driver;
	BLoginPage BLP;
	@BeforeClass
	public void init() {
	   
		//5object create
		BLP=new BLoginPage(driver);
	}
	@Test
	public void login() {
		BLP.EnterUserIdBox("mngr473381");
		BLP.EnterPasswordBox("quhYdEd");
		BLP.ClickLoginBox();
	}
	@Test
	public void verifyTitle() {
		Assert.assertFalse(driver.getTitle().contains("Guru99"),"Page title does not matched");
		
	}
	@Test
	public void printTitle() {
		String title=driver.getTitle();	
		System.out.println("Title of WebPage : "+title);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}











