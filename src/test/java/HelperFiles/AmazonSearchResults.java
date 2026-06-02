package HelperFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchResults {

	WebDriver driver;
	
	 By firstNonSponsored = By.id("//button[@id='a-autoid-1-announce']");
	
	public AmazonSearchResults(WebDriver driver){
		this.driver=driver;
		
	}
	
//	public void opennonsponseredproduct(){
//		
//
//	}
	 
	 public void openFirstNonSponsoredProduct() {
		 
       
	        driver.findElement(firstNonSponsored).click();
	    }
	
	    
	}

	