package teampagetesting;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import basetest.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class TestingOfTeamPage extends BaseTest {
	
	@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
	
	}
	@Test
	public void seeMyteam() {
	
	
	 FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
             .withTimeout(Duration.ofSeconds(10))
             .pollingEvery(Duration.ofMillis(500))
             .ignoring(Exception.class);
	

     WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"svg-icon\")")));
  element1.click(); 
  WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Team\")")));
  element2.click(); 
 
  
}
	@Test
	public void seeAllMembers() {
		 FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
	             .withTimeout(Duration.ofSeconds(50))
	             .pollingEvery(Duration.ofMillis(500))
	             .ignoring(Exception.class);

	     WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"svg-icon\")")));
	  element1.click(); 
	  WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Team\")")));
	  element2.click(); 
	  WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"All Members\")")));
	  element3.click(); 
	
}
}