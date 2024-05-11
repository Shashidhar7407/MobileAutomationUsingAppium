package AppiumConfig;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseConfigurationServer {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeTest
	public void configureAppium() throws MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("app", "C:\\Users\\shash\\eclipse-workspace\\BrevistayAutomation\\src\\test\\java\\TestResources\\Brevistay.apk");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("deviceName", "Shashi Pixel 3A");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
