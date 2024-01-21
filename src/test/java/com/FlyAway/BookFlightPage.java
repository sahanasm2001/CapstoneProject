package com.FlyAway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookFlightPage {
	WebDriver driver;
	WebDriverWait wait;
	public  BookFlightPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}
	
public void bookflight() {

	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[6]/a")).click();
}

}
