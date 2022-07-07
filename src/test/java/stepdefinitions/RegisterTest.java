package stepdefinitions;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.Base;

public class RegisterTest extends Base {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	@Given("^Enter url of unacademy application$")
    public void enter_url_of_unacademy_application() throws IOException {
        driver = initializeBrowser();
        driver.get(prop.getProperty("url"));
    }

    @Then("^click on login buuton on homepage$")
    public void click_on_login_buuton_on_homepage() {
    	loginPage = new LoginPage(driver);
    	loginPage.clickOnLoginHomePage();
    }

    @Then("^enter new mobile number to register$")
    public void enter_new_mobile_number_to_register() throws InterruptedException {
       loginPage.enterMobileNumber(prop.getProperty("newmobilenumber"));
    }

    @Then("^enter the required fields$")
    public void enter_the_required_fields() throws InterruptedException{
       Thread.sleep(2000);
       loginPage.enterName(prop.getProperty("name"));
       loginPage.enterEmailField(prop.getProperty("email"));
    }

    @Then("^click on submit button$")
    public void click_on_submit_button() throws InterruptedException {
       Thread.sleep(40000);
       homePage = loginPage.clickOnSubmitButton();
    }

    @And("^click on create your account$")
    public void click_on_create_your_account() throws InterruptedException {
       loginPage.clickOnCreateNewAccount();
    }

    @And("^click on continue button to register$")
    public void click_on_continue_button_to_register() throws InterruptedException {
       loginPage.clickOnContinue();
    }

    @And("^Select state of residence$")
    public void select_state_of_residence() throws InterruptedException {
    	loginPage.selectState();
       
    }

    @And("^click on terms and privacy policy$")
    public void click_on_terms_and_privacy_policy() {
    	loginPage.selectCheckbox();
    }

    @And("^Verify user able to create account successfully$")
    public void verify_user_able_to_create_account_successfully() throws InterruptedException {
       Thread.sleep(4000);
       homePage.clickOnConfirmEmail();
       Thread.sleep(2000);
       homePage.clickOnContinue();
       Thread.sleep(30000);
       homePage.clickOnVerifyOTP();
       Assert.assertTrue(homePage.checkText());
       driver.quit();
       
    }

}
