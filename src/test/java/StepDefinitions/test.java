package StepDefinitions;

import io.cucumber.java.en.*;

public class test {

    @Given("user launches browser")
    public void launchBrowser() {

        System.out.println("Browser launched");

    }

    @When("user enters username and password")
    public void login() {

        System.out.println("Credentials entered");

    }

    @Then("user should login successfully")
    public void verifyLogin() {

        System.out.println("Login successful");

    }
}