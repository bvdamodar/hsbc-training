package com.practice.main;
/**
 *  @author bvdam
 */
import java.util.Scanner;

import com.practice.dao.ApparelDao;
import com.practice.dao.ElectronicsDao;
import com.practice.dao.FoodItemsDao;
import com.practice.map.impl.ApparelDaoMapImpl;
import com.practice.map.impl.ElectronicsDaoMapImpl;
import com.practice.map.impl.FoodItemsDaoMapImpl;
import com.practice.service.ApparelService;
import com.practice.service.ElectronicsService;
import com.practice.service.FoodService;



public class MainProgram {

	public static void main(String[] args) {
		
		ApparelDao adao = new ApparelDaoMapImpl();
		ApparelService aes = new ApparelService(adao);


		FoodItemsDao fdao = new FoodItemsDaoMapImpl();
		FoodService fes = new FoodService(fdao);

		ElectronicsDao edao = new ElectronicsDaoMapImpl();
		ElectronicsService ees = new ElectronicsService(edao);
		
		try {

			//This is to show the basic features implemented for the products.
			
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
			
			//This is user drive program for taking input from the user and doing the respective task.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose any one of the following : \n1. Food Items\n2. Apparel\n3. Electronics. \nEnter 1 or 2 or 3 : ");
			int x,inp = sc.nextInt();
			switch (inp) {
			case 1:{
				System.out.println("Choose any one of the following : \n1. Food Items add. \n2. Food Update\n\nEnter 1 or 2  : ");
				x = sc.nextInt();
				if (x==1) {
					
				} else if (x==2){

				}
			}
				
				break;
			case 2:{
				System.out.println("Choose any one of the following : \n1. Add Apparels. \n2. Update Apparels\n\nEnter 1 or 2  : ");
				x = sc.nextInt();
				if (x==1) {
					
				} else if (x==2){

				}
			}
			break;
				case 3:{
					System.out.println("Choose any one of the following : \n1. Add Electronics. \n2. Update Electronics\n\nEnter 1 or 2  : ");
					x = sc.nextInt();
					if (x==1) {
						
					} else if (x==2){

					}
				}
			default:
				break;
			}
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
	}

}
