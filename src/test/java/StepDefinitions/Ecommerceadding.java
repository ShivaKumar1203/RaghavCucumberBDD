package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import HelperFiles.AmazonHomePage;
import HelperFiles.ProductPage;
import io.cucumber.java.en.*;

public class Ecommerceadding {
	WebDriver driver;
	@Given("I open Amazon website")
	public void i_open_amazon_website() {
		driver = new ChromeDriver();

	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.com/");
	}
	
	@When("I search for a product {string}")

	public void i_search_for_a_product(String productName) {

	  
	    AmazonHomePage home = new AmazonHomePage(driver);
	    home.enterSearchterm(productName);
	    home.clickonSearchicon();
	}


	@When("I open first non-sponsored product")
	public void i_open_first_non_sponsored_product() {

	}

	@Then("I validate product title and price are visible")
	public void i_validate_product_title_and_price_are_visible() {
	    
	}

	@When("I click Add to Cart")
	public void i_click_add_to_cart() {
		ProductPage product =new ProductPage(driver);
		 product.clickAddToCart();
	}

	@Then("I should see Added to Cart message")
	public void i_should_see_added_to_cart_message() {
	    
	}

	@When("I add same product again")
	public void i_add_same_product_again() {
	    
	}

	@When("I open cart page")
	public void i_open_cart_page() {
	    
	}

	@Then("I validate quantity is {int} and subtotal is correct")
	public void i_validate_quantity_is_and_subtotal_is_correct(Integer int1) {
	   
	}
}
