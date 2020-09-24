package com.practice.service;
/**
 *  @author bvdam
 */
import com.practice.dao.ApparelDao;
import com.practice.entities.Apparel;
import com.practice.exceptions.DuplicateApparelException;


import com.practice.exceptions.ApparelNotFoundException;

public class ApparelService {

	private ApparelDao dao;

	public ApparelService(ApparelDao dao) {
		this.dao = dao;
	}
	
	public String registerApparel(int id,String name, int sold,String size,String veg) throws DuplicateApparelException {
		return dao.save(new Apparel(id,  name,sold,size,veg));
	}
	
	public String getApparelDetails(int id) throws ApparelNotFoundException {
		try {
					Apparel e = dao.findById(id);
					return ("Found: "+e.getItemCode()+", "+e.getItemName()+", "+e.getQuantitySold()+", "+e.getSize()+", "+e.getMaterial());
				
		}catch (RuntimeException ew) {
				throw new RuntimeException("getApparelDetails: Apparel Not Found.");
		}
	}
	
	public void printApparelList() {
		System.out.println("\nApparels:");
		for(Apparel e: dao.listAll()) {
			System.out.println(e.getItemCode()+", "+e.getItemName()+", "+e.getQuantitySold()+", "+e.getSize()+", "+e.getMaterial());
			
		}
	}
	

	public void updateApparel(int id, Apparel emp) {
		try {
			dao.update(id, emp);
			System.out.println("Apparel " + id + " updated...");
		} catch (Exception e) {
			System.out.println("Apparel " + id + " doesn't exist");
		}
	}
	
	public void updateApparelAttr(int id, String attr, Object val) {
		try {
			if (attr == "name") {
				String newValue = (String) val;
				dao.updateName(id, newValue);
				System.out.println("Apparel " + id + " updated...");
			} else if (attr == "sold") {
				int newValue = (int) val;
				dao.updateSold(id, newValue);
				System.out.println("Apparel " + id + " updated...");
			} else if (attr == "size") {
				String newValue = (String) val;
				dao.updateSize(id, newValue);
				System.out.println("Apparel " + id + " updated...");
			} else if (attr == "material") {
				String newValue = (String) val;
				dao.updateMaterial(id, newValue);
				System.out.println("Apparel " + id + " updated...");
			} else
				throw new ApparelNotFoundException();
		} catch (Exception e) {
			System.out.println("Apparel " + id + " doesn't exist");
		}
	}
	
	
	
}