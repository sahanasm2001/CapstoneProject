package com.FlyAway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
 private WebDriver driver;
 private WebDriverWait wait;
 public RegistrationPage(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, 50);
 }
 private By loginsignupButton = By.xpath("/html/body/a[2]");
 private By notamembersignup = By.xpath("/html/body/form/table/tbody/tr[3]/td/a");
 private By emailidInput = By.name("email_id");
 private By passwordInput = By.name("pwd");
 private By confirmPasswordInput = By.name("pwd2");
 private By nameInput = By.name("name");
 private By addressInput = By.name("address");
 private By cityInput = By.name("city");
 private By registerButton = By.xpath("/html/body/form/table/tbody/tr[7]/td/button");

 public void registerUser(String email_id, String password, String name, String address, String city) {
	 driver.manage().window().maximize();
//	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 driver.findElement(loginsignupButton).click();
	 driver.findElement(notamembersignup).click();
     driver.findElement(emailidInput).sendKeys(email_id);
     driver.findElement(passwordInput).sendKeys(password);
     driver.findElement(confirmPasswordInput).sendKeys(password);
     driver.findElement(nameInput).sendKeys(name);
     driver.findElement(addressInput).sendKeys(address);
     driver.findElement(cityInput).sendKeys(city);
     driver.findElement(registerButton).click();
 }
}

