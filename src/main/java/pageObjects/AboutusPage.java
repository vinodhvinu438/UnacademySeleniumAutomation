package pageObjects;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AboutusPage {
    WebDriver driver;
    public AboutusPage(WebDriver driver)
   {
    this.driver = driver;
    PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//span[contains(.,'50M')]") WebElement activeMembersField;
    public boolean activeMembers()
    {
        System.out.println(activeMembersField.getText());
    return activeMembersField.isDisplayed();
    }
}