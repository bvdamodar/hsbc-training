package com.hsbc.training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.demo.io.entity.Emp;

public class EmpDemo {

	public static void main(String[] args) {
		
		HashSet<Emp> emp = new HashSet(); 	
		
		Emp[] e = new Emp[5];
		for (int i = 0; i < e.length; i++) {
			e[i] = new Emp(11+i,"Emp"+i,"Vijag"+i,45000+(1000*i));
			emp.add(e[i]);
//			System.out.println(e[i]);
		}
		System.out.println(emp+"\n");

//		emp.remove(o);

		// finding specific employee
		for (Emp d : emp) {
		  	if (((Emp) d).getEmpId() == 11)
				System.out.println(((Emp) d).getEmpId() + " " + ((Emp) d).getName());
		}
		
		// remove details of employee by id
				for (Emp e1 : emp) {
					if (((Emp) e1).getEmpId() == 13) {
						emp.remove(e1);
						System.out.println("Item 13 removed");
					} else {
						System.out.println("Item 13 not found");
					}
					break;
				}
		System.out.println(emp+"\n");
		
		Iterator<Emp> itr = emp.iterator();
		
		while(itr.hasNext()){
			Emp n = itr.next();
			System.out.println("Id: "+n.getEmpId()+", Name: "+ n.getName()+", City: "+n.getCity()+", Salary: "+n.getSalary());
		}
		
		
	}
}
