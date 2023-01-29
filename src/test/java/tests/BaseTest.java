package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	@BeforeSuite
	public void initilization() {
		//0
		WebDriverManager.chromedriver().setup();
		//1
		driver=new ChromeDriver();
		//2
		driver.manage().window().maximize();
		//3
		driver.get("https://demo.guru99.com/V2/");
		//4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
      @AfterSuite
      public void TearDown() {
    	  driver.close();
      }
}
