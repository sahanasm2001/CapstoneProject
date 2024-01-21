package com.FlyAway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlyAwayTest {
 private WebDriver driver;
 private WebDriverWait wait;
 private RegistrationPage registrationPage;
 private SignInPage signInPage;
 private SearchFlightPage searchFlightPage;
 private BookFlightPage bookingPage;
 private ConfirmFlightPage confirmationPage;

 @BeforeClass
 public void setUp() {
     System.setProperty("webdriver.edge.driver", "C:\\Users\\sahmurth\\Downloads\\edgedriver_win64\\msedgedriver.exe");
     driver = new EdgeDriver();
     WebDriverWait wait = new WebDriverWait(driver, 10);
     driver.get("http://localhost:8080/FlyAway/");  
     registrationPage = new RegistrationPage(driver);
     signInPage = new SignInPage(driver);
     searchFlightPage = new SearchFlightPage(driver);
     bookingPage = new BookFlightPage(driver);
     confirmationPage = new ConfirmFlightPage(driver);
 }

 @Test
 public void testFlyaway() {
     
     registrationPage.registerUser("admin@admin.com", "password", "admin", "BLR", "BLR");

    
     signInPage.signIn("admin@admin.com", "password");

     
     searchFlightPage.SearchFlight();

     
     bookingPage.bookflight();

     
     confirmationPage.confirmflight();

     
 }

 @AfterClass
 public void tearDown() {
     driver.quit();
 }
}

