package mct_accountActivitesValidate;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mct_account_pageobjectmodel.HomePage;
import mct_account_pageobjectmodel.RegistrationPage;

public class MctMyAccountActSteps {
	TestHelper helper;
	WebDriver driver;
	RegistrationPage regPage;
	String regUserData;
	HomePage homepage;
	@Given("^I open browser chrome$")
	public void i_open_browser_chrome() {
	    System.out.println("####### I open browser Chrome ##########");
	   helper = new TestHelper();
	   driver=helper.getDriver();
	}

	@Given("^I land on multicart landing page$")
	public void i_land_on_multicart_landing_page()  {
	    helper.launchApplication();
	  
	}

	@When("^I navigate to registration page$")
	public void i_navigate_to_registration_page() {
	    System.out.println("####### I navigate to registration page####### ");
	   HomePage homepage= new HomePage(driver);
	   homepage.navigateToRegistrationPage();
	   RegistrationPage regPage = new RegistrationPage(driver); 
	}

	@When("^I complete registration for MR Fname$")
	public void i_complete_registration_for_MR_Fname() {
	    System.out.println("######I complete registration for MR Fname########");
	    RegistrationPage regPage = new RegistrationPage(driver);
	    Random rand = new Random();
	    
		int ranNum = rand.nextInt(1000);
		regUserData="NAME"+ranNum;
		regPage.completeRegistration(regUserData);
	}

	@When("^I expect to see profile name MR Fname$")
	public void i_expect_to_see_profile_name_MR_Fname()  {
		System.out.println("####I expect to see profile name MR Fname########");
		HomePage homepage= new HomePage(driver);
		String expProfileName="MR "+regUserData;
		String actualProfileName=homepage.getProfileName();
		 Assert.assertEquals("Profile Miss Matched", expProfileName, actualProfileName);
	}

	@Then("^I navigate to My account page$")
	public void i_navigate_to_My_account_page() {
	  homepage= new HomePage(driver);
	  homepage.neviagteToMyAccountPage();
	  System.out.println("####### I navigate to My account page########");
	 
	}

	@Then("^I validate all My account activites$")
	public void i_validate_all_My_account_activites() {
		System.out.println("######I validate all My account activites########");
		homepage.validateAccountAct();
	}

}
