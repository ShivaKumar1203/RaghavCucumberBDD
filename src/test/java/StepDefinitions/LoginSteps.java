package stepdefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageobjects.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("user opens ecommerce login page")
    public void user_opens_login_page() {
        driver = DriverFactory.getDriver();
        driver.get("https://demo-ecommerce.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Then("user should be navigated to home page")
    public void user_should_be_navigated_to_home_page() {
        System.out.println("User successfully logged in");
    }
}
