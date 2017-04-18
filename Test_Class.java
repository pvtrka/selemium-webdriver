import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Class {
	
		 
		 public static void main(String[] args) {
		       // WebDriver driver;
		       System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		       WebDriver driver =new FirefoxDriver();
		        driver.get("http://sjdev01.farrms.us/TRMTracker_Branch/trmclient/");
		       // driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		        
		        WebElement Username = driver.findElement(By.name("txt_user_name"));
		    	WebElement password = driver.findElement(By.name("txt_password"));
		    	WebElement LOGIN = driver.findElement(By.name("Login"));
		     
		    	Username.sendKeys("farrms_admin");
		    	password.sendKeys("upper@@");
		    	LOGIN.click();
		    	
	
	}
}



