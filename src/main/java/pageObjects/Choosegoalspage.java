package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Base;
public class Choosegoalspage extends Base {
    WebDriver driver;
    public Choosegoalspage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//div[@role='goalcard-SIFWL']") WebElement selectgoal;
    public void addinggoal() throws InterruptedException
    {
        Thread.sleep(2000);
        selectgoal.click();       
    }
    @FindBy (xpath = "//div[@stroke='#FFEDBF']") WebElement language;
    public void language() throws InterruptedException {
        language.click();
        
    }
}