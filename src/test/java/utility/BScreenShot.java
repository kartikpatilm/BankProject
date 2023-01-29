package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class BScreenShot {

	public static void CaptureScreenshot(WebDriver driver,String name) throws IOException {
		//Step 1 Location TO store
	String path=System.getProperty("user.dir")+"\\BScreenShot\\"+name+"_"+getCurrentDate()+".jpg";          
	//2 using take screenshot reference
	TakesScreenshot tss=(TakesScreenshot) driver;
	//3
	File sourceFile=tss.getScreenshotAs(OutputType.FILE);
	//4using file object
	File destinationFile=new File(path);
	//step 5 by using file handeler
	FileHandler.copy(sourceFile, destinationFile);
  System.out.println("ScreenShot Capture successfully");	
	}
	public static String getCurrentDate() {
		DateFormat date =new SimpleDateFormat("DD-MM-YYYY hh-mm-ss");
     Calendar cal=Calendar.getInstance();
     String currentDate =date.format(cal.getTime());
	return currentDate;
	
	}
	/*
	 * public static void main(String[] args) {
	 * System.out.println(BScreenShot.getCurrentDate()); }
	 */
}

