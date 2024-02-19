package com.ageoflen.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.ageoflen.qa.util.TestUtil;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.ageoflen.qa.util.ListenersTestNG;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			// loading config prop file
			FileInputStream input = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/ageoflen/qa/config/config.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() throws InterruptedException {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			ChromeOptions options = new ChromeOptions();
			// Removing the chrome browser msg browser being controlled by AUtomation
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			// options.addArguments("--headless");
			driver = new ChromeDriver(options);
		} 
		

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url_Abc_Home_Page"));
		// Loading the Global Wait time
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));

	}

	public void failed(String testMethodName) {

		// screenshots for Failure Test Scripts
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// The below method will save the screen shot in destination directory with name
			// "screenshot.png"
			FileHandler.copy(scrFile, new File("./Screenshots/" + testMethodName + "_" + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
