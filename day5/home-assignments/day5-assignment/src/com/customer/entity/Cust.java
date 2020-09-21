package com.customer.entity;
/**
 * 
 * @author bvdam
 *
 */
import java.io.Serializable;

public class Cust implements Serializable{
	private int custId;
	private String name;
	private String addr;

		public Cust(int custId,String name,String addr) {
			this.custId = custId;
			this.name = name;
			this.addr = addr;
		}

		public int getCustId() {
			return custId;
		}

		public void setCustId(int custId) {
			this.custId = custId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}
		
}


