package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPage
{
	WebDriver driver;
	public LoginSuccessPage(WebDriver driver)
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
		return;
	}
    @FindBy(xpath="(//div[contains(.,\"OK GOT IT\")])[4]")
	private WebElement acceptDialogField;
    public void clickOnDialog()
    {
    	acceptDialogField.click();
    }
    @FindBy(xpath="//p[contains(.,'Experience our 2021 recap')]")
    private WebElement checkLoginField;
    public String checkLoginField()
    {
    	return checkLoginField.getText();
    }
}