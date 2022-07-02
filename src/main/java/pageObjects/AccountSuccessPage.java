package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {
	WebDriver driver;
   public AccountSuccessPage(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
    @FindBy(xpath="//button[contains(.,\"Continue\")]")
	private WebElement confirmEmailField;
	public void clickOnConfirmEmail()
	{
		confirmEmailField.click();
	}
	@FindBy(xpath="(//button[contains(.,\"Continue\")])[2]")
	private WebElement clickOnContinueField;
	public void clickOnContinue()
	{
		clickOnContinueField.click();
	}
	@FindBy(xpath="//button[@aria-label=\"Verify OTP\"]")
	private WebElement clickOnVerifyOtp;
	public void clickOnVerifyOTP()
	{
		clickOnVerifyOtp.click();
	}
	@FindBy(css=".css-rdu1bf-H2-MainText.e17pthzo3")
	private WebElement textField;
	public boolean checkText()
	{
		return textField.isDisplayed();
	}
	
}
