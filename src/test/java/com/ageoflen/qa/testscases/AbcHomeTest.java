package com.ageoflen.qa.testscases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ageoflen.qa.pages.AbcRegisterPage;
import com.ageoflen.qa.pages.AbcHomePage;
import com.ageoflen.qa.base.TestBase;

public class AbcHomeTest extends TestBase {
	AbcHomePage abcHomePage;
	AbcRegisterPage abcRegPage;

	public AbcHomeTest() {
		super();
	}

	@BeforeClass
	public void setUp() throws InterruptedException {
		initialization();
		abcHomePage = new AbcHomePage();
	}

	// Requirement 2-Click “Sign Up” button
	@Test(priority = 2)
	public void signUpButtonClick() throws InterruptedException {
		abcRegPage = abcHomePage.signUpButtonClick();

	}

}
