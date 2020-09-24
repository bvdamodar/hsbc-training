package com.practice.main;

import com.practice.dao.ApparelDao;
import com.practice.dao.ElectronicsDao;
import com.practice.dao.FoodItemsDao;
import com.practice.map.impl.ApparelDaoMapImpl;
import com.practice.map.impl.ElectronicsDaoMapImpl;
import com.practice.map.impl.FoodItemsDaoMapImpl;
import com.practice.service.ApparelService;
import com.practice.service.ElectronicsService;
import com.practice.service.FoodService;



public class Main {

	public static void main(String[] args) {
		
		ApparelDao adao = new ApparelDaoMapImpl();
		ApparelService aes = new ApparelService(adao);


		FoodItemsDao fdao = new FoodItemsDaoMapImpl();
		FoodService fes = new FoodService(fdao);

		ElectronicsDao edao = new ElectronicsDaoMapImpl();
		ElectronicsService ees = new ElectronicsService(edao);
		
		try {

			System.out.println(fes.registerFood(101, "Milk",40,"Yes"));
			System.out.println(fes.registerFood(102, "Curd",20,"Yes"));
			System.out.println(fes.registerFood(111, "Cake",12,"No")+"\n");
			
			System.out.println(aes.registerApparel(222, "T-Shirt",50,"Large","Cotton"));
			System.out.println(aes.registerApparel(432, "Shirt",32,"Medium","Cotton"));
			System.out.println(aes.registerApparel(325, "Sweater",20,"Medium","Woolen")+"\n");
			
			System.out.println(ees.registerElectronics(1013, "TV",100,12));
			System.out.println(ees.registerElectronics(1026, "Mobile",97,24));
			System.out.println(ees.registerElectronics(1114, "Watch",54,18)+"\n");
			
			fes.printFoodList();
			aes.printApparelList();
			ees.printElectronicsList();
			
			System.out.println("\n"+aes.getApparelDetails(222));
			System.out.println(fes.getFoodDetails(111));
			System.out.println(ees.getElectronicsDetails(1013));

			aes.updateApparelAttr(222, "material", "Woolen");
			aes.printApparelList();
			
			fes.updateFoodAttr(102, "name", "Butter Milk");
			fes.printFoodList();
			
			ees.updateElectronicsAttr(1026, "sold", 99);
			ees.printElectronicsList();
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
	}

}
