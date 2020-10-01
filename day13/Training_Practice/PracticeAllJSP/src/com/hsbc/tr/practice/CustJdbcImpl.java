package com.hsbc.tr.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustJdbcImpl implements CustDao {

	Connection con = null;
	PreparedStatement pst = null;
	int rowCount = 0;

	@Override
	public int checkCust(String email) {
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select email from CUSTOMERS where email=?");
			pst.setString(1, email);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return 1;
			} else {
				return 0;
			}

		} catch (SQLException ex) {
			// ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		// return e;
	}

	@Override
	public String saveUser(String email, String name, String mob, String pwd) {
		try {
			con = getConnection();
			pst = con.prepareStatement("insert into customers(email,name,phone,password) values(?,?,?,?)");
			pst.setString(1, email);
			pst.setString(2, name);
			pst.setString(3, mob);
			pst.setString(4, pwd);

			rowCount = pst.executeUpdate();

			return "success";

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
	}

	@Override
	public String saveRequest(String email, String tool, String os, String prob) {
		try {
			con = getConnection();
			pst = con.prepareStatement("insert into SUPP_REQUESTS(email,software,os,problem) values(?,?,?,?)");
			pst.setString(1, email);
			pst.setString(2, tool);
			pst.setString(3, os);
			pst.setString(4, prob);

			rowCount = pst.executeUpdate();

			return "success";

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
	}

	
	@Override
	public String login(String email, String pwd) {
		try {
			con = getConnection();
			pst = con.prepareStatement("select * from customers where email =? ");
			pst.setString(1, email);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				pst = con.prepareStatement("select * from customers where email =? and password=?");
				pst.setString(1, email);
				pst.setString(2,pwd);
				ResultSet rs2 = pst.executeQuery();
				if (rs2.next()) {
					return "success";
				}else {
					return "wrongPwd";
				}
			} else {
				return "noCustomer";
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
	}

	@Override
	public List<String> listAll() {
		Connection conn = null;
		List<String> reqList=new ArrayList<String>();
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from SUPP_REQUESTS");
			

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				reqList.add(rs.getString("REQUEST_ID")+" "+rs.getString("EMAIL")+" "
			+rs.getString("OS")+" "+rs.getString("PROBLEM")+" "+rs.getString("SOFTWARE"));
			} 
			return reqList;

		} catch (SQLException ex) {
			// ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
	}
	
	public Connection getConnection() throws SQLException {
		try {

			Class.forName("org.apache.derby.jdbc.ClientDriver");

			con = DriverManager.getConnection("jdbc:derby://localhost:1527/pracdb");

		} catch (ClassNotFoundException e) {
			System.out.println("Derby Driver could not be Found...");

		} catch (SQLException ex) {
			System.out.println("Exception : " + ex);
			ex.printStackTrace();
			throw ex;
		}
		return con;

	}

}
