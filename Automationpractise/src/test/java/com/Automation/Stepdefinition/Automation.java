package com.Automation.Stepdefinition;
import com.Automation.POM.Myaccountpage;
import com.Automation.POM.Signinpage;
import com.Baseclass.automation.Baseautomation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Automation extends Baseautomation {
public static Signinpage sp;		
public static Myaccountpage mp;
@Given("User signin the application")
public void user_signin_the_application() throws InterruptedException {
	Thread.sleep(3000);
	 sp=new Signinpage();
	 mp= new Myaccountpage();
	 
	
}
@Then("verify user should  enter {string} in specific textbox")
public void verify_user_should_enter_in_specific_textbox(String string) {
	wait4visibilityelement(sp.getSignin());
	clickOnElement(sp.getSignin());
	 sendkeys(sp. getEmail(),string);
}
@Then("Verify user shoud enter {string} in textbox")
public void verify_user_shoud_enter_in_textbox(String string) {
	  sendkeys(sp.getPw(),string);
}
@Then("Verify user should click on the signin button")
public void verify_user_should_click_on_the_signin_button() {
	 clickOnElement(sp.getSigninbutton());
}

@Then("Verify user should click on search box")
public void verify_user_should_click_on_search_box() throws InterruptedException {
	Thread.sleep(3000);
	 mp= new Myaccountpage();
	  clickOnElement(mp.getSearchbox());
}
@Then("Verify user should enter data in text field")
public void verify_user_should_enter_data_in_text_field() throws InterruptedException {
	sendkeys(mp.getSearchbox(),"DRESSES");
	Thread .sleep(3000);
	//quit();
}
@Then("Verify user should click on search button")
public void verify_user_should_click_on_search_button() {
	clickOnElement(mp.getSearchbutton());
}


@When("Verify user should enter  into new page")
public void verify_user_should_enter_into_new_page() {
}












	 @Then("Verify user should clik on add to cart button")
	 public void verify_user_should_clik_on_add_to_cart_button() throws InterruptedException {
		 Thread.sleep(3000);
		
		 mp=new Myaccountpage();
		 wait4visibilityelement(mp.getOption());
		 mouseover( mp.getOption1());
		 Thread.sleep(10000);
		 clickOnElement(mp.getOption1());
			clickOnElement(mp.getAddtocartbutton());
	    
	 }



	 @Then("Verify user should click on proceed")
	 public void verify_user_should_click_on_proceed() {
	 
			clickOnElement(mp.getCheckout());
	 }
	 @Then("Verify user should click on proceed in address")
	 public void verify_user_should_click_on_proceed_in_address() {
		 clickOnElement(mp.getCheckout2());
		 clickOnElement(mp.getCheckout3());
		
	 }

		

		 @When("user should purchased sucessfully")
		 public void user_should_purchased_sucessfully() {
		 }






			 @When("user  should purchased successfully")
			 public void user_should_purchased_successfully() {
				 
			 }




	 
	 
	 
	 
	 
	 












}

