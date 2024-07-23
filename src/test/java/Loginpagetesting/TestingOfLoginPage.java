package Loginpagetesting;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import basetest.BaseTest;
import io.appium.java_client.AppiumBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;

public class TestingOfLoginPage {
	public AndroidDriver driver;
	
	@BeforeMethod
	   public void setup() throws InterruptedException {
		   
		   try {
   			String appiumServerUrl = "http://127.0.0.1:4723";
   			DesiredCapabilities dc = new DesiredCapabilities();

   			dc.setCapability("platformName", "Android");
   			dc.setCapability("appium:automationName", "uiautomator2");
   			dc.setCapability("appium:app", System.getProperty("user.dir") + "/apps/app-release.apk");

   			driver = new AndroidDriver(new URL(appiumServerUrl), dc);
   		} catch (Exception e) {
   			e.printStackTrace();
   		}
   		
	
	}
	
	

    @Test
    public void loginWithRightCredentials() throws InterruptedException {
    	FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(500))
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
    	      
      
        // Wait for and click on the element with className "com.horcrux.svg.PathView" and instance 0
        WebElement element4  = wait.until(ExpectedConditions
               
      .elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"toastText1\")")));
        System.out.println("successfull login =>" +element4.getText());
     

}
    
    
    
    
    

    @Test
    public void loginWithWrongCredentials() throws InterruptedException {
    	FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofMillis(2000))
                .ignoring(Exception.class);
        
    		  WebElement element1 = wait.until(ExpectedConditions
    	                .visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Email\")")));
    	        element1.sendKeys("shalini@zasyasolutions.com");
    		    WebElement element2 = wait.until(ExpectedConditions
    	                .visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Password\")")));
    		    element2.sendKeys("password@1231");
    		    WebElement element3 = wait.until(ExpectedConditions
    	                .visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Login\")")));
    	        element3.click();
    	      
      
        // Wait for and click on the element with className "com.horcrux.svg.PathView" and instance 0
        WebElement element4  = wait.until(ExpectedConditions
               
      .elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"toastText1\")")));
        System.out.println("unsuccessfull login =>" +element4.getText());
     

    
    
    
    
    
    
    }   
    
}
