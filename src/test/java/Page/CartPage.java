package Page;

import org.junit.Assert;
import org.openqa.selenium.By;

import Helper.Base;
import io.cucumber.java.en.Then;

public class CartPage extends Base {
	public By ValidateCartPage = By.cssSelector("span.title");
	public By Continueshopping = By.cssSelector("[class='btn btn_secondary back btn_medium']");
	public By ProductPageVisible = By.cssSelector("[class='title']");
	public By Removebtn = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	public By EmptyBasket = By.cssSelector("[class='shopping_cart_link']");
	public By Cheackout = By.cssSelector("button#checkout");
	public By CheackoutConfirm = By.cssSelector("[class='title']");
	public By Firstname = By.cssSelector("input#first-name");
	public By Lastname = By.cssSelector("input#last-name");
	public By PostalCode = By.cssSelector("input#postal-code");
	public By continuebtn = By.cssSelector("[id='continue']");
	public By finishbtn=By.xpath("//button[@id='finish']");
	public By completetitle=By.cssSelector("[class='complete-header']");

	public void Validate_User_able_to_see_the_Cart_page_or_not() {

		boolean cartapge = explicitywait(ValidateCartPage).isDisplayed();
		Assert.assertTrue(cartapge);
	}

	public void user_click_the_continue_shopping_button() {

		explicitywait(Continueshopping).click();

	}

	public void Validate_successfull_back_in_to_home_page() {

		boolean Products = explicitywait(ProductPageVisible).isDisplayed();
		Assert.assertTrue(Products);

	}

	public void user_hit_on_Remove_button() {

		explicitywait(Removebtn).click();

	}

	public void validate_successfully_removed_the_product_from_cart() {

		boolean basket = explicitywait(EmptyBasket).isDisplayed();
		Assert.assertTrue(basket);

	}

	public void user_Click_on_Cheackout_button() {
		explicitywait(Cheackout).click();
	}

	public void validate_successfully_click_of_checkout_button() {

		boolean cheackcon = explicitywait(CheackoutConfirm).isDisplayed();
		Assert.assertTrue(cheackcon);

	}

	public void user_enter_Information(String fname, String lname, String pcode) {
		explicitywait(Firstname).sendKeys(fname);
		explicitywait(Lastname).sendKeys(lname);
		explicitywait(PostalCode).sendKeys(pcode);
	}

	public void User_Click_the_continue_button() {
		explicitywait(continuebtn).click();
	}

	public void click_the_finish_button() {
     explicitywait(finishbtn).click();
	}

	public void Validate_successful_order_confirmation() {
   String s= explicitywait(completetitle).getText();
   Assert.assertEquals("Thank you for your order!",s);
   System.out.println(s);
	}

}
