package com.testing.excercise5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
		WebDriver driver;
		By searchInputBy = By.name("field-keywords");
		By searchIconBy  = By.id("nav-search-submit-button");
		By computerCategoryBy = By.xpath("//*[@id=\"n/3839\"]/span/a/span");
		By bookListBy  =  By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']");
		By priceListBy  = By.cssSelector("span[class='a-price-whole']");
		By priceFracBy = By.cssSelector("span[class='a-price-fraction']");
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
		public void openBooks(String text) {
			driver.findElement(searchInputBy).sendKeys(text);
			driver.findElement(searchIconBy).click();
		}	
		
		public void getBookInfo() {
			
			List<WebElement> bookList = driver.findElements(bookListBy);
			List<WebElement> priceList = driver.findElements(priceListBy);
			List<WebElement> priceFrac =  driver.findElements(priceFracBy);
			
			for( int i=0; i<bookList.size(); i++ )
			 {
				System.out.println(bookList.get(i).getText()+" = $" + priceList.get(i).getText() +"."+ priceFrac.get(i).getText());
			}
		}
		
}
