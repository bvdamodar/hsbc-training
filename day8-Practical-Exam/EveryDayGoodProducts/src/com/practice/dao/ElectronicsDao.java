package com.practice.dao;

import java.util.List;

import com.practice.entities.Electronics;
import com.practice.entities.Electronics;
import com.practice.exceptions.DuplicateElectronicsException;
import com.practice.exceptions.ElectronicsNotFoundException;
import com.practice.exceptions.ElectronicsNotFoundException;

public interface ElectronicsDao {

	public Electronics findById(int id) throws ElectronicsNotFoundException;
	
	public List<Electronics> listAll();
	
	public String save(Electronics f) throws DuplicateElectronicsException;

	public void update(int id, Electronics a) throws ElectronicsNotFoundException;
	
	public void updateName(int id, String name)throws ElectronicsNotFoundException;

	public void updateSold(int id, int sold) throws ElectronicsNotFoundException;

	public void updateWarranty(int id, int w)throws ElectronicsNotFoundException;
}
