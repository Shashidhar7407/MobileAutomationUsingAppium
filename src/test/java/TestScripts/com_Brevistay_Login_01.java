package TestScripts;

import java.sql.Driver;

import org.testng.annotations.Test;

import AppiumConfig.*;
import PageObjectModelApp.BervistayPOM;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class com_Brevistay_Login_01 extends BaseConfigurationServer {
	@Test
	public void LoginApplication() throws InterruptedException {
		System.out.println("Performing Login action");
		object1.ClickgetStartedArrow();
		object1.ClickgetStartedArrow();
		object1.ClickgetStartedArrowNext1();
		Thread.sleep(5000);
		object1.EnterMobileNumber().click();
		object1.EnterMobileNumber().sendKeys("9676218302");
		object1.ClickUsePasswordInsteadButton().click();
		Thread.sleep(5000);
		object1.EnterPassword().click();
		object1.EnterPassword().sendKeys("Shashi@8131#");
		Thread.sleep(7000);
		object1.clickProceedButton().click();
		Thread.sleep(15000);

		/*driver.findElement(AppiumBy.id("com.brevistay.customer:id/onBoard_arrow")).click();
		driver.findElement(AppiumBy.id("com.brevistay.customer:id/onBoard_arrow")).click();
		driver.findElement(AppiumBy.id("com.brevistay.customer:id/onBoard_arrowNext")).click();
		Thread.sleep(7000);
		driver.findElement(AppiumBy.id("com.brevistay.customer:id/numEditText")).click();
		driver.findElement(AppiumBy.id("com.brevistay.customer:id/numEditText")).sendKeys("9676218302");
		driver.findElement(AppiumBy.id("com.brevistay.customer:id/option2Btn")).click();
		driver.findElement(AppiumBy.id("com.brevistay.customer:id/passEditText")).sendKeys("Shashi@8131#");
		Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.brevistay.customer:id/progressBtnYellow_txt")).click();
		// driver.findElement(AppiumBy.id("com.brevistay.customer:id/loginSkipTxt")).click();
		Thread.sleep(15000);*/

	}

}
