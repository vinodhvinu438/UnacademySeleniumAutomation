package stepdefinitions;

 

import java.io.IOException;

 

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

 

import io.cucumber.java.en.*;
import pageObjects.AboutusPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.Base;

 

public class AboutusTest extends Base {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AboutusPage aboutusPage;
      @Given("^Open the apllication URL$")
        public void open_the_apllication_url() throws IOException  {
          driver = initializeBrowser();
           driver.get(prop.getProperty("url"));   
        }
      

 

        @When("^User enter valid userid and clicks on login button$")
        public void user_enter_valid_userid_and_clicks_on_login_button() throws InterruptedException  {
            loginPage.enterMobileNumber(prop.getProperty("mobilenumber")); 
            Thread.sleep(1000);
            loginPage.clickOnLogin();
        }

 

        @When("^Home page is displayed and User clicks on Aboutus button$")
        public void home_page_is_displayed_and_user_clicks_on_aboutus_button() throws InterruptedException  {
            homePage.clickOnDialog();
            homePage.clickOnCookie1();
            
        }

 

        @Then("^user can see the daily active members used the application$")
        public void user_can_see_the_daily_active_members_used_the_application()  {
            aboutusPage=homePage.clickOnAboutus();
            Assert.assertTrue(aboutusPage.activeMembers());
            driver.quit();
        }

 

        @And("^Navigate to login page$")
        public void navigate_to_login_page()  {
            loginPage = new LoginPage(driver);
            loginPage.clickOnLoginHomePage();     
        }

 

        @And("^clicks on verify OTP$")
        public void clicks_on_verify_otp() throws InterruptedException  {
            Thread.sleep(25000);
            homePage = loginPage.clickOnVerifyOTPButton(); 
        }

 

}