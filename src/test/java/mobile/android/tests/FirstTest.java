package mobile.android.tests;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	private AppiumDriver driver;
	private WebDriver webDriver;
	
	
	@BeforeTest
	public void setUp() throws Exception {
		 File classpathRoot = new File(System.getProperty("user.dir"));
		 File appDir = new File(classpathRoot, "/src/test/resources/apps");
		 File app = new File(appDir, "Babylon_Android-alliantsStage-350.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		 capabilities.setCapability("deviceName","Android Emulator");
		 capabilities.setCapability("platformVersion", "4.4");
		 capabilities.setCapability("platformName","Android");
		 capabilities.setCapability("app", app.getAbsolutePath());
		 capabilities.setCapability("appPackage", "com.babylon");
		 capabilities.setCapability("appActivity", "activity.AuthorizationActivity");
		 driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 webDriver = new FirefoxDriver();
		 
		 webDriver.get("https://www.fitbit.com");
	}
	
	
	@AfterTest
	public void tearDown() throws Exception {
	driver.quit();
	}
	
	@Test
	public void apiDemo(){
	driver.findElement(By.id("com.babylon:id/sign_in_text_view")).click();
	driver.findElement(By.id("com.babylon:id/emailEdt")).sendKeys("kholodniy.cpd@gmail.com");
	driver.findElement(By.id("com.babylon:id/passwordEdt")).sendKeys("password");
	driver.findElement(By.id("com.babylon:id/signInBtn")).click();
	}
}
