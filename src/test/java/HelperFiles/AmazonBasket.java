package HelperFiles;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AmazonBasket {

    WebDriver driver;

    
    By cartIcon = By.xpath("//span[@id='nav-cart-count']");
    By quantityDropdown = By.xpath("//span[@id='sc-subtotal-label-buybox']");
    By subtotalText = By.id("sc-subtotal-amount-buybox");

    
    public AmazonBasket(WebDriver driver) {
        this.driver = driver;
    }

 
    public void openCart() {
        driver.findElement(cartIcon).click();
    }

   
    public String getQuantity() {
        return driver.findElement(quantityDropdown).getAttribute("value");
        
    }

    
    public String getSubtotal() {
        return driver.findElement(subtotalText).getText();
      
    }
  
}