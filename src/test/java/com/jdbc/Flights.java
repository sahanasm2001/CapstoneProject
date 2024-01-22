package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Flights {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/flyaway";
		String UN  = "root";
		String PWD = "";
		String qry = "select * from f_flights";
		
		try {
			Connection conn = DriverManager.getConnection(URL, UN, PWD);
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(qry);
			while (rs.next()) {	
				System.out.println("flight_id="+" "+rs.getString("ID")+" "+"destination="+" "+rs.getString("destination")+" "+"departure="+" "+rs.getString("departure")+" "+"price="+" "+rs.getString("price"));	
			}	
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
