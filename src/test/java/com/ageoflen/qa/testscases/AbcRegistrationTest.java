package com.ageoflen.qa.testscases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ageoflen.qa.base.TestBase;
import com.ageoflen.qa.pages.AbcHomePage;
import com.ageoflen.qa.pages.AbcRegisterPage;
import com.ageoflen.qa.pages.AbcSubscriptionPage;

public class AbcRegistrationTest extends TestBase {

	AbcRegisterPage abcRegPage;
	AbcSubscriptionPage abcSubPage;

	public AbcRegistrationTest() {
		super();
	}

	@Test(priority = 1)
	// Requirement 3-Verify that  https://www.abcmouse.com/abt/register page is
	// returned
	public void verifyRegPageURLTest() {
		String regPageageURL = abcRegPage.verifySignUpPageURL();
		Assert.assertEquals(regPageageURL, "https://www.abcmouse.com/abc/prospect-register/");

	}

	@Test(priority = 2)
	public void enterEmailRegPageTest() {
		abcRegPage.enterEmailAddress();

	}

	@Test(priority = 3)
	public void submitButtonClickTest() {
		abcSubPage = abcRegPage.SubmitButtonClick();
		;

	}

}
