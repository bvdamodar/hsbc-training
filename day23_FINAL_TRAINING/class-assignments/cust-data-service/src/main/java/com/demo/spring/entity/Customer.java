package com.demo.spring.entity;

public class Customer {
	
		private int custId;
		private String custName;
		private String mobile;
		
		
		public Customer() {
			System.out.println("Customer Created...");
		}

		public Customer(int custId, String custName, String mobile) {
			this.custId = custId;
			this.custName = custName;
			this.mobile = mobile;
		}
		
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		

}
