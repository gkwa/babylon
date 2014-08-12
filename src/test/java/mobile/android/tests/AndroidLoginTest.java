package mobile.android.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AndroidLoginTest extends AndroidTestBase {
	
@Test	
public void performLogin (){
	appiumDriver.findElement(By.id("com.babylon:id/sign_in_text_view")).click();
	appiumDriver.findElement(By.id("com.babylon:id/emailEdt")).sendKeys("kholodniy.cpd@gmail.com");
	appiumDriver.findElement(By.id("com.babylon:id/passwordEdt")).sendKeys("password");
	appiumDriver.findElement(By.id("com.babylon:id/signInBtn")).click();
}
	

}
