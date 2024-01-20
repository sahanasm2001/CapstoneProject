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
     WebDriverWait wait = new WebDriverWait(driver, 50);
     driver.get("http://localhost:8080/FlyAway/");  
     registrationPage = new RegistrationPage(driver);
     signInPage = new SignInPage(driver);
     searchFlightPage = new SearchFlightPage(driver);
     bookingPage = new BookFlightPage(driver);
     confirmationPage = new ConfirmFlightPage(driver);
 }

 @Test
 public void testFlyaway() {
     // Registration
     registrationPage.registerUser("admin@admin.com", "password", "admin", "BLR", "BLR");

     // Sign-in
     signInPage.signIn("admin@admin.com", "password");

     // Search Flight
     searchFlightPage.SearchFlight();

     // Book Flight
     bookingPage.bookflight();

     // Confirm Booking
     confirmationPage.confirmflight();

     // Add assertions based on expected outcomes
//     Assert.assertTrue(confirmationPage.isBookingConfirmed());
 }

 @AfterClass
 public void tearDown() {
     driver.quit();
 }
}

