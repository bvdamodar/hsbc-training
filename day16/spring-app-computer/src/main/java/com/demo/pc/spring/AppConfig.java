package com.demo.pc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.demo.pc.spring"})
public class AppConfig {

	@Bean
	public  Ram ram(){
		Ram ram = new Ram();
		ram.setRamSize(16);
		ram.setRamType("DDR4");
		return ram;
	}
	
	@Bean
	public  CPU cpu(){
		CPU cpu = new CPU();
		cpu.setCpuType("Intel core i5");
		cpu.setCpuFreq("3.00GHz");
		return cpu;
	}
	
	@Bean
	public  Storage s(){
		 Storage s = new  Storage();
		 s.setStorageSize(512);
		 s.setStorageType("SSD");
			return s;
	}
	
	@Bean
	public Display display() {
		Display display =new Display();
		display.setResolution("1900*1600");
		display.setDisplayMemory("4GB");
		display.setDisplayType("NVidia G Force");
		return display;
	}

}
