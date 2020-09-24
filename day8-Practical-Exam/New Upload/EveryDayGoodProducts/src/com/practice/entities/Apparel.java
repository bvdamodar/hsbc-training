package com.practice.entities;
/**
 *  @author bvdam
 */

public class Apparel {
	private int itemCode, quantitySold;
	private String material,itemName,size;
	
	public Apparel() {

	}
	
	public Apparel(int itemCode, String itemName, int quantitySold,String size,String material) {
		this.itemCode = itemCode;
		this.material = material;
		this.itemName = itemName;
		this.quantitySold = quantitySold;
		this.size = size;
	}
	

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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

	
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
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
		Apparel f = (Apparel) obj;
		if (f.getItemCode() == this.getItemCode() ) {
			return true;
		}
		return false;
	}
	

}
