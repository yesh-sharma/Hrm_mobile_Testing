package basetest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

	public AndroidDriver driver;

	@BeforeMethod

	public void setUp() throws InterruptedException {
		try {
			String appiumServerUrl = "http://127.0.0.1:4723";
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("appium:automationName", "UiAutomator2");
			dc.setCapability("appium:app", System.getProperty("user.dir") + "/apps/app-release.apk");
		
			driver = new AndroidDriver(new URL(appiumServerUrl), dc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofMillis(2000))
                .ignoring(Exception.class);

	    WebElement element1 = wait.until(ExpectedConditions
                .visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Email\")")));
        element1.sendKeys("shalini@zasyasolutions.com");
	    WebElement element2 = wait.until(ExpectedConditions
                .visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Password\")")));
	    element2.sendKeys("password@123");
	    WebElement element3 = wait.until(ExpectedConditions
                .visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Login\")")));
        element3.click();
        Thread.sleep(8000);

		
		
	}
	

	  @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit(); 
	        }}
}
