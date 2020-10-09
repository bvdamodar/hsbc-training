package com.demo.pc.spring;

import org.springframework.stereotype.Repository;

@Repository
public class Storage {
	private String storageType;
	private int storageSize;
	
	public String getStorageType() {
		return storageType;
	}
	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}
	public int getStorageSize() {
		return storageSize;
	}
	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	public String getSpecs() {
		return storageType +" "+storageSize;
	}
	
}
