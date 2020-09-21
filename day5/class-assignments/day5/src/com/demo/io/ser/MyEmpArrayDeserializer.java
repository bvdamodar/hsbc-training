package com.demo.io.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.io.entity.Emp;

public class MyEmpArrayDeserializer {


	public static void main(String[] args) throws Exception {
		
		FileInputStream fos = new FileInputStream("emp2.ser");
		ObjectInputStream objIn = new ObjectInputStream(fos);
		
		try {
			while(true) {
				Emp[] empList = (Emp[]) objIn.readObject();
				System.out.println(empList.length);
				
				for(Emp e: empList) {
						System.out.println(e.getEmpId() + " "+e.getName());
				}
			}
		} catch (EOFException  e) {
			e.printStackTrace();
		}
		
		
		Object obj = objIn.readObject() ;
		System.out.println(objIn.getClass());
		
		Emp e = (Emp) obj;
		System.out.println("id - "+e.getEmpId());
		
		objIn.close();
		System.out.println("Done Array Deserializable...");
		
	}
}
