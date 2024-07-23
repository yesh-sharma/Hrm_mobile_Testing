package projectpagetesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import basetest.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class TestingOfProjectsPage extends BaseTest {
	@Test
	 public void dailyActivitypageTesting() throws InterruptedException {
		 
		 
	        FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofMillis(500))
	                .ignoring(Exception.class);

	        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"svg-icon\")")));
	     element1.click(); 

	        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator(" new UiSelector().text(\"Projects\")")));
	     element2.click(); 
	      Thread.sleep(2000);
	     
	        // Take a screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        // Save the screenshot to a file
	        try {
	            FileUtils.copyFile(screenshot, new File("/Users/yeshsharma/Documents/hrm\\ mobile\\ app\\ screenshotes/screenshot.png"
	            		));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        

}   
	
	
	
	@Test
	 public void seeAllProjects() throws InterruptedException {
		 
		 
	        FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofMillis(500))
	                .ignoring(Exception.class);

	        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"svg-icon\")")));
	     element1.click(); 

	      
	     WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Projects\").instance(2)")));
	     element2.click(); 

	       
	
	
	
	
	
	
	
	
	}
	
	
	
}