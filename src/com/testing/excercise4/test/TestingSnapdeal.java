package com.testing.excercise4.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingSnapdeal {

	WebDriver driver;
	PropertiesOfWebPage propertiesOfWebPage;
	String url = "https://www.snapdeal.com";
	String loginCred = "0000000000";
	String username = "Benjamin Linus";
	String password = "***********";
	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(groups = {"high"})
	public  void test001() throws InterruptedException {
		PropertiesOfWebPage propertiesOfWebPage = new PropertiesOfWebPage(driver);
		propertiesOfWebPage.initBrowser(url);
		propertiesOfWebPage.getUserLogin();
		propertiesOfWebPage.moveToLoginPage();
		// 32,33 login options you can select only one at a time
		propertiesOfWebPage.goToGoogleLogin(username , password);
		propertiesOfWebPage.getLoginOptions(loginCred);
	}
	@Test(groups= {"medium"})
	public void test002() {
		System.out.print("Helllo from Test002\n");
	}
	@AfterMethod
	public void closing() {
		driver.quit();
	}
		
}
