package com.FlyAway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmFlightPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public  ConfirmFlightPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}

	public void confirmflight() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("/html/body/a[6]")).click();
		driver.findElement(By.linkText("See Your Bookings")).click();
	}

}


