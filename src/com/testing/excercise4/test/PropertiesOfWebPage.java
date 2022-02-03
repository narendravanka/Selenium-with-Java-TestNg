package com.testing.excercise4.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PropertiesOfWebPage {
	WebDriver driver;
	InstanceOfWebPage instanceOfWebPage;
	public PropertiesOfWebPage(WebDriver driver) {
		this.driver = driver;
	}
	public void getUserLogin() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(InstanceOfWebPage.signinBy).click();
		driver.findElement(InstanceOfWebPage.getLoginBy()).click();
		Thread.sleep(3000);
	}
	public void moveToLoginPage()
	{
		driver.switchTo().frame(driver.findElement(InstanceOfWebPage.getLoginFrameBy()));
	}
	public void getLoginOptions(String userDetails) {
		driver.findElement(InstanceOfWebPage.getuserLoginDetailsBy()).sendKeys(userDetails);
		try {
		Thread.sleep(3000);
		}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		driver.findElement(InstanceOfWebPage.continueBy).click();
		
		}
	public void goToGoogleLogin(String username, String password) throws InterruptedException {
		driver.findElement(InstanceOfWebPage.getGoogleLoginBy()).click();
		 String MainWindow=driver.getWindowHandle();		
		  Set<String> s1=driver.getWindowHandles();		
	      Iterator<String> i1=s1.iterator();		
	      while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();   		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		                
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    driver.findElement(InstanceOfWebPage.getGoogleLoginUsernameBy()).sendKeys(username);
	                    Thread.sleep(3000);
	                    driver.findElement(InstanceOfWebPage.getGoogleLoginUsernameNextBy()).click();
	                    driver.close();
	                    driver.switchTo().window(MainWindow);	                    
	            }
	        }
	      
	}
	public void initBrowser(String url) {
		driver.get(url);
	}
	
	
}
