package com.hsbc.tr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

		public static void main(String[] args) {
			Connection conn = null;
			PreparedStatement stmt = null;
			String INSERT_SQL = "insert into emp(empid,name,city,salary) values(?,?,?,?)";
			
			try {
				//Load the driver
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				//Get the connection
				conn =DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");
				
				if (conn != null) {
					System.out.println("Got the Connection from:\n"+conn.getClass().getName()+"\n");
				}
				
//				stmt = conn.createStatement();
//				int rowCount = stmt.executeUpdate(INSERT_SQL);
				
				stmt = conn.prepareStatement(INSERT_SQL);
				stmt.setInt(1, 101);
				stmt.setString(2, "Shyam");
				stmt.setString(3, "Goa");
				stmt.setDouble(4, 37000);
				
				int rowCount = stmt.executeUpdate();
				
				if (rowCount == 1) {
					System.out.println("1 Row Inserted..");
				}
				
			} catch (ClassNotFoundException e) {
					System.out.println("Driver could not be Found..");
			} catch (SQLException ex) {
					System.out.println("Exception: "+ex);
					ex.printStackTrace();
			} finally {
					try {
						if (conn!=null) {
							conn.close();
						}
						} catch (SQLException e) {
								e.printStackTrace();
				}
			}
		}


}
