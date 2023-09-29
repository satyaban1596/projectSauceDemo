package StepDefination;

import Page.loginpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {
	
    loginpage log=new loginpage();
    		
	@When("user input {string} and {string}")
	public void user_input_and(String user, String pass) {
	   log.user_input_and(user,pass);
	}

	@When("hit the login button")
	public void hit_the_login_button()  {
	    log.hit_the_login_button();
	}

	@Then("validate successfully login")
	public void validate_successfully_login() {
	    log.validate_successfully_login();
	}

	@Then("validate error messege")
	public void validate_error_messege() {
	    log.validate_error_messege();
	}   
	    
	 @Then("validate  invalid error messege for blank page")
	 public void validate_invalid_error_messege_for_blank_page() {   
	    log.validate_invalid_error_messege_for_blank_page();
}
}