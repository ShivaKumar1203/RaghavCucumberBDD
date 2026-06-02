package StepDefinitions;
 
import java.sql.Driver;
import java.time.Duration;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import HelperFiles.LoginPOM;

import io.cucumber.java.en.*;
 
public class Loginpage {
	WebDriver driver;
	@Given("open app url")
	public void open_app_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
 
	@When("user is on login page")
	public void user_is_on_login_page() {
	}

	@And("user is loggedin with valid credentials")
	public void user_is_loggedin_with_valid_credentials() {
		 HelperFiles.LoginPOM login = new HelperFiles.LoginPOM(driver);
		    login.enterUsername("Admin");
		    login.enterPassword("admin123");
		    login.clickLogin();
	}
 
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	}
 
}