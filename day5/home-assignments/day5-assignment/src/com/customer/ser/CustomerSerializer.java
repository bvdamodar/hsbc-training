package com.customer.ser;
/**
 * 
 * @author bvdam
 *
 */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.customer.entity.Cust;

public class CustomerSerializer {


	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("customers.ser");
		ObjectOutputStream objOut = new ObjectOutputStream(fos);

		for(int i=1;i<4;i++) {
			Cust c= new Cust(100+i, "Cust"+i, "Address"+i);
			
			objOut.writeObject(c);
			}
		objOut.close();
		System.out.println("Done Serialized...");
		
	}
}
