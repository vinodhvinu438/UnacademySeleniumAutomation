package stepdefinitions;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.Choosegoalspage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.Base;
public class StartLearningTest extends Base {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    Choosegoalspage choosegoalspage ;
    
    @Given("^Open the unacademy website$")
    public void open_the_application_url() throws IOException {
         driver = initializeBrowser();
            driver.get(prop.getProperty("url"));
            loginPage = new LoginPage(driver);
    }
    @When("^click on goals option and click on add goals$")
    public void click_on_goals_option_and_click_on_add_goals() throws InterruptedException {
        homePage.clickOnDialog();
        homePage.clickOnCookie();
        choosegoalspage = homePage.addgoal();
    }
    @Then("^Verify subscription page is displayed$")
    public void verify_subscription_page_is_displayed() {
    	 Assert.assertEquals("Experience our 2021 recap", homePage.checkLoginField());
      driver.quit();
    }
    @And("^User does login process and home page is displayed$")
    public void user_performs_login_operation_and_home_page_is_displayed() throws InterruptedException {
        loginPage.clickOnLoginHomePage();
        loginPage.enterMobileNumber(prop.getProperty("mobilenumber"));
        loginPage.clickOnLogin();
        Thread.sleep(25000);
        homePage=loginPage.clickOnVerifyOTPButton();
    }
    @And("^choose any course and click on it")
    public void choose_any_course_and_click_on_it() throws InterruptedException {
        choosegoalspage.addinggoal();
    }
}