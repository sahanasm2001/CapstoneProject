package com.APITesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RESTAPITesting {

    private static final String BASE_URL = "http://localhost:8080/";

    @Test
    public void testFlightSearchApi() {
        String source = "Bangalore";
        String destination = "Chennai";
        String date = "2024-01-20";

        Response response = RestAssured.given()
                .param("source", source)
                .param("destination", destination)
                .param("date", date)
                .get(BASE_URL + "FlyAway/");

      System.out.println("source="+" "+source);
      System.out.println("destination="+" "+destination);
      System.out.println("date="+" "+date);
      System.out.println("status code="+" "+response.getStatusCode());
    }
    
    @Test
    
    public void testFlightBookingAPI() {
    	String flight_id = "3";
    	String ID = "52";
    	String date = "2024-01-20";
    	
    	Response response = RestAssured.given()
                .param("Flight_ID", flight_id)
                .param("Seat_ID", ID)
                .param("date", date)
                .get(BASE_URL + "FlyAway/memberbookings");

      System.out.println("Flight_ID="+" "+flight_id);
      System.out.println("Seat_ID="+" "+ID);
      System.out.println("date="+" "+date);
      System.out.println("status code="+" "+response.getStatusCode()+ "\n");
    }

}

