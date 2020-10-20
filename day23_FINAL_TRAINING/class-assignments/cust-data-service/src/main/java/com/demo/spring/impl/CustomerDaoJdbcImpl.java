package com.demo.spring.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.data.CustDB;
import com.demo.spring.entity.Customer;

@Repository
public class CustomerDaoJdbcImpl implements CustomerDao {

	@Autowired
	private CustDB dbStore;

	@Autowired
	private JdbcTemplate jt;

	@Override
	public Customer findById(int custId) {
		System.out.println("Jdbc Find by Id");
		String query = "SELECT * FROM CUSTOMERS WHERE CUSTID =" + custId;
		try {
			Customer c = jt.queryForObject(query, new RowMapper<Customer>() {
				@Override
				public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

					return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
				}
			});
			return c;
//			if (dbStore.getDb().containsKey(custId)) {
//				return dbStore.getDb().get(custId);			

		} catch (Exception e) {
			throw new RuntimeException("Customer Not Found..");
		}

	}

	@Override
	public List<Customer> listAll() {
//		ArrayList<Customer> custList = new ArrayList<>(dbStore.getDb().values());
//		return custList;
		System.out.println("Jdbc List All");
		String query = "SELECT * FROM CUSTOMERS";
		System.out.println(jt);
		try {
			List<Customer> custList = jt.query(query, new RowMapper<Customer>() {
				@Override
				public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

					return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
				}
			});
			return custList;
//			if (dbStore.getDb().containsKey(custId)) {
//				return dbStore.getDb().get(custId);			

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Something went wrong..");
		}
	}

	@Override
	public String save(Customer c) {
		String query = "INSERT INTO CUSTOMERS VALUES(?,?,?)";

		int row = jt.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst = con.prepareStatement(query);
				pst.setInt(1, c.getCustId());
				pst.setString(2, c.getCustName());
				pst.setString(3, c.getMobile());
				return pst;
			}
		});

		if (row >= 1) {
			return "Customer Saved Successfully";
		} else {
			return "Customer Not Saved..";
		}
	}

	@Override
	public String saveCustomer(int id, String name, String mob) {
		Customer c = new Customer(id, name, mob);
		if (CustDB.getDb().containsKey(c.getCustId())) {
			return "Customer already Registered....";
		} else {
			CustDB.getDb().put(c.getCustId(), c);
			return "Customer Saved SUCCESSFULLY....";
		}
	}

}
