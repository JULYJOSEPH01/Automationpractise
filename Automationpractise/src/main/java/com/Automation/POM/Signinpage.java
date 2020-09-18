package com.Automation.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.automation.Baseautomation;

public class Signinpage extends Baseautomation{
	public Signinpage() {
		PageFactory.initElements(driver1, this);
	}
@FindBy(xpath="//a[@title='Log in to your customer account']")
private WebElement Signin;
@FindBy(xpath="//input[@id='email']")
private WebElement Email;
@FindBy(xpath="//input[@id='passwd']")
private WebElement pw;
@FindBy(xpath="(//button[@type='submit'])[3]")
private WebElement Signinbutton;
public WebElement getSignin() {
	return Signin;
}
public WebElement getEmail() {
	return Email;
}
public WebElement getPw() {
	return pw;
}
public WebElement getSigninbutton() {
	return Signinbutton;
}



}

