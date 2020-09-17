package write;

import com.demo.impl.oracle.OracleDB;

public class MyWriteFactory {

	public static Writer getWriter(String type) {
		if(type.equals("Plain")) {
			return new PlainTextWriter();
		} else if(type.equals("Docorated")) {
			return new DecoratedWriter();
		} else if(type.equals("Html")) {
			return new HTMLWriter();
		}   else {
			return null;
		}
	}
	
}
