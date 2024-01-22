package com.FlyAway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchFlightPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
public  SearchFlightPage(WebDriver driver) {
	this.driver = driver;
	this.wait = new WebDriverWait(driver, 10);
}
public void SearchFlight() {
	driver.findElement(By.xpath("/html/body/a[1]")).click();
	WebElement SelectSource = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/select"));
	Select SelecSource = new Select(SelectSource);
	SelecSource.selectByIndex(1);
	SelecSource.selectByValue("1");
	SelecSource.selectByVisibleText("Bangalore");
	WebElement SelectDesti = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/select"));
	Select SelecDesti = new Select(SelectDesti);
	SelecDesti.selectByIndex(1);
	SelecDesti.selectByValue("4");
	SelecDesti.selectByVisibleText("Chennai");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[3]/button")).click();
	
	}
}	

