package StepDefination;

import Page.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeDefination {

	Homepage home = new Homepage();

	@When("user add a Product to basketCart")
	public void user_add_a_product_to_basket_cart() {
		home.user_add_a_product_to_basket_cart();
	}
	
	@When("click the basketCart after add product")
	public void click_the_basketCart_after_add_product() {
	  home.click_the_basketCart_after_add_product();
	}

	@Then("validate successfully add or not")
	public void validate_successfully_add_or_not() {
		home.validate_successfully_add_or_not();
	}

	@And("user add multi Products to basketCart")
	public void And_user_add_multi_Products_to_basketCart() {
		home.And_user_add_multi_Products_to_basketCart();
	}

	@Then("validate successfully add multi products or not")
	public void validate_successfully_add_multi_products__or_not() {
		home.validate_successfully_add_multi_products__or_not();
	}

	@When("user hit Dropdown and Choose a Dropdown Value")
	public void user_hit_Dropdown_and_Choose_a_Dropdown_Value() {
		home.user_hit_Dropdown_and_Choose_a_Dropdown_Value();

	}

	@Then("Validate Successfully Dropdown choose or not")
	public void validate_successfully_dropdown_choose_or_not() {
		home.validate_successfully_dropdown_choose_or_not();
	}

	@When("user remove some product after add")
	public void user_remove_some_product_after_add() {
		home.user_remove_some_product_after_add();

	}

	@Then("Validate is it Removable or not")
	public void validate_is_it_removable_or_not() {
		home.validate_is_it_removable_or_not();

	}

	@When("user hit on a product image")
	public void user_hit_on_a_product_image() {
		home.user_hit_on_a_product_image();

	}

	@And("Validate it redirect to right page or not")
	public void Validate_it_redirect_to_right_page_or_not() {

		home.Validate_it_redirect_to_right_page_or_not();
	}

	@When("user Back to Home or Product Page")
	public void user_back_to_home_or_product_page() {
		home.user_back_to_home_or_product_page();

	}

	@Then("Validate user able to get back to Product page or not")
	public void validate_user_able_to_get_back_to_product_page_or_not() {
		home.validate_user_able_to_get_back_to_product_page_or_not();

	}	
	
	@Then("Validate weather user able to see that products in cart page with price")
    public void Validate_weather_user_able_to_see_that_products_in_cart_page_with_price() throws InterruptedException {
		home.Validate_weather_user_able_to_see_that_products_in_cart_page_with_price();
		
	}
	

}
