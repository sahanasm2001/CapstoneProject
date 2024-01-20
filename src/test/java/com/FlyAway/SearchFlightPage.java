package com.FlyAway;

import java.sql.Driver;

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
	this.wait = new WebDriverWait(driver, 50);
}
public void SearchFlight() {
//	WebDriverWait wait = new WebDriverWait(driver, 10);
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
	
// private WebDriver driver;
//
// public SearchFlightPage(WebDriver driver) {
//     this.driver = driver;
// }
//
// private By sourceInput = By.xpath("/html/body/form/table/tbody/tr/td[1]/select");
// private By destinationInput = By.xpath("/html/body/form/table/tbody/tr/td[2]/select");
// private By submitButton = By.xpath("/html/body/form/table/tbody/tr/td[3]/button");
//
// public void searchFlight(String source, String destination, String date) {
//     driver.findElement(sourceInput).sendKeys(source);
//     driver.findElement(destinationInput).sendKeys(destination);
//     driver.findElement(submitButton).click();
// }
	}
}	

