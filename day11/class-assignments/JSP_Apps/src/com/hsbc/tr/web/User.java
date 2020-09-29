package com.hsbc.tr.web;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String userName, password;
	private boolean authenticated;
	private List<String> users = new  ArrayList<>();
	
	public User(){
		users.add("Fatima");
		users.add("Raj");
		users.add("Fatima2");
		users.add("Fatima3");
		users.add("Fatima4");
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAuthenticated() {
		return (userName.equals(password) ) ;		
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}
	
}
