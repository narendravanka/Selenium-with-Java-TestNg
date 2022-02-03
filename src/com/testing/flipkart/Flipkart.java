package com.testing.flipkart;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	WebDriver driver;
	String url;
@BeforeMethod
public void init() {
	// Initiates browser
	WebDriverManager.chromedriver().setup();
//	WebDriverManager.firefoxdriver().setup();
//	WebDriverManager.edgedriver().setup();
//	WebDriver driver = new HtmlUnitDriver(true);
		
	driver = new ChromeDriver();
	url = "https://www.flipkart.com";
// 	opening facebook.com 
	driver.get("https://www.google.com");
	System.out.println(driver.getCurrentUrl());	
}

@SuppressWarnings("deprecation")
@Test
public void test() {
	driver.navigate().to(url);
	List<WebElement> list = driver.findElements(By.tagName("a"));
    // count 457 links 
	System.out.println(list.size());
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);      
	int i=0;
	 for(WebElement link: list) 
	    {
	    String url = link.getAttribute("href");
	    // displaying all Visible text with link & closing popup modal will display 356 home page lniks
	    if( !link.getText().isEmpty())
	    System.out.println( i++ + "." + link.getText()  +   "    "  + url);
	    }
}


@AfterMethod
public void closeBrower() {
	driver.close();
}
}
