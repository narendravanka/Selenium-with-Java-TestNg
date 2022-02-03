package com.testing.mytube;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Excercise1 {
	WebDriver driver;
	String defaultUrl = "https://www.google.in";
	String url = "http://mytube.techmahindra.com";
	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException {	
		driver.get(defaultUrl);
		driver.navigate().to(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		AssertJUnit.assertEquals("Sign in to your account", driver.getTitle());
		System.out.println("PASS");
		// implicit waits
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// fluent waits
		FluentWait wait = new FluentWait(driver);
		wait.ignoring(NoSuchMethodException.class);
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(0200);
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);	
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
