package com.Automation.Testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.automation.Baseautomation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions( 
 
		features="src\\test\\java\\com\\Automation\\feature\\Automation.feature",
		glue= {"com.Automation.Stepdefinition"}
//tags= "@Sc10"		
		)
public class Testrunner  extends Baseautomation{
	public static WebDriver driver1;
@BeforeClass
	public static void initialization() throws Exception {

 getBrowser("chrome");
getUrl("http://automationpractice.com/index.php");
	}	
@AfterClass
public  static void quit() {
	driver1.quit();
}
}
