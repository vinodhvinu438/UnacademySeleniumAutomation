package stepdefinitions;
import java.io.IOException;
import pageObjects.PageFactory1;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import resources.Base;
public class SearchTest extends Base {
    WebDriver driver= null;
   PageFactory1 pf;
    
   @Given("^Open url of unacademy application-search$")
    public void open_url_of_unacademy_application() throws IOException {
        driver=initializeBrowser();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://unacademy.com/");
    }
   @Then("^Click on login option on homepage-search$")
    public void click_on_login_option_on_homepage()  {
        pf = new PageFactory1(driver);
        pf.Login();   
    }
    @Then("^click on login button-search$")
    public void click_on_login_button() {
        pf = new PageFactory1(driver);
        pf.LoginAfterEnteringNumber();
    }
    @Then("^Verify user able to login successfully-search$")
    public void verify_user_able_to_login_successfully()
    {
        pf= new PageFactory1(driver);
        pf.VerifyingLoginPage();
    }
    @And("^Enter registered valid \"([^\"]*)\" into the Text field$")
    public void enter_registered_valid_something_into_the_text_field(String mobilenumber) {
        pf= new PageFactory1(driver);
        pf.MobileTextField(mobilenumber);
    }
    
    @And("^click on veifyotp button option-search$")
    public void click_on_veifyotp_button_option()  {
        pf= new PageFactory1(driver);
        pf.OtpVerifyButton();
    }
    
    @And("^Enter otp from your logned number-search$")
    public void enter_otp_from_your_logned_number() throws InterruptedException {
        Thread.sleep(25000);
    }
    
    
    //---------------------Search valid data---------------------
    @And("^Click on Search button before enter educators name$")
    public void click_on_search_button_before_enter_educators_name()
    {
        pf=new PageFactory1(driver);
        pf.ClickOnSearchBefore();
    }
    
    @Then("^Enter the \"([^\"]*)\" into the search text field$")
    public void enter_the_something_into_the_search_text_field(String educatorname) throws InterruptedException
    {
         pf=new PageFactory1(driver);
         Thread.sleep(2000);
         pf.EnterEducatorsName();
    }
    
    @And("^Verify the Educators profile$")
    public void verify_the_educators_profile()
    {
        pf=new PageFactory1(driver);
        pf.VerifyEducators();
    }
    
    @Then("^Click on Home Page$")
    public void click_on_home_page() throws InterruptedException
    {
        pf=new PageFactory1(driver);
        Thread.sleep(2000);
        pf.clickOnHomePage();
        Thread.sleep(2000);
    }
    
    @And("^Click on Search button$")
    public void click_on_search_button()
    {
        pf=new PageFactory1(driver);
        pf.ClickOnSearchBefore();
    }
    
    
    @And("^Enter the Invalid data\"([^\"]*)\" into the search text field$")
    public void enter_the_invalid_datasomething_into_the_search_text_field(String educatornameinvalid)
    {
        pf=new PageFactory1(driver);
        pf.EnterEducatorsNameInvalid();
    }
    
    @And("^Verify the No result found Text$")
    public void verify_the_no_result_found_text()
    {
        pf=new PageFactory1(driver);
        pf.VerifyWithInvalid();
    }
    @Then("^Click on Home Page Again$")
    public void click_on_home_page_again() throws InterruptedException
    {
        pf=new PageFactory1(driver);
        Thread.sleep(2000);
        pf.clickOnHomePage();
        Thread.sleep(2000);
    }
    @And("^Click on Search button Again$")
    public void click_on_search_button_again() 
    {
        pf=new PageFactory1(driver);
        pf.ClickOnSearchBefore();
    }
    @Then("^Enter the CourseName\"([^\"]*)\" into the search text field$")
    public void enter_the_coursenamesomething_into_the_search_text_field(String name)
    {
        pf= new PageFactory1(driver);
        pf.EnterCourseNamevalid();
    }
    @And("^Verify the courseName$")
    public void verify_the_coursename()
    {
        pf= new PageFactory1(driver);
        pf.VerifyingCourseName();
    }
    @Then("^Click on Home Page Once Again$")
    public void click_on_home_page_once_again() throws InterruptedException
    {
        pf=new PageFactory1(driver);
        Thread.sleep(2000);
        pf.clickOnHomePage();
        Thread.sleep(2000);
    }
    @And("^Click on Search button Once Again$")
    public void click_on_search_button_once_again()
    {
        pf=new PageFactory1(driver);
        pf.ClickOnSearchBefore();
    }
    @Then("^Enter the Invalid CourseName \"([^\"]*)\" into the search text field$")
    public void enter_the_invalid_coursename_something_into_the_search_text_field(String name)
    {
        pf=new PageFactory1(driver);
        pf.VerifyWithInvalidCourseName();
    }
    @And("^Verify the CourseName with InvalidData$")
    public void verify_the_coursename_with_invaliddata() throws InterruptedException
    {
        Thread.sleep(2000);
        pf=new PageFactory1(driver);
        pf.VerifyCourseWithInvalid();
        driver.quit();
    }
}