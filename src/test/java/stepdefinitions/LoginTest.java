package stepdefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import pageObjects.HomePage;
import resources.Base;

public class LoginTest extends Base
{
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	@Given("^Open url of unacademy application$")
    public void open_url_of_unacademy_application() throws IOException {
       driver = initializeBrowser();
       driver.get(prop.getProperty("url"));
    }

    @Then("^Click on login option on homepage$")
    public void click_on_login_option_on_homepage() {
    	loginPage = new LoginPage(driver);
    	loginPage.clickOnLoginHomePage();
    }

    @Then("^click on login button$")
    public void click_on_login_button() throws InterruptedException   {
    	Thread.sleep(1000);
    	loginPage.clickOnLogin();
    }
    @Then("Verify user able to login successfully")
    public void verify_user_able_to_login_successfully() throws InterruptedException {
    	homePage.clickOnDialog();
        Assert.assertEquals("Experience our 2021 recap", homePage.checkLoginField());
        driver.quit();
       
    }


    @And("^Enter registered mobile number$")
    public void enter_registered_mobile_number() throws InterruptedException{
	loginPage.enterMobileNumber(prop.getProperty("mobilenumber"));
    }

    @And("^click on veifyotp button option$")
    public void click_on_veifyotp_button_option() throws InterruptedException  {
    	Thread.sleep(25000);
    	homePage = loginPage.clickOnVerifyOTPButton();
    }
    
    @Then("^Enter registered \"([^\"]*)\" email$")
    public void enter_registered_something_email(String email) throws InterruptedException {
       loginPage.enterEmail(email);
    }
    @And("^Click on Continue with email$")
    public void click_on_continue_with_email() throws InterruptedException {
       loginPage.continueWithEmail();
    }
    @When("^Enter wrong \"([^\"]*)\"  mobile number$")
    public void enter_wrong_something_mobile_number(String mobilenumber) throws InterruptedException  {
    	loginPage.enterMobileNumber(mobilenumber);
    }
    @Then("^Verify warning message is displayed$")
    public void verify_warning_message_is_displayed() throws InterruptedException{
       Assert.assertTrue(loginPage.warningMessageOfInvalidPhonenumber());
       driver.quit();
    }
    @Then("^Enter wrong \"([^\"]*)\" email$")
    public void enter_wrong_something_email(String email) throws InterruptedException  {
      loginPage.enterEmail(email);
    }
    @Then("^Verify warning message of email is displayed$")
    public void verify_warning_message_of_email_is_displayed() throws InterruptedException  {
        Assert.assertTrue(loginPage.warningMessageOfInvalidEmail());
        driver.quit();
    }




}