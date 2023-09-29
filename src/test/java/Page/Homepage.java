package Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import Helper.Base;

public class Homepage extends Base {

	public By AddProduct1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	public By AddProduct2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	public By AddProduct3 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	public By AddProduct4 = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
	public By singleProductAdd = By.xpath("//span[contains(text(),'1')]");
	public By MultiProductAdd = By.xpath("//span[contains(text(),'4')]");
	public By Dropdownselect = By.cssSelector(".product_sort_container");
	public By DropValidate = By.cssSelector(".active_option");
	public By RemoveProduct1 = By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']");
	public By RemoveProduct2 = By.xpath("//button[@id='remove-sauce-labs-bike-light']");
	public By BasketValueAfterRemove = By.xpath("//span[contains(text(),'2')]");
	public By ProductImage1 = By.cssSelector("[alt='Sauce Labs Backpack']");
	public By BackToProduct = By.cssSelector("[name='back-to-products']");
	public By Product = By.cssSelector("[class='title']");
	public By ProductNameDisplay = By.cssSelector("[class='inventory_details_name large_size']");
	public By ProductNameDisplay1 = By.xpath("//div[@class='inventory_item_name']");
	public By hitCart = By.cssSelector("[class='shopping_cart_link']");
	public By ProductPrice = By.cssSelector("[class='inventory_item_price']");

	public void user_add_a_product_to_basket_cart() {

		explicitywait(AddProduct1).click();

	}

	public void click_the_basketCart_after_add_product() {

		explicitywait(hitCart).click();

	}

	public void validate_successfully_add_or_not() {

		String basket = explicitywait(singleProductAdd).getText();
		Assert.assertEquals("1", basket);
	}

	public void And_user_add_multi_Products_to_basketCart() {

		explicitywait(AddProduct1).click();
		explicitywait(AddProduct2).click();
		explicitywait(AddProduct3).click();
		explicitywait(AddProduct4).click();
	}

	public void validate_successfully_add_multi_products__or_not() {

		String multiBasket = explicitywait(MultiProductAdd).getText();
		Assert.assertEquals("4", multiBasket);
		System.out.println(multiBasket);
	}

	public void user_hit_Dropdown_and_Choose_a_Dropdown_Value() {

		explicitywait(Dropdownselect);
		Dropdown(Dropdownselect, 2);

	}

	public void validate_successfully_dropdown_choose_or_not() {

		boolean dropdown = explicitywait(DropValidate).isDisplayed();
		Assert.assertTrue(dropdown);
		System.out.println(dropdown);

	}

	public void user_remove_some_product_after_add() {

		explicitywait(RemoveProduct1).click();
		explicitywait(RemoveProduct2).click();

	}

	public void validate_is_it_removable_or_not() {

		boolean CartValue = explicitywait(BasketValueAfterRemove).isDisplayed();
		Assert.assertTrue(CartValue);
		System.out.println(CartValue);

	}

	public void user_hit_on_a_product_image() {

		explicitywait(ProductImage1).click();

	}

	public void Validate_it_redirect_to_right_page_or_not() {

		String ProductName = explicitywait(ProductNameDisplay).getText();
		Assert.assertEquals("Sauce Labs Backpack", ProductName);
		System.out.println(ProductName);

	}

	public void user_back_to_home_or_product_page() {

		explicitywait(BackToProduct).click();

	}

	public void validate_user_able_to_get_back_to_product_page_or_not() {

		String ProductTitle = explicitywait(Product).getText();
		Assert.assertEquals("Products", ProductTitle);
		System.out.println(ProductTitle);
	}

	public void click_the_basketCart() {
		driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
	}

	public void Validate_weather_user_able_to_see_that_products_in_cart_page_with_price() throws InterruptedException {

		boolean productname = explicitywait(ProductNameDisplay1).isDisplayed();
		Assert.assertTrue(productname);

		Thread.sleep(3000);

		boolean price = explicitywait(ProductPrice).isDisplayed();
		Assert.assertTrue(price);

	}

}
