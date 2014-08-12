package mobile.android.tests;

import io.appium.java_client.AppiumDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AndroidTestBase {
	protected AppiumDriver appiumDriver;
	private AndroidHelper appHelper;
	
	
	@BeforeTest
	public void setUp() throws Exception {
		appHelper = new AndroidHelper();
		appHelper.start();
		appiumDriver = appHelper.getAppiumDriver();
		
		
		
		
	}
	
	
	@AfterTest
	public void tearDown() throws Exception {
		appHelper.stop();
	}
	
	
	

}
