package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[normalize-space()=\"Login\"]")
	private WebElement loginButtonOnHomepage;
	public void clickOnLoginHomePage()
	{
		loginButtonOnHomepage.click();
	}
	@FindBy(xpath="//input[@placeholder=\"Enter your mobile number\"]")
	private WebElement enterMobileNumberField;
	public void enterMobileNumber(String number)
	{
		enterMobileNumberField.sendKeys(number);
	}
	@FindBy(xpath="(//button[@aria-label=\"Login\"])[2]")
	private WebElement loginOnMobileNumberField;
	public void clickOnLogin()
	{
	       loginOnMobileNumberField.click();
	}
	@FindBy(xpath="//button[normalize-space()=\"Verify OTP\"]")
	private WebElement verifyOtpField;
	public LoginSuccessPage clickOnVerifyOTPButton() {
		verifyOtpField.click();
		return new LoginSuccessPage(driver);
		
	}
	
	
	
	
}