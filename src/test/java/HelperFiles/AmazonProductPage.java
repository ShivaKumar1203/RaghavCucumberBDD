package HelperFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonProductPage {

    WebDriver driver;

  
    By productTitle = By.id("productTitle");
    By productPrice = By.cssSelector("span.a-price span.a-offscreen");
    By addToCartBtn = By.xpath("//button[@id='a-autoid-1-announce']");
    By addagain=By.xpath("//fieldset[@name='ax-qs']//span[@class='a-icon a-icon-small-add']");
    By addedToCartMsg = By.xpath("//h1[text()='Added to Cart']");
    
    public AmazonProductPage(WebDriver driver) {
        this.driver = driver;
    }

 
    public boolean isTitleVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle)).isDisplayed();
    }

 
    public boolean isPriceVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productPrice)).isDisplayed();
    }


    public void clickAddToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
       // return driver.findElement(clickAddToCart).getAttribute("value");
    }

    public void addagaintobasket() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(addagain)).click();
    }
    public void openCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(addagain)).click();
    }
    

    public boolean isAddedToCartMessageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(addedToCartMsg)).isDisplayed();
    }
    
}