package com.practice.entities;


public class Food {
	private int itemCode, quantitySold;
	private String vegetarian,itemName;
	
	public Food() {

	}
	
	public Food(int itemCode, String itemName, int quantitySold,String vegetarian) {
		this.itemCode = itemCode;
		this.vegetarian = vegetarian;
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

	
	
	public String getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
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
		Food f = (Food) obj;
		if (f.getItemCode() == this.getItemCode() ) {
			return true;
		}
		return false;
	}
	

}
