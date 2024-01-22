package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class BookedSeats {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/flyaway";
		String UN  = "root";
		String PWD = "";
		String qry = "select * from f_bookings where booking_date LIKE '2024-01-20%'";
		
		try {
			Connection conn = DriverManager.getConnection(URL, UN, PWD);
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(qry);
			while (rs.next()) {	
				System.out.println("SeatNum="+" "+rs.getString("ID")+" "+"flight_id="+" "+rs.getString("flight_id")+" "+"booking_date="+" "+rs.getString("booking_date"));	
			}	
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
