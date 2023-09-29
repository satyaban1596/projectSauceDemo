package StepDefination;

import Page.LogoutPage;
import io.cucumber.java.en.Then;

public class LogoutStep {
	  
	LogoutPage log=new LogoutPage();
	
	
	@Then("validate logout successfully")
    public void	validate_logout_successfully() {
		log.validate_logout_successfully();
	}

}
