package com.customer.ser;
/**
 * 
 * @author bvdam
 *
 */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.customer.entity.Cust;

public class CustomerDeserializer {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("customers.ser");
		ObjectInputStream objIn = new ObjectInputStream(fis);

		try {
			while (true) {
				Cust e = (Cust) objIn.readObject();

				System.out.println(e.getCustId() + " " + e.getName()+ " " + e.getAddr());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		objIn.close();
		System.out.println("De-Serialised....");

	}

}