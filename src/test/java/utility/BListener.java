package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests.BaseTest;

public class BListener extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			BScreenShot.CaptureScreenshot(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
