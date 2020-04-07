package mct_account_pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MasterPage {

	WebDriver driver;

	public MasterPage(WebDriver driver) {
		this.driver = driver;

	}

	public void clickWebElement(String paramLocators) {
		driver.findElement(By.xpath(paramLocators)).click();
	}

	public void typeOnWebElement(String paramLocators, String paramValue) {
		driver.findElement(By.xpath(paramLocators)).sendKeys(paramValue);
	}

	public void uglyWait(int mls) {
		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getWebElementText(String paramLocatore) {
		return driver.findElement(By.xpath(paramLocatore)).getText();
	}
}
