package com.Automation.POM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Baseclass.automation.Baseautomation;
public class Myaccountpage extends Signinpage{
	public Myaccountpage() {
		PageFactory.initElements(driver1,this);
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement searchbox;
	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement searchbutton;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement option;
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement option1;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocartbutton;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[2]")
	private WebElement checkout;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement checkout2;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[7]")
	private WebElement checkout3;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement checkout4;
	@FindBy(xpath="//input[@value='1']")
	private WebElement checkbox;
	public WebElement getOption() {
		return option;
	}
	public void setOption(WebElement option) {
		this.option = option;
	}
	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
	public WebElement getOption1() {
		return option1;
	}
	public void setOption1(WebElement option1) {
		this.option1 = option1;
	}
	public void setAddtocartbutton(WebElement addtocartbutton) {
		this.addtocartbutton = addtocartbutton;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}
	public WebElement getCheckout2() {
		return checkout2;
	}
	public void setCheckout2(WebElement checkout2) {
		this.checkout2 = checkout2;
	}
	public WebElement getCheckout3() {
		return checkout3;
	}
	public void setCheckout3(WebElement checkout3) {
		this.checkout3 = checkout3;
	}
	public WebElement getCheckout4() {
		return checkout4;
	}
	public void setCheckout4(WebElement checkout4) {
		this.checkout4 = checkout4;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}
	public void setSearchbox(WebElement searchbox) {
		this.searchbox = searchbox;
	}
	public void setSearchbutton(WebElement searchbutton) {
		this.searchbutton = searchbutton;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
}
