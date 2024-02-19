package com.ageoflen.qa.testscases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ageoflen.qa.pages.AbcRegisterPage;
import com.ageoflen.qa.pages.AbcSubscriptionPage;

public class AbcSubscriptionTest {

	AbcRegisterPage abcRegPage;
	AbcSubscriptionPage abcSubPage;

	public AbcSubscriptionTest() {
		super();
	}

	// Requirement 4-Verify that https://www.abcmouse.com/abt/subscription page is
	// returned.
	
	@Test(priority = 1)
	public void verifySubcritpionPageURLTest() {
		String regPageageURL = abcSubPage.verifySubPageURL();
		Assert.assertEquals(regPageageURL, "https://www.abcmouse.com/abc/subscription/");

	}

	// Requirement 5-Verify that on subscription page, “new-member-signup-page” text is
	// rendered.
	
	@Test(priority = 2)

	public void verifygetTextTest() {
		String regPageageURL = abcSubPage.verifySubPagegetText();
		Assert.assertEquals(regPageageURL, "new-member-signup-page");

	}

}
