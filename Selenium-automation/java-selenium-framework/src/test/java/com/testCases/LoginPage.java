package com.testCases;

import com.locatorsPath.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginPage {
	
	WebDriver driver = new ChromeDriver();
	loginPath loginPath = new loginPath(driver);

	@Test
	public void f() {

		loginPath.loginApplication("Admin", "admin123");

	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@AfterSuite
	public void afterSuite() {

		driver.quit();
	}

}
