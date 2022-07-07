package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.ChooseplanPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PaymentPage;
import resources.Base;

public class Subscribe extends Base {

	    WebDriver driver;
        HomePage homePage;
        LoginPage loginPage;
        ChooseplanPage chooseplanPage;
        PaymentPage paymentPage;
	    @Given("^Open the application URL$")
	    public void open_the_application_url() throws IOException  {
	        driver = initializeBrowser();
	        driver.get(prop.getProperty("url"));
	        loginPage = new LoginPage(driver);
	    }

		@When("^User clicks on get subscription and Choose plan page is displayed$")
	        public void user_clicks_on_get_subscription_and_choose_plan_page_is_displayed() throws InterruptedException   {
	       chooseplanPage = homePage.subscription();
       
	    }
	 
	    @Then("^User is sucessfully able to reach payment page$")
	    public void user_is_sucessfully_able_to_reach_payment_page() throws InterruptedException  {
	        Assert.assertEquals(paymentPage.paymentinit(),"Choose a payment method");
	        driver.quit();

	    }
	 
	    @And("^User performs login operation and Home page is displayed$")
	    public void user_performs_login_operation_and_home_page_is_displayed() throws InterruptedException  {
	          loginPage.clickOnLoginHomePage();
	          loginPage.enterMobileNumber(prop.getProperty("mobilenumber"));
	          loginPage.clickOnLogin();
	          Thread.sleep(20000);
	          homePage=loginPage.clickOnVerifyOTPButton();
	    }
	 
	    @And("^User clicks on plan and clicks on proceed to pay$")
	    public void user_clicks_on_plan_and_clicks_on_proceed_to_pay() throws InterruptedException  {
	         paymentPage = chooseplanPage.selection();
	    }
}
