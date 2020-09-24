package com.practice.service;

import com.practice.dao.FoodItemsDao;
import com.practice.entities.Food;
import com.practice.entities.Food;
import com.practice.exceptions.FoodNotFoundException;
import com.practice.exceptions.DuplicateFoodException;
import com.practice.exceptions.FoodNotFoundException;

public class FoodService {

	private FoodItemsDao dao;

	public FoodService(FoodItemsDao dao) {
		this.dao = dao;
	}
	
	public String registerFood(int id,String name, int sold,String veg) throws DuplicateFoodException {
		return dao.save(new Food(id,  name,sold,veg));
	}
	
	public String getFoodDetails(int id) throws FoodNotFoundException {
		try {
					Food e = dao.findById(id);
					return ("Found: "+e.getItemCode()+", "+e.getItemName()+", "+e.getQuantitySold()+", "+e.getVegetarian());
				
		}catch (RuntimeException ew) {
				throw new RuntimeException("getFoodDetails: Food Not Found.");
		}
	}
	
	public void printFoodList() {
		System.out.println("\nFood Items:");
		for(Food e: dao.listAll()) {
			System.out.println(e.getItemCode()+", "+e.getItemName()+", "+e.getQuantitySold()+", "+e.getVegetarian());
			
		}
	}
	
	public void updateFood(int id, Food f) {
		try {
			dao.update(id, f);
			System.out.println("Food " + id + " updated...");
		} catch (Exception e) {
			System.out.println("Food " + id + " doesn't exist");
		}
	}
	
	public void updateFoodAttr(int id, String attr, Object val) {
		try {
			if (attr == "name") {
				String newValue = (String) val;
				dao.updateName(id, newValue);
				System.out.println("Food " + id + " updated...");
			} else if (attr == "sold") {
				int newValue = (int) val;
				dao.updateSold(id, newValue);
				System.out.println("Food " + id + " updated...");
			} else if (attr == "size") {
				String newValue = (String) val;
				dao.updateVeg(id, newValue);
				System.out.println("Food " + id + " updated...");
			}  else
				throw new FoodNotFoundException();
		} catch (Exception e) {
			System.out.println("Food " + id + " doesn't exist");
		}
	}
	
	
}