package com.demo.impl.mysql;

import com.demo.interfaces.MyConnection;
public class MySql  implements MyConnection{

	@Override
	public String getConnectionInfo() {

		
		return "Success: Connection Established for MySql.";
	}

	@Override
	public String getDbDetails() {

		
		return "MySql DB 8.3";
	}

}
