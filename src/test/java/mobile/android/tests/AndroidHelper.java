package mobile.android.tests;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AndroidHelper {
	protected AppiumDriver appiumDriver;
	private String apkName = "Babylon_Android-alliantsStage-350.apk";
	private String deviceName = "Android Emulator";
	private String platformVersion = "4.4";
	private String appPackage = "com.babylon";
	private String appActivity = "activity.AuthorizationActivity";
	

	public void start() throws Exception {
		
		 File classpathRoot = new File(System.getProperty("user.dir"));
		 File appDir = new File(classpathRoot, "/src/test/resources/apps");
		 File app = new File(appDir, apkName);
		 
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		 capabilities.setCapability("deviceName", deviceName);
		 capabilities.setCapability("platformVersion", platformVersion);
		 capabilities.setCapability("platformName","Android");
		 capabilities.setCapability("app", app.getAbsolutePath());
		 capabilities.setCapability("appPackage", appPackage);
		 capabilities.setCapability("appActivity", appActivity);
		 appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	

	public void stop() throws Exception {
		appiumDriver.quit();
	}
	
	
	public AppiumDriver getAppiumDriver(){
		return appiumDriver;
	}
	
	
	
	
	
	
	
}
