package com.practice.dao;

import java.util.List;

import com.practice.entities.Food;
import com.practice.entities.Food;
import com.practice.exceptions.FoodNotFoundException;
import com.practice.exceptions.DuplicateFoodException;
import com.practice.exceptions.FoodNotFoundException;

public interface FoodItemsDao {

	public Food findById(int id) throws FoodNotFoundException;
	
	public List<Food> listAll();
	
	public String save(Food f) throws DuplicateFoodException;

	public void update(int id, Food a) throws FoodNotFoundException;
	
	public void updateName(int id, String name)throws FoodNotFoundException;

	public void updateSold(int id, int sold) throws FoodNotFoundException;

	public void updateVeg(int id, String veg)throws FoodNotFoundException;
}
