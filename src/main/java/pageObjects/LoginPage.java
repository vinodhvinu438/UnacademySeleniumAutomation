package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[contains(.,'Login')]")
	private WebElement loginButtonOnHomepage;
	public void clickOnLoginHomePage()
	{
		loginButtonOnHomepage.click();
	}
	@FindBy(xpath="//input[@placeholder=\"Enter your mobile number\"]")
	private WebElement enterMobileNumberField;
	public void enterMobileNumber(String number)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@placeholder=\\\"Enter your mobile number\\\"]")));
		enterMobileNumberField.sendKeys(number);
	}
	@FindBy(xpath="(//button[@aria-label=\"Login\"])[2]")
	private WebElement loginOnMobileNumberField;
	public void clickOnLogin()
	{
	       loginOnMobileNumberField.click();
	}
	@FindBy(xpath="//button[contains(.,'Verify OTP')]")
	private WebElement verifyOtpField;
	public HomePage clickOnVerifyOTPButton() {
		verifyOtpField.click();
		return new HomePage(driver);
		
	}
	@FindBy(xpath="//a[@class=\" css-zfcs5g-StyledAnchor e2vughv1\"]")
	private WebElement continueWithEmailField;
	public void continueWithEmail()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[@class=\\\" css-zfcs5g-StyledAnchor e2vughv1\\\"]")));
		continueWithEmailField.click();
	}
	@FindBy(xpath="//input[@placeholder=\"Email address\"]")
	private WebElement enterEmailField;
	public void enterEmail(String email)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@placeholder=\\\"Email address\\\"]")));
		enterEmailField.sendKeys(email);
	}
	@FindBy(xpath="//p[contains(.,\"Phone number is not valid\")]")
	private WebElement invalidPhonenumberField;
	public boolean warningMessageOfInvalidPhonenumber() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[contains(.,\\\"Phone number is not valid\\\")]")));
		
		return invalidPhonenumberField.isDisplayed();
	}
	@FindBy(xpath="//p[contains(.,\"Email is not valid\")]")
	private WebElement invalidEmailField;
	public boolean warningMessageOfInvalidEmail()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[contains(.,\\\"Email is not valid\\\")]")));
		return invalidEmailField.isDisplayed();
	}
	@FindBy(xpath="//h6[contains(.,\"create your account\")]")
	private WebElement createNewAccountField;
	public void clickOnCreateNewAccount()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h6[contains(.,\\\"create your account\\\")]")));
		createNewAccountField.click();
	}
	@FindBy(xpath="//button[contains(.,'Continue']")
	private WebElement clickOnContinueField;
	public void clickOnContinue() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[normalize-space()=\\\"Continue\\\"]")));
		clickOnContinueField.click();
	}
	@FindBy(xpath="//input[@placeholder=\"Name\"]")
	private WebElement nameField;
	public void enterName(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@placeholder=\\\"Name\\\"]")));
	    nameField.sendKeys(name);
	}
	@FindBy(xpath="//input[@placeholder=\"Email address\"]")
	private WebElement emailField;
	public void enterEmailField(String email)
	{
		emailField.sendKeys(email);
	}
	@FindBy(xpath="//button[normalize-space()=\"Select - State of residence\"]")
	private WebElement selectStateField;
	@FindBy(xpath="//span[normalize-space()=\"Andhra Pradesh\"]")
	private WebElement andhraPradeshField;
	public void selectState() throws InterruptedException
	{
		selectStateField.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[normalize-space()=\\\"Andhra Pradesh\\\"]")));
		andhraPradeshField.click();	
	}
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement checkboxField;
	public void selectCheckbox()
	{
		checkboxField.click();
	}
	@FindBy(xpath="//button[contains(.,\"Submit\")]")
	private WebElement submitField;
	public HomePage clickOnSubmitButton() throws InterruptedException
	{
		Thread.sleep(2000);
		submitField.click();
		return new HomePage(driver);
		
	}
}