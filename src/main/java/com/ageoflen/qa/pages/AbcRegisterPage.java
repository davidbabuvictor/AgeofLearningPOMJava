package com.ageoflen.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ageoflen.qa.base.TestBase;

public class AbcRegisterPage extends TestBase {

	String emailAddress = prop.getProperty("email");

	public AbcRegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifySignUpPageURL() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}

	public void enterEmailAddress() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement regEmailAddress = (WebElement) js.executeScript(
				"return document.querySelector(\"body > route-view\").shadowRoot.querySelector(\"#page-component\").shadowRoot.querySelector(\"#email\")");
		js.executeScript("arguments[0].value='" + emailAddress + "';", regEmailAddress);

	}

	public AbcSubscriptionPage SubmitButtonClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement signUp_submitButton = (WebElement) js.executeScript(
				"return document.querySelector(\"body > route-view\").shadowRoot.querySelector(\"#page-component\").shadowRoot.querySelector(\"#submit-button\")");
		js.executeScript("arguments[0].click();", signUp_submitButton);
		return new AbcSubscriptionPage();
	}

}
