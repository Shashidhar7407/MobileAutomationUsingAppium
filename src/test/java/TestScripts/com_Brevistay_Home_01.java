package TestScripts;
import AppiumConfig.*;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class com_Brevistay_Home_01 extends com_Brevistay_Login_01 {
	@Test
	public void AutomateHomeScreen() throws InterruptedException {
		System.out.println("Entered to homescreen");
		Thread.sleep(10000);
		WebElement titleHomepageString=driver.findElement(AppiumBy.id("com.brevistay.customer:id/textView_Offer"));
		String nameTitle=titleHomepageString.getText();
		System.out.println(nameTitle);
		Thread.sleep(5000);
		object1.SwipeElementtoDirection(titleHomepageString, "up");
		Thread.sleep(5000);
		
		
		
		
	}
	

}
