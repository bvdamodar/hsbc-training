package com.practice.entities;
/**
 *  @author bvdam
 */

public class Electronics {
	private int itemCode, quantitySold,warranty;
	private String itemName;
	
	public Electronics() {

	}
	
	public Electronics(int itemCode, String itemName, int quantitySold,int warranty) {
		this.itemCode = itemCode;
		this.warranty = warranty;
		this.itemName = itemName;
		this.quantitySold = quantitySold;
	}
	

	public int getItemCode() {
		return itemCode;
	}


	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}


	public int getQuantitySold() {
		return quantitySold;
	}


	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	
	
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
	@Override
	public int hashCode() {
		return this.getItemCode();
	}
	@Override
	public boolean equals(Object obj) {
		Electronics f = (Electronics) obj;
		if (f.getItemCode() == this.getItemCode() ) {
			return true;
		}
		return false;
	}
	

}
