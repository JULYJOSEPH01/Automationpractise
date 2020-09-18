package com.Baseclass.automation;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Baseautomation {
	public static WebDriver driver1;
	  public static final String AUTOMATE_USERNAME = "julyjoseph1";
	  public static final String AUTOMATE_ACCESS_KEY = "A9y8szFcovxtK2QzMtzx";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + 
	  AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static  void getBrowser(String browserName) throws Exception {	
		try {	
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\com\\Automation\\drivers\\chromedriver.exe");
	driver1= new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\doniv08\\eclipse-workspace\\seljava\\driver\\chromedriver (2).exe");
		driver1= new FirefoxDriver();	
	}
	else if(browserName.equalsIgnoreCase("InternetExplorer")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\doniv08\\eclipse-workspace\\seljava\\driver\\chromedriver (2).exe");
		driver1= new InternetExplorerDriver();
	}
	else if(browserName.equalsIgnoreCase("browserstack_web_mob")) {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserName", "Android");
	    caps.setCapability("device", "Samsung Galaxy S9");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "8.0");
	    WebDriver driver1 = new RemoteWebDriver(new java.net.URL(URL), caps);
	}
	driver1.manage().window().maximize();
	driver1.manage().deleteAllCookies();
	}
	 catch (Exception e) {
		 System.out.println("invalid browser");
		}
	driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}		
	
public static void getUrl(String url) {
	driver1.get(url);
}
public static  String title(String title) {
driver1.get(title);	
return title;	
}
public static void wait4visibilityelement(WebElement element) {
	WebDriverWait wb= new WebDriverWait(driver1,30) ;
		wb.until(ExpectedConditions.visibilityOf(element));
}
public static void sendkeys(WebElement element,String value) {
	wait4visibilityelement(element);
	boolean displayed = element.isDisplayed();
	boolean enabled = element.isEnabled();
	if(displayed&&enabled) {
		element.clear();
		element.sendKeys(value);
	}
}
public static void clickOnElement(WebElement element) {
	wait4visibilityelement(element);
	boolean displayed = element.isDisplayed();
	if(displayed) {
	element.click();
}
}
public static void toCaptureScreeSshot(String filename) throws IOException {
File f= new File("C:\\Users\\doniv08\\git\\seliniumproject\\Cucmberproject\\src\\test\\resource\\Screenshot\\"+filename+".png");
TakesScreenshot ts= (TakesScreenshot)driver1;
File temp= ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(temp,f);
}
public static void mouseover(WebElement element) {
	wait4visibilityelement(element);
	boolean displayed = element.isDisplayed();
	if(displayed) {	
Actions ac= new Actions(driver1);
ac.moveToElement(element).build().perform();
}
}
public static void doubleclick(WebElement element) {
	wait4visibilityelement(element);
	boolean displayed = element.isDisplayed();
	if(displayed) {	
Actions ac= new Actions(driver1);
ac.doubleClick(element).build().perform();
}
}
	public static void select(WebElement element,String option) {
		Select category= new Select(element );
		category.selectByValue(option);
}

	public static void alert(WebElement element) throws Exception {
		try {
		Alert a = driver1.switchTo().alert();
			a.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to accept the alert");
		}
	}
	public static void quit() {
	driver1.quit();
	}

	public static boolean elementIsDisplayed(WebElement element) throws Exception {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is not displayed");
		}
		
	}

}



