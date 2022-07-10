package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	WebDriver driver;
    public SettingsPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//h3[text()='Account']") WebElement element;
    public boolean isSettingsPageDisplayed()
    {
    	return element.isDisplayed();
    }
}
