package Page;

import org.openqa.selenium.By;

import Helper.Base;

public class LogoutPage extends Base {
	
	public By logout3dot=By.cssSelector("[id='react-burger-menu-btn']");
	public By logout=By.cssSelector("[id='logout_sidebar_link']");
	
	 public void validate_logout_successfully() {
			
		 explicitywait(logout3dot).click();
		 explicitywait(logout).click();
		 
		}

}
