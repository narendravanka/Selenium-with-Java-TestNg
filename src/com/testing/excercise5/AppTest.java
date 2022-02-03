package com.testing.excercise5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

	WebDriver driver;
	String url = "https://www.amazon.com";
	String text = "Selenium webdriver book";

	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test001() {
		driver.get(url);
		HomePage homePage = new HomePage(driver);
		homePage.openBooks(text);
		homePage.getBookInfo();
	}
	

}
