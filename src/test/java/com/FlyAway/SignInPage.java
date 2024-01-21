package com.FlyAway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
 private WebDriver driver;
 private WebDriverWait wait;

 public SignInPage(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, 10);
 }

 private By emailidInput = By.name("email_id");
 private By passwordInput = By.name("pwd");
 private By signInButton = By.xpath("/html/body/form/table/tbody/tr[3]/td/button");

 public void signIn(String email_id, String pwd) {
	 driver.get("http://localhost:8080/FlyAway/login");
     driver.findElement(emailidInput).sendKeys(email_id);
     driver.findElement(passwordInput).sendKeys(pwd);
     driver.findElement(signInButton).click();
 }
}

