package com.testing.facebook;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFb {
	WebDriver driver;
	
	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void test001() throws InterruptedException {
		driver.get("https://www.facebook.com");
		WebElement createAnElement =  driver.findElement(By.linkText("Create New Account"));
		createAnElement.click();
		Thread.sleep(3000);	
		System.out.println("Total frames " +  driver.findElements(By.xpath("//iframe")).size() );
		 driver.findElement(By.name("firstname")).sendKeys("Benjamin");
		 driver.findElement(By.name("lastname")).sendKeys("linus");
		 driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("$D4ffgtt^&c");
		 Select day = new Select(driver.findElement(By.id("day")));
			day.selectByIndex(01);
			Select month = new Select(driver.findElement(By.id("month")));
			month.selectByIndex(01);
			Select year = new Select(driver.findElement(By.id("year")));
			year.selectByIndex(24);
			WebElement radio = driver.findElement(By.className("_8esa"));
			radio.click();
			driver.findElement(By.name("websubmit")).click();
		 if ( "https://www.facebook.com/".equalsIgnoreCase(driver.getCurrentUrl())) {
			 System.out.println("Account created successfully" );
		 }
		 else {
			 System.out.println("Failed to create account" );
		 }
	}
	//@AfterTest
	public void close() {
		driver.quit();
	}
}
