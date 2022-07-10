package stepdefinitions;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SettingsPage;
import resources.Base;
public class SettingsTest extends Base {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    SettingsPage settingsPage;
     @Given("^Open the apllication URL$")
        public void open_the_apllication_url() throws IOException  {
            driver=initializeBrowser();
            driver.get(prop.getProperty("url"));
        }
        @When("^User performs login operation Home Page should be displayed$")
        public void user_performs_login_operation_home_page_should_be_displayed() throws InterruptedException  {
            loginPage=new LoginPage(driver);
            loginPage.clickOnLoginHomePage();
            loginPage.enterMobileNumber(prop.getProperty("mobilenumber"));
            loginPage.clickOnLogin();
            Thread.sleep(20000);
            homePage=loginPage.clickOnVerifyOTPButton();
        }
        @Then("^Settings page is displayed$")
        public void settings_page_is_displayed()  {
        	Assert.assertTrue(settingsPage.isSettingsPageDisplayed());
        }
        @And("^User clicks on My Account dropdown and clicks on Settings$")
        public void user_clicks_on_my_account_dropdown_and_clicks_on_settings()  {
        	homePage.clickOnDialog();
            homePage.clickOnProfile();
            settingsPage = homePage.clickOnSettings();
            driver.quit();
        }
}