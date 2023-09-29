package StepDefination;

import Page.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartDefination {

	CartPage Cart = new CartPage();
	
	@Then("Validate User able to see the Cart page or not")
	public void Validate_User_able_to_see_the_Cart_page_or_not() {
		Cart.Validate_User_able_to_see_the_Cart_page_or_not();
	}
	
	@And("user click the continue shopping button")
	public void user_click_the_continue_shopping_button() {
		Cart.user_click_the_continue_shopping_button();
	}
	

	@Then("Validate successfull back in to home page")
    public void Validate_successfull_back_in_to_home_page() {
		Cart.Validate_successfull_back_in_to_home_page();
	}
	
	@And("user hit on Remove button")
	public void user_hit_on_Remove_button() {
		Cart.user_hit_on_Remove_button();
	}
	
	@Then("validate successfully removed the product from cart")
	public void validate_successfully_removed_the_product_from_cart() {
		Cart.validate_successfully_removed_the_product_from_cart();
	}
	
	@And("user Click on Cheackout button")
	public void user_Click_on_Cheackout_button() {
		Cart.user_Click_on_Cheackout_button();
	}
	
	@Then("validate successfully click of checkout button")
    public void validate_successfully_click_of_checkout_button() {
		Cart.validate_successfully_click_of_checkout_button();
	}
	
	@When("user enter Information {string} {string} {string}")
	public void user_enter(String fname, String lname, String pcode) {
	     Cart.user_enter_Information(fname, lname, pcode);
	}
	
	@And("User Click the continue button")
	public void User_Click_the_continue_button() {
		Cart.User_Click_the_continue_button();
	}
	
	@Then("click the finish button")
	public void click_the_finish_button() {
		Cart.click_the_finish_button();
	}
	
	@Then("Validate successful order confirmation")
	public void Validate_successful_order_confirmation() {
		Cart.Validate_successful_order_confirmation();
	}


}
