package com.demo.spring.data;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;

@Repository
public class CustDB {                   

	private static HashMap<Integer, Customer> db = new HashMap<>();

	public static HashMap<Integer, Customer> getDb() {
		return db;
	}

	public static void setDb(HashMap<Integer, Customer> db) {
		CustDB.db = db;
	}

	public CustDB() {
		db.put(100, new Customer(100, "Ram", "9876543210"));
		db.put(101, new Customer(101, "Sam", "9876543211"));
		db.put(102, new Customer(102, "Dam", "9876543212"));
		db.put(103, new Customer(103, "Shyam", "9876543213"));
		db.put(104, new Customer(104, "Hari", "9876543214"));
	}
}
