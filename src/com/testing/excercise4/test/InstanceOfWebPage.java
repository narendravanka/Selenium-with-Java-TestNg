package com.testing.excercise4.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstanceOfWebPage {
	WebDriver driver;
	static List<WebElement> list;
	static By signinBy = By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]");
	static By loginBy = By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a");
	static By userLoginDeatialsBy = By.name("username");
	static By continueBy = By.id("checkUser");
	static By loginFrameBy = By.xpath("//*[@id=\"loginIframe\"]");
	static By googleLoginBy = By.id("googleUserLogin");
	static By googleUsernameBy = By.name("identifier");
	static By googleUsernameNextBy = By.xpath("//*[@id=\"identifierNext\"]/div/button/span");
	static By googlePasswordBy = By.name("pass");
	static By googlePasswordNextBy = By.linkText("Next");
	public InstanceOfWebPage() {
		
	}
	public static By getSignInBy() {
		return signinBy;
	}
	public static By getLoginBy() {
		return loginBy;
	}
	public static By getuserLoginDetailsBy() {
		return userLoginDeatialsBy;
	}
	public static By getContinueBy() {
		return continueBy;
	}
	public static By getLoginFrameBy() {
		return loginFrameBy;
	}
	public static By getGoogleLoginBy() {
		return googleLoginBy;
	}
	public static By getGoogleLoginUsernameBy() {
		return googleUsernameBy;
	}
	public static By getGoogleLoginUsernameNextBy() {
		return googleUsernameNextBy;
	}
	public static By getGoogleLoginPasswordBy() {
		return googlePasswordBy;
	}
	public static By getGoogleLoginPasswordNextBy() {
		return googlePasswordNextBy;
	}
	public static List<WebElement> getWebElementsAllBy() {
		list.add((WebElement) signinBy);
		list.add((WebElement) loginBy);
		list.add((WebElement) userLoginDeatialsBy);
		list.add((WebElement) continueBy);
		list.add((WebElement) loginFrameBy);
		list.add((WebElement) googleLoginBy);
		list.add((WebElement) googleUsernameBy);
		list.add((WebElement) googleUsernameNextBy);
		list.add((WebElement) googlePasswordBy);
		list.add((WebElement) googlePasswordNextBy);
		return list;
	}
	
 }
	

