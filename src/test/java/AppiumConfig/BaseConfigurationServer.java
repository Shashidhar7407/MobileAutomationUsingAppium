package AppiumConfig;
import PageObjectModelApp.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseConfigurationServer {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public BervistayPOM object1;

	@BeforeTest
	public void configureAppium() throws MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("app", "C:\\Users\\shash\\eclipse-workspace\\BrevistayAutomation\\src\\test\\java\\TestResources\\Brevistay.apk");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("deviceName", "Shashi Pixel 3A");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 object1 = new BervistayPOM(driver);
		
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	public void ScrollTOTextElement(String TargetName) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+TargetName+"\"));"));
		
	}
	
	public void longClickonElement(WebElement LongClickElementName) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) LongClickElementName).getId()
			));
	}
	
	public void SwipeElementtoDirection(WebElement SwipeElementName, String directionToSwipe) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				  "elementId", ((RemoteWebElement) SwipeElementName).getId(),
			    "direction", directionToSwipe,
			    "percent", 0.75
			));
	}
	
	public void DragAndDropAnElement(WebElement TargetElementToDrag, int DestinationElementXCordinate, int DestinationElementYCordinate) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) TargetElementToDrag).getId(),
			    "endX", DestinationElementXCordinate,
			    "endY", DestinationElementYCordinate
			));
		
	}
	
	public void AppPackaging(String appPackage, String appActivity) {
		Activity appPackageActivity=new Activity(appPackage, appActivity);
		driver.startActivity(appPackageActivity);
	}
	

}
