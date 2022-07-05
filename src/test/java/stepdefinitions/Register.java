package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.AccountSuccessPage;
import pageObjects.LoginPage;
import resources.Base;

public class Register extends Base {
	WebDriver driver;
	LoginPage homePage;
	AccountSuccessPage accountSuccessPage;
	@Given("^Enter url of unacademy application$")
    public void enter_url_of_unacademy_application() throws IOException {
        driver = initializeBrowser();
        driver.get(prop.getProperty("url"));
    }

    @Then("^click on login buuton on homepage$")
    public void click_on_login_buuton_on_homepage() {
        homePage = new LoginPage(driver);
        homePage.clickOnLoginHomePage();
    }

    @Then("^enter new mobile number to register$")
    public void enter_new_mobile_number_to_register() throws InterruptedException {
       Thread.sleep(2000);
       homePage.enterMobileNumber(prop.getProperty("newmobilenumber"));
    }

    @Then("^enter the required fields$")
    public void enter_the_required_fields() throws InterruptedException{
       Thread.sleep(2000);
       homePage.enterName(prop.getProperty("name"));
       homePage.enterEmailField(prop.getProperty("email"));
    }

    @Then("^click on submit button$")
    public void click_on_submit_button() throws InterruptedException {
       Thread.sleep(40000);
       accountSuccessPage = homePage.clickOnSubmitButton();
    }

    @And("^click on create your account$")
    public void click_on_create_your_account() throws InterruptedException {
       Thread.sleep(2000);
       homePage.clickOnCreateNewAccount();
    }

    @And("^click on continue button to register$")
    public void click_on_continue_button_to_register() throws InterruptedException {
       Thread.sleep(1000);
       homePage.clickOnContinue();
    }

    @And("^Select state of residence$")
    public void select_state_of_residence() throws InterruptedException {
       homePage.selectState();
       
    }

    @And("^click on terms and privacy policy$")
    public void click_on_terms_and_privacy_policy() {
       homePage.selectCheckbox();
    }

    @And("^Verify user able to create account successfully$")
    public void verify_user_able_to_create_account_successfully() throws InterruptedException {
       Thread.sleep(4000);
       accountSuccessPage.clickOnConfirmEmail();
       Thread.sleep(2000);
       accountSuccessPage.clickOnContinue();
       Thread.sleep(30000);
       accountSuccessPage.clickOnVerifyOTP();
       Assert.assertTrue(accountSuccessPage.checkText());
       driver.quit();
       
    }

}
