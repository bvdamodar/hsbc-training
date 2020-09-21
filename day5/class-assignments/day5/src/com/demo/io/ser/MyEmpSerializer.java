package com.demo.io.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.*;

public class MyEmpSerializer {


	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream objOut = new ObjectOutputStream(fos);

		for(int i=1;i<10;i++) {
			Emp emp= new Emp(100+i, "Emp"+i, "City"+i, 6000+i);
			
			objOut.writeObject(emp);
			}
		objOut.close();
		System.out.println("Done Serialized...");
		
	}
}
