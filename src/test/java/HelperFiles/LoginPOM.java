package HelperFiles;
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class LoginPOM {
 
    WebDriver driver;
 
    // ✅ constructor
    public LoginPOM(WebDriver driver) {
        this.driver = driver;
    }
 
    public void enterUsername(String username) {
        driver.findElement(By.name("username")).sendKeys(username);
    }
 
    public void enterPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }
//    public void clickLogin() {
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    }

    public void clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@type='submit']")
        )).click();
}}