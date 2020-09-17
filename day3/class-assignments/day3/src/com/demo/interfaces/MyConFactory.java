package com.demo.interfaces;

import com.demo.impl.mysql.MySql;
import com.demo.impl.oracle.OracleDB;

public class MyConFactory {

	
		public static MyConnection getMyConnection(String dbname) {

			if(dbname.equals("Oracle")){
				return new OracleDB();
			}else if(dbname.equals("MySql")){
				return new MySql();
			}else {
				return null; // just return null at this time only
			}
		
	}

}
