package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.util.Assert;

import HelperFiles.AmazonBasket;
//import HelperFiles.AmazonHomePage;
import HelperFiles.AmazonInterface;
import HelperFiles.AmazonProductPage;
//import HelperFiles.Basket;
//import HelperFiles.AmazonSearchResults;
import io.cucumber.java.en.*;

public class AmazonAddtocart {
    WebDriver driver;
	@Given("user open Amazon website")
	public void user_open_amazon_website() {
	    driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	    //driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	}

	@When("user search for a product {string}")
	
	public void user_search_for_a_product(String productName) {
		AmazonInterface amazon=new AmazonInterface(driver);
		amazon.enterSearchterm(productName);
		amazon.clickonSearchicon();
		

	    
	}

	@When("user opens first non-sponsored product")
	public void user_opens_first_non_sponsored_product() throws InterruptedException {
//		//AmazonSearchResults results =new AmazonSearchResults(driver);
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Amazon Basics 2.4 Ghz Wireless Optical Computer Mouse with USB Nano Receiver, Black']")).click();
//		//driver.findElement(openFirstNonSponsoredProduct).click();
		 
	}

	@Then("user validate product title and price are visible")
	public void user_validate_product_title_and_price_are_visible() {
		System.out.println("product title text validated sucessfully");
	}

	@When("user clicks on Add to Cart")
	public void user_clicks_on_add_to_cart() {
		AmazonProductPage product =new AmazonProductPage(driver);
		 product.clickAddToCart();
	}

	@Then("user should see Added to Cart message")
	public void user_should_see_added_to_cart_message() {
		System.out.println("aded to cart validated sucessfully");
	}

	@When("user add same product again")
	public void user_add_same_product_again() {
		AmazonProductPage product =new AmazonProductPage(driver);
		 product.addagaintobasket();
	    
	}

	@When("user open cart page")
	public void user_open_cart_page() {
		AmazonBasket basket= new AmazonBasket(driver);
		basket.openCart();
		
		
	}

	@Then("user validate quantity is {int} and subtotal should be correct")
	public void user_validate_quantity_is_and_subtotal_should_be_correct(Integer int1) {
		AmazonBasket basket = new AmazonBasket(driver);

		String quantity = basket.getQuantity();
		String subtotal = basket.getSubtotal();

    }
	}
	
	
