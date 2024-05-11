package AppiumConfig;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;

public class GesturesActions extends BaseConfigurationServer {
	
	//creating various gestures of mobile
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
