package Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import Helper.Base;


public class loginpage extends Base  {
	
	public By username= By.cssSelector("input#user-name");
	public By password= By.cssSelector("input#password");
	public By loginbtn= By.cssSelector("input#login-button");
	public By error= By.cssSelector("[data-test='error']");
	public By successvalidate= By.cssSelector("span.title");
	public By BlankDateValidate=By.cssSelector("h3[data-test='error']");
		
	public void user_input_and(String user, String pass) {	
		//setup();
	explicitywait(username).sendKeys(user);
	explicitywait(password).sendKeys(pass);	
	}
	
	public void hit_the_login_button()  {
	  
		explicitywait(loginbtn).click();
	}

	
	public void validate_successfully_login() {
	boolean val=explicitywait(successvalidate).isDisplayed();
		
		Assert.assertTrue(val);
	   
	}
	
	public void validate_error_messege() {
		
	boolean err=explicitywait(error).isDisplayed();
	Assert.assertTrue(err);
		
	}
	
	
	public void validate_invalid_error_messege_for_blank_page() {
		
	boolean Blank=explicitywait(BlankDateValidate).isDisplayed();
	Assert.assertTrue(Blank);
	
	}	
		
	


}
