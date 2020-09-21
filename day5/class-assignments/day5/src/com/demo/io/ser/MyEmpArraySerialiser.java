package com.demo.io.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;
import com.demo.io.entity.EmpWrapper;

public class MyEmpArraySerialiser {


	public static void main(String[] args) throws Exception {
		
		Emp empList[] = new Emp[10];
		FileOutputStream fos = new FileOutputStream("emp2.ser");
		ObjectOutputStream objOut = new ObjectOutputStream(fos);

		for (int i = 0; i < 10; i++) {
			empList[i] = new Emp(100+i, "Emp"+i, "City"+i, 5000+(100*i));
		}
		
//		EmpWrapper ew = new EmpWrapper();
//		ew.setEmpList(empList);
		
		objOut.writeObject(empList);
		
		objOut.close();
		System.out.println("Done Array Serializable...");
		
	}
}

