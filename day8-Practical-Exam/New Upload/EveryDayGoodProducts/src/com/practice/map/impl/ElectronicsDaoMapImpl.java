package com.practice.map.impl;
/**
 *  @author bvdam
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.practice.dao.ElectronicsDao;
import com.practice.entities.Electronics;
import com.practice.entities.Food;
import com.practice.entities.Electronics;
import com.practice.exceptions.DuplicateElectronicsException;
import com.practice.exceptions.DuplicateElectronicsException;
import com.practice.exceptions.ElectronicsNotFoundException;
import com.practice.exceptions.ElectronicsNotFoundException;
import com.practice.exceptions.ElectronicsNotFoundException;

public class ElectronicsDaoMapImpl implements ElectronicsDao {

	static Map<Integer, Electronics> elecDB = new HashMap<>() ;
	
	public ElectronicsDaoMapImpl() {

	}

public Electronics findById(int id) throws ElectronicsNotFoundException {
		
		if (elecDB.containsKey(id)) {
				return elecDB.get(id);}
				else {
					throw new ElectronicsNotFoundException();				
		}
	}
	
	@Override
	public List<Electronics> listAll() {
			return new ArrayList<Electronics>(elecDB.values());
	}

	@Override
	public String save(Electronics e) throws DuplicateElectronicsException {
		if (elecDB.containsKey(e.getItemCode())) {
			return "Electronics already exists";
		} else {
			elecDB.put(e.getItemCode(), e);
			return "Electronics Item Registered successfully";
		}
	}
	
	@Override
	public void update(int id, Electronics e) throws ElectronicsNotFoundException {
		try {
			if (elecDB.containsKey(id)) {
				elecDB.put(id, e);
			} else
				throw new ElectronicsNotFoundException();
		} catch (ElectronicsNotFoundException ee) {
			throw ee;
		}		
	}
	
	@Override
	public void updateName(int id, String name) throws ElectronicsNotFoundException {
		try {
			if (elecDB.containsKey(id)) {
				Electronics a = elecDB.get(id);
				a.setItemName(name);
				elecDB.put(id, a);
			} else
				throw new ElectronicsNotFoundException();
		} catch (ElectronicsNotFoundException e) {
			throw e;
		}
	}

	

	@Override
	public void updateWarranty(int id, int w) throws ElectronicsNotFoundException {
		try {
			if (elecDB.containsKey(id)) {
				Electronics r = elecDB.get(id);
				r.setWarranty(w);
				elecDB.put(id, r);
			} else
				throw new ElectronicsNotFoundException();
		} catch (ElectronicsNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void updateSold(int id, int sold) throws ElectronicsNotFoundException {
		try {
			if (elecDB.containsKey(id)) {
				Electronics r = elecDB.get(id);
				r.setQuantitySold(sold);
				elecDB.put(id, r);
			} else
				throw new ElectronicsNotFoundException();
		} catch (ElectronicsNotFoundException e) {
			throw e;
		}
	}

	

}
