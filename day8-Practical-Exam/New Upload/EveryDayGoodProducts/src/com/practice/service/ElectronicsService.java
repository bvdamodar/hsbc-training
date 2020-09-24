package com.practice.service;
/**
 *  @author bvdam
 */
import com.practice.dao.ElectronicsDao;
import com.practice.entities.Electronics;
import com.practice.entities.Electronics;
import com.practice.exceptions.DuplicateElectronicsException;
import com.practice.exceptions.ElectronicsNotFoundException;
import com.practice.exceptions.ElectronicsNotFoundException;

public class ElectronicsService {

	private ElectronicsDao dao;

	public ElectronicsService(ElectronicsDao dao) {
		this.dao = dao;
	}
	
	public String registerElectronics(int id,String name, int sold,int war) throws DuplicateElectronicsException {
		return dao.save(new Electronics(id,  name,sold,war));
	}
	
	public String getElectronicsDetails(int id) throws ElectronicsNotFoundException {
		try {
					Electronics e = dao.findById(id);
					return ("Found: "+e.getItemCode()+", "+e.getItemName()+", "+e.getQuantitySold()+", "+e.getWarranty());
				
		}catch (RuntimeException ew) {
				throw new RuntimeException("getElectronicsDetails: Electronics Not Found.");
		}
	}
	
	public void printElectronicsList() {
		System.out.println("\nElectronics:");
		for(Electronics e: dao.listAll()) {
			System.out.println(e.getItemCode()+", "+e.getItemName()+", "+e.getQuantitySold()+", "+e.getWarranty());
			
		}
	}
	
	public void updateElectronics(int id, Electronics f) {
		try {
			dao.update(id, f);
			System.out.println("Electronics " + id + " updated...");
		} catch (Exception e) {
			System.out.println("Electronics " + id + " doesn't exist");
		}
	}
	
	public void updateElectronicsAttr(int id, String attr, Object val) {
		try {
			if (attr == "name") {
				String newValue = (String) val;
				dao.updateName(id, newValue);
				System.out.println("Electronics " + id + " updated...");
			} else if (attr == "sold") {
				int newValue = (int) val;
				dao.updateSold(id, newValue);
				System.out.println("Electronics " + id + " updated...");
			} else if (attr == "warranty") {
				int newValue = (int) val;
				dao.updateWarranty(id, newValue);
				System.out.println("Electronics " + id + " updated...");
			}  else
				throw new ElectronicsNotFoundException();
		} catch (Exception e) {
			System.out.println("Electronics " + id + " doesn't exist");
		}
	}
	
	
}