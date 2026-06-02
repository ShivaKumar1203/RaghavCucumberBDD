package HelperFiles;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonInterface {

    WebDriver driver;
   //Locators section
    By searchfield_home = By.id("twotabsearchtextbox");
    By searchicon_home = By.id("nav-search-submit-button");

    
    //Constructor
    public AmazonInterface(WebDriver driver) {
        this.driver = driver;
    }

    //method or function
    public void enterSearchterm(String productName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchfield_home));
        driver.findElement(searchfield_home).click();
        driver.findElement(searchfield_home).sendKeys(productName);
    }

    public void clickonSearchicon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(searchicon_home));
        driver.findElement(searchicon_home).click();
    }
}

