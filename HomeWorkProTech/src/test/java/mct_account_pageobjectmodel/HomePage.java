package mct_account_pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends MasterPage{
	WebDriver driver;
	// xpath of text field
	String loginLink="//span[contains(text(),'Login')]";
	String userIDField="//input[@id='username']";
	String passWordField="//input[@id='password']";
	String signUpButton="//button[@id='jqSignup']";
	String loginButton="//button[@id='jqLogin']";
	String userNameLabel="//button[@id='dLabel']";
	String myAccountLabel="//div[@class='login_sec2']//div[1]//a[1]";
	
	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void doLoginWithValidation() {
		//click on login tab
		clickWebElement(loginLink);
		//type on login field
		typeOnWebElement(passWordField, "user");
		typeOnWebElement(passWordField, "pass");
		//click on login button
		clickWebElement(loginButton);
		
	}

	public void navigateToRegistrationPage() {
		clickWebElement(loginLink);
		clickWebElement(signUpButton);
		uglyWait(2000);
		
		
	}

	public String getProfileName() {
		//
		return getWebElementText(userNameLabel);
	}

	public void neviagteToMyAccountPage() {
		clickWebElement(userNameLabel);
		clickWebElement(myAccountLabel);
		
	}

	public void validateAccountAct() {
		uglyWait(2000);
		//get all the text and store in the actList 
		List<WebElement> actList =  driver.findElements(By.xpath("//div[contains(@class,'col-sm-12 col-lg-3 col-md-3')]"));
		
		System.out.println(actList.size());
		for (WebElement webElement : actList) {		
			String name = webElement.getText();
			System.out.println(name);
	      //expected String in the expList array   
			String[] expList = {"My Orders",
	        					"Profile",
	        					"My Return Requests",
	        					"Change Password",
	        					"My Favorite Products",
	        					"My Favorite Sellers",
    							"Activate Seller Account"};
	}
	}

}
