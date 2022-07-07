package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseplanPage {
	WebDriver driver;
	@FindBy (xpath="//button[text()='Proceed to pay']") WebElement proceed; 

    @FindBy (xpath = "//button[@aria-label='Accept']") WebElement cookies;

    public ChooseplanPage(WebDriver driver)
    {
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public PaymentPage selection() throws InterruptedException
    {
        //plan.click();
        cookies.click();
        Thread.sleep(2000);
        proceed.click();
        return new PaymentPage(driver);
    }
}
