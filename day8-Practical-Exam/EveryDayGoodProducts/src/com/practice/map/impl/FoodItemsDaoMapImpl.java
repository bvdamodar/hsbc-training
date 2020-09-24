package com.practice.map.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.practice.dao.FoodItemsDao;
import com.practice.entities.Food;
import com.practice.entities.Food;
import com.practice.exceptions.FoodNotFoundException;
import com.practice.exceptions.DuplicateFoodException;
import com.practice.exceptions.FoodNotFoundException;

public class FoodItemsDaoMapImpl implements FoodItemsDao {

	static Map<Integer, Food> foodDB = new HashMap<>() ;
	
	public FoodItemsDaoMapImpl() {

	}

public Food findById(int id) throws FoodNotFoundException {
		
		if (foodDB.containsKey(id)) {
				return foodDB.get(id);}
				else {
					throw new FoodNotFoundException();				
		}
	}
	
	@Override
	public List<Food> listAll() {
			return new ArrayList<Food>(foodDB.values());
	}
	@Override
	public String save(Food e){
		
		if (foodDB.containsKey(e.getItemCode())) {
			return "Food already exists";
		} else {
			foodDB.put(e.getItemCode(), e);
			return "Food Item Registered successfully";
		}
	}
	
	@Override
	public void update(int id, Food Food) throws FoodNotFoundException {
		try {
			if (foodDB.containsKey(id)) {
				foodDB.put(id, Food);
			} else
				throw new FoodNotFoundException();
		} catch (FoodNotFoundException e) {
			throw e;
		}		
	}
	
	@Override
	public void updateName(int id, String name) throws FoodNotFoundException {
		try {
			if (foodDB.containsKey(id)) {
				Food a = foodDB.get(id);
				a.setItemName(name);
				foodDB.put(id, a);
			} else
				throw new FoodNotFoundException();
		} catch (FoodNotFoundException e) {
			throw e;
		}
	}

	

	@Override
	public void updateVeg(int id, String mat) throws FoodNotFoundException {
		try {
			if (foodDB.containsKey(id)) {
				Food Food = foodDB.get(id);
				Food.setVegetarian(mat);
				foodDB.put(id, Food);
			} else
				throw new FoodNotFoundException();
		} catch (FoodNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void updateSold(int id, int sold) throws FoodNotFoundException {
		try {
			if (foodDB.containsKey(id)) {
				Food Food = foodDB.get(id);
				Food.setQuantitySold(sold);
				foodDB.put(id, Food);
			} else
				throw new FoodNotFoundException();
		} catch (FoodNotFoundException e) {
			throw e;
		}
	}
	

}
