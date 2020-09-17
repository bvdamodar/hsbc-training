package com.demo.interfaces.app;

import com.demo.impl.mysql.MySql;
import com.demo.impl.oracle.OracleDB;
import com.demo.interfaces.MyConnection;

public class MainApp {


	public static void main(String[] args) {
//		MyConnection con = new OracleDB(); {
		MyConnection con = new MySql();
		
		System.out.println(MyConnection.releasedVer);
		System.out.println(con.getConnectionInfo());
		System.out.println(con.getDbDetails());
		

	}

}
