package com.hsbc.tr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {

		public static void main(String[] args) {
			Connection conn = null;
			PreparedStatement ps = null;
//			String Select_SQL = "select * from emp";
//			String Select_SQL = "select * from emp where empid =?";  //by INDEX
			String Select_SQL = "select empid,name,city,salary from emp where empid =?";  //by COLUMN
			
			try {
				//Load the driver
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				//Get the connection
				conn =DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");
				
				if (conn != null) {
					System.out.println("Got the Connection from:\n"+conn.getClass().getName()+"\n");
				}
				
				
				ps = conn.prepareStatement(Select_SQL);
				ps.setInt(1, 100);
				ResultSet rs = ps.executeQuery();
				
				while (rs.next()) {
						//by INDEX
//						int id = rs.getInt(1);
//						String name = rs.getString(2);
//						String city = rs.getString(3);
//						double sal = rs.getDouble(4);
					
						//by COLUMN
						int id = rs.getInt("EMPID");
						String name = rs.getString("NAME");
						String city = rs.getString("CITY");
						double sal = rs.getDouble("SALARY");
						System.out.println(id+" "+name+" "+city+" "+sal);
				}
				
				
			} catch (ClassNotFoundException e) {
					System.out.println("Driver could not be Found..");
			} catch (SQLException ex) {
					System.out.println("Exception: "+ex);
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
