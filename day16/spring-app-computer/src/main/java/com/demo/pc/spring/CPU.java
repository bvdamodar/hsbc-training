package com.demo.pc.spring;

import org.springframework.stereotype.Repository;

@Repository
public class CPU {

	private String cpuType;
	private String cpuFreq;
	
	public String getCpuType() {
		return cpuType;
	}
	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}
	public String getCpuFreq() {
		return cpuFreq;
	}
	public void setCpuFreq(String cpuFreq) {
		this.cpuFreq = cpuFreq;
	}
	public String getSpecs() {
		return cpuType+" "+cpuFreq ;
	}
	
	

}
