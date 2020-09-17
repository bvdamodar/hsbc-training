package com.demo.impl.oracle;

import com.demo.interfaces.MyConnection;
public class OracleDB  implements MyConnection{

	@Override
	public String getConnectionInfo() {

		
		return "Success: Connection Established.";
	}

	@Override
	public String getDbDetails() {

		
		return "Oracle DB 13c";
	}

}
