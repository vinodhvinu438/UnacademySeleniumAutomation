package pageObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class PageFactory1 {
    
    WebDriver driver;
    public PageFactory1(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);    
    }
    //----------------------Login Start(path of webElements)------------------------
    
    //after entering url
    @FindBy(xpath="//button[@aria-label='Login']") 
     WebElement LoginButton;
    //Clicking on Mobile number text field
    @FindBy(xpath="//input[@placeholder='Enter your mobile number']") 
    WebElement LoginTextField;
    
    //Clicking on login after entering mobile number
    @FindBy(xpath="(//button[@aria-label='Login'])[2]") 
    WebElement LoginButton1;
    
    //Clicking on verify otp button after entering otp
    @FindBy(xpath="//button[text()='Verify OTP']") 
    WebElement EnterOtp;
    
    //Verifying login page by selecting on web element in the web page
    @FindBy(xpath="(//img[@alt='Company Logo'])[1]")
    WebElement VerifyLoginPage;
    
    //----------------------Login Stop(path of webElements)-------------------------
    
    //----------------------Search Valid data(path of webElements)-------------------
    
    //Click on search button before 
    @FindBy(xpath="//input[@id='searchInput']//ancestor::div[1]")
    WebElement ClickonSearchBeforeEnteringData;
    
    //@FindBy(css=".MuiInputBase-root.MuiOutlinedInput-root.css-18yvoio-SearchTextField.ed9web92.MuiInputBase-adornedStart.MuiOutlinedInput-adornedStart")
    @FindBy(xpath="//input[@id='searchInput']")
    WebElement EnterSearchData;
    
    @FindBy(xpath="//h4[text()='Sachin Rana']")
    WebElement VerifyingEducators;
    
    @FindBy(xpath="//a[normalize-space()='Home']") 
    WebElement ClickOnHome;
    
    @FindBy(xpath="//h3[text()='No result found']")
    WebElement VerifyingWithInvalid;
    
    @FindBy(xpath="(//h4[text()='Syllabus & Strategy for UPSC 2020'])[1]")
    WebElement VerifyCourseName;
    
    
    //----------------------Login Start(Operations on webElements)------------------------
    public void Login() 
    {
        LoginButton.click();
    }
    public void MobileTextField(String number) 
    {
        LoginTextField.sendKeys(number);
    }
    public void LoginAfterEnteringNumber()
    {
        LoginButton1.click();
    }
    
    public void OtpVerifyButton() {
        EnterOtp.click();
    }
    public void VerifyingLoginPage()
    {
        boolean displed = VerifyLoginPage.isDisplayed();
        System.out.println(displed);
    }
    //----------------------Login Stop(Operations on webElements)------------------------
    
    //Click on search button before entering data
    public void ClickOnSearchBefore()
    {
        
        ClickonSearchBeforeEnteringData.click();
    }
    public void EnterEducatorsName() 
    {
        
        EnterSearchData.sendKeys("Sachin Rana");
        EnterSearchData.sendKeys(Keys.ENTER);
    }
    public void VerifyEducators() 
    {
        Assert.assertEquals(VerifyingEducators.getText(), "Sachin Rana");
    }
    
    public void clickOnHomePage()
    {
        ClickOnHome.click();
    }
    
    public void EnterEducatorsNameInvalid() 
    {
        EnterSearchData.sendKeys("\"rN#4V8S");
        EnterSearchData.sendKeys(Keys.ENTER);
    }
    
    public void VerifyWithInvalid() 
    {
        Assert.assertEquals(VerifyingWithInvalid.getText(),"No result found");
    }
    public void EnterCourseNamevalid() 
    {
        
        EnterSearchData.sendKeys("Strategy UPSC 2020");
        EnterSearchData.sendKeys(Keys.ENTER);
    }
    public void VerifyingCourseName()
    {
        Assert.assertEquals(VerifyCourseName.getText(),"Syllabus & Strategy for UPSC 2020");
    }
    public void VerifyWithInvalidCourseName()
    {
        EnterSearchData.sendKeys("{\"rN#4V$S");
        EnterSearchData.sendKeys(Keys.ENTER);
    }
    public void VerifyCourseWithInvalid() 
    {
        Assert.assertEquals(VerifyingWithInvalid.getText(),"No result found");
    }
    
}