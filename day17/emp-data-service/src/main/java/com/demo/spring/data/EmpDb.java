package com.demo.spring.data;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.hsbc.tr.spring.entity.Emp;

@Repository
public class EmpDb {                   

	private static HashMap<Integer, Emp> db = new HashMap<>();

	public static HashMap<Integer, Emp> getDb() {
		return db;
	}

	public static void setDb(HashMap<Integer, Emp> db) {
		EmpDb.db = db;
	}

	public EmpDb() {
		db.put(100, new Emp(100, "Ram", "Vizag", 60000));
		db.put(101, new Emp(101, "Pavan", "Hyderabad", 60000));
		db.put(102, new Emp(102, "Arjun", "Chennai", 60000));
		db.put(103, new Emp(103, "Raja", "Chennai", 60000));
		db.put(104, new Emp(104, "Rocky", "Goa", 60000));
		db.put(105, new Emp(105, "Pretham", "Bangalore", 65000));
		db.put(106, new Emp(106, "Chandru", "Pune", 60000));
		db.put(107, new Emp(107, "Vamsi", "Pune", 60000));
	}
}
