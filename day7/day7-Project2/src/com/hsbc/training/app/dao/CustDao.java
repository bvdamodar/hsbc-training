package com.hsbc.training.app.dao;

import java.util.List;

import com.hsbc.training.app.entity.Customer;
import com.hsbc.training.app.exceptions.CustNotFoundException;
import com.hsbc.training.app.exceptions.DuplicateException;

/**
 * 
 * @author Venkata Damodar B
 *
 */
public interface CustDao {

	/**
	 *   this method finds customer based on id
	 * @param id - id of the customer
	 * @return it returns employee object
	 * @throws CustNotFoundException
	 */
	public Customer searchId(int id) throws CustNotFoundException;
	
	/**
	 * Used to list all the customers stored in this list
	 * @returns a list
	 */
	public List<Customer> listAll();
	
	/**
	 * 
	 * @param c is an Customer object
	 * @return returns saved customer status in String
	 * @throws DuplicateException
	 */
	public String save(Customer c) throws DuplicateException;
	
	/**
	 * 
	 * @param id is id of the customer
	 * @return returns the removed customer status in String
	 * @throws CustNotFoundException
	 */
	public String remove(int id) throws CustNotFoundException;
}
