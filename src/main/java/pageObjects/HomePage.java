package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[contains(.,\"Daily live classes\")]")
	private WebElement isUserLoggedInField;
	public boolean isUserLoggedIn()
	{
		return isUserLoggedInField.isDisplayed();
	}
	@FindBy(xpath="//button[@aria-label=\"Accept\"]")
	private WebElement acceptCookieField;
	public void clickOnCookie()
	{
		acceptCookieField.click();
	}
    @FindBy(xpath="(//div[contains(.,\"OK GOT IT\")])[4]")
	private WebElement acceptDialogField;
    public void clickOnDialog()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[contains(.,\\\"OK GOT IT\\\")])[4]")));
    	acceptDialogField.click();
    }
    @FindBy(xpath="//p[contains(.,'Experience our 2021 recap')]")
    private WebElement checkLoginField;
    public String checkLoginField()
    {
    	return checkLoginField.getText();
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