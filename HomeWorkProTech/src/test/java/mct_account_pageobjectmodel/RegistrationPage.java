package mct_account_pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends MasterPage {
	WebDriver driver;
	// xpath of text field
	String emailField = "//input[@id='txtEmail']";
	String userNameField = "//input[@id='txtUserName']";
	String passField = "//input[@id='txtPassword']";
	String passConField = "//input[@id='txtCnfPassword']";
	String fName = "//input[@id='txtFirstName']";
	String lName = "//input[@id='txtLastName']";
	String addressField = "//input[@placeholder='Address *']";
	String regButton = "//input[@id='btnRegister']";

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	public void completeRegistration(String userValue) {
		// type Email address on text Field
		typeOnWebElement(emailField, userValue + "@gmail.com");
		// type user on text Field
		typeOnWebElement(userNameField, userValue + "abc");
		// type password on text Field
		typeOnWebElement(passField, "pass");
		// type Confirm password on text Field
		typeOnWebElement(passConField, "pass");
		// type first name on text Field
		typeOnWebElement(fName, "MR");
		// type Last name on text Field
		typeOnWebElement(lName, userValue);
		// type address on text Field
		typeOnWebElement(addressField, "EFG");
		// click on create account button
		clickWebElement(regButton);
		// wait
		uglyWait(2000);

	}

}
