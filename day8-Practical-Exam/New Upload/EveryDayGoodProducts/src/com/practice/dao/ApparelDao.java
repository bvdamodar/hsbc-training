package com.practice.dao;
/**
 * @author bvdam
 */
import java.util.List;

import com.practice.entities.Apparel;
import com.practice.exceptions.ApparelNotFoundException;
import com.practice.exceptions.DuplicateApparelException;


public interface ApparelDao {

	public Apparel findById(int id) throws ApparelNotFoundException;
	
	public List<Apparel> listAll();
	
	public String save(Apparel f) throws DuplicateApparelException;

	public void update(int id, Apparel a) throws ApparelNotFoundException;
	
	public void updateName(int id, String name)throws ApparelNotFoundException;

	public void updateSold(int id, int sold) throws ApparelNotFoundException;

	public void updateMaterial(int id, String mat)throws ApparelNotFoundException;

	public void updateSize(int id, String city) throws ApparelNotFoundException;
}
