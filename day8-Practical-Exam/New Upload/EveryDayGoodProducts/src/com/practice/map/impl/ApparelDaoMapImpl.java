package com.practice.map.impl;
/**
 *  @author bvdam
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.practice.dao.ApparelDao;
import com.practice.entities.Apparel;
import com.practice.exceptions.DuplicateApparelException;


import com.practice.exceptions.ApparelNotFoundException;

public class ApparelDaoMapImpl implements ApparelDao {

	static Map<Integer, Apparel> ApparelDB = new HashMap<>() ;
	
	public ApparelDaoMapImpl() {

	}

public Apparel findById(int id) throws ApparelNotFoundException {
		
		if (ApparelDB.containsKey(id)) {
				return ApparelDB.get(id);}
				else {
					throw new ApparelNotFoundException();				
		}
	}
	
	@Override
	public List<Apparel> listAll() {
			return new ArrayList<Apparel>(ApparelDB.values());
	}
	@Override
	public String save(Apparel e){
		
		if (ApparelDB.containsKey(e.getItemCode())) {
			return "Apparel already exists";
		} else {
			ApparelDB.put(e.getItemCode(), e);
			return "Apparel Item Registered successfully";
		}
	}

	@Override
	public void update(int id, Apparel Apparel) throws ApparelNotFoundException {
		try {
			if (ApparelDB.containsKey(id)) {
				ApparelDB.put(id, Apparel);
			} else
				throw new ApparelNotFoundException();
		} catch (ApparelNotFoundException e) {
			throw e;
		}		
	}
	
	@Override
	public void updateName(int id, String name) throws ApparelNotFoundException {
		try {
			if (ApparelDB.containsKey(id)) {
				Apparel a = ApparelDB.get(id);
				a.setItemName(name);
				ApparelDB.put(id, a);
			} else
				throw new ApparelNotFoundException();
		} catch (ApparelNotFoundException e) {
			throw e;
		}
	}

	

	@Override
	public void updateMaterial(int id, String mat) throws ApparelNotFoundException {
		try {
			if (ApparelDB.containsKey(id)) {
				Apparel Apparel = ApparelDB.get(id);
				Apparel.setMaterial(mat);
				ApparelDB.put(id, Apparel);
			} else
				throw new ApparelNotFoundException();
		} catch (ApparelNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void updateSold(int id, int sold) throws ApparelNotFoundException {
		try {
			if (ApparelDB.containsKey(id)) {
				Apparel Apparel = ApparelDB.get(id);
				Apparel.setQuantitySold(sold);
				ApparelDB.put(id, Apparel);
			} else
				throw new ApparelNotFoundException();
		} catch (ApparelNotFoundException e) {
			throw e;
		}
	}
	
	@Override
	public void updateSize(int id, String size) throws ApparelNotFoundException {
		try {
			if (ApparelDB.containsKey(id)) {
				Apparel Apparel = ApparelDB.get(id);
				Apparel.setSize(size);
				ApparelDB.put(id, Apparel);
			} else
				throw new ApparelNotFoundException();
		} catch (ApparelNotFoundException e) {
			throw e;
		}
	}

}
