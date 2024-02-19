package com.ageoflen.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ageoflen.qa.base.TestBase;

public class AbcSubscriptionPage extends TestBase {

	@FindBy(xpath = "//*[@id='new-member-signup-page']")
	WebElement subTextmsg;

	public AbcSubscriptionPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifySubPageURL() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}

	public String verifySubPagegetText() {
		String actualString = subTextmsg.getAttribute("subTextmsg");
		System.out.println(actualString);
		return actualString;
	}
}
