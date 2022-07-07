package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	    WebDriver driver;
	    public PaymentPage(WebDriver driver)
	    {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }
		 
	    @FindBy (xpath = "//h4[contains(.,'Choose a payment method')]") WebElement paymentinit;
        public String paymentinit() throws InterruptedException 
        {
	        Thread.sleep(2000);
	        return paymentinit.getText();
	    }
}
