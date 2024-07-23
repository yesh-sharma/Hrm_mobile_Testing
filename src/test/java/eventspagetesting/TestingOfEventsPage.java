package eventspagetesting;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import basetest.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class TestingOfEventsPage extends BaseTest {

	
	@Test
	 public void seeAllProjects() throws InterruptedException {
		 
		 
	        FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofMillis(500))
	                .ignoring(Exception.class);

	        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"svg-icon\")")));
	     element1.click(); 

	      
	     WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Events\")")));
	     element2.click(); 

	       
	
	
	
	
	
	}	
	
	
	
}
