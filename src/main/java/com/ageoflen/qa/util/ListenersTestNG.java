package com.ageoflen.qa.util;
import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ageoflen.qa.base.TestBase;
public class ListenersTestNG extends TestBase implements ITestListener {
	public void onStart(ITestContext context) {	
		System.out.println("onStart method started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");
	}
	
		public void onTestStart(ITestResult result) {
			System.out.println("New Test Started:" +result.getName());
			System.out.println(".....................");
		}
		
		public void onTestSuccess(ITestResult result) {
			System.out.println("onTestSuccess Method:" +result.getName());
			System.out.println(".....................");
		}

		public void onTestFailure(ITestResult result) {
			
			System.out.println("\u001B[31m"+"Test_Case_Failed");
			failed(result.getMethod().getMethodName());
			System.out.println("\u001B[31m" +result.getTestClass()+"\n"+"Method Name:"+result.getName()+"\u001B[0m");
			System.out.println(".....................");
		}
			

	

		public void onTestSkipped(ITestResult result) {
			System.out.println("onTestSkipped Method" +result.getName());
			System.out.println(".....................");
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			System.out.println("onTestFailedButWithinSuccessPercentage" +result.getName());
			System.out.println(".....................");
		}
}