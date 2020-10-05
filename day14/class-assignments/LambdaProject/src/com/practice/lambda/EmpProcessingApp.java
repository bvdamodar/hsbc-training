package com.practice.lambda;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpProcessingApp {
	
	public static void main(String[] args) {
		Set<Emp> empSet = new HashSet<>();
		empSet.add(new Emp(100, "Rajesh", "Hyderabad", 45000));
		empSet.add(new Emp(101, "Scott", "London", 55000));
		empSet.add(new Emp(102, "Ashish", "Bangalore", 65000));
		empSet.add(new Emp(103, "Shantanu", "Hyderabad", 35000));
		empSet.add(new Emp(104, "Rupa", "Hyderabad", 35000));
		empSet.add(new Emp(105, "Chethan", "Delhi", 45000));
		empSet.add(new Emp(106, "Kirthi", "Bangalore", 75000));
		empSet.add(new Emp(107, "Kamal", "Bangalore", 45000));
		empSet.add(new Emp(108, "Manoj", "Hyderabad", 75000));
		empSet.add(new Emp(109, "Ramesh", "Hyderabad", 65000));
		
		//USE LANBDA AND STREAMS
		
		//List all employees with salary > 50000
		//System.out.println(empSet.stream().filter(e->  e.getSalary()>50000).map(e-> e.getName()).collect(Collectors.toList()));
		//or
		empSet.stream()
		.filter(e->  e.getSalary()>50000)
		.forEach(e-> System.out.println(e.getName()+"'s Salary is "+e.getSalary()));
		
		//Calculate total monthly salary
		System.out.println(empSet.stream().mapToDouble(e->  e.getSalary()).sum());
		
		//list details of all employees from Bangalore
		System.out.println(empSet.stream().map(e->  e.getCity()=="Bangalore").collect(Collectors.toList()));
		
		//update salary of all employees from Hyd to 5000 each
		//System.out.println(empSet.stream().filter(e->   e.getCity()=="Hyderabad").map(e-> e.getSalary()+5000).collect(Collectors.toList()));
		//OR
		EmpPrinter p =new EmpPrinter();
//		empSet.stream().filter(e->   e.getCity()=="Hyderabad").map(e-> {e.getSalary(e.getSalary()+5000);return e;}).forEach(EmpPrinter :: print);//static print
//		empSet.stream().filter(e->   e.getCity()=="Hyderabad").map(e-> {e.getSalary(e.getSalary()+5000);return e;}).forEach(p :: print);
		
		//calculate total monthly salary per month spent on all empl oyees
		empSet.stream().mapToDouble(e-> e.getSalary()).sum();
		System.out.println(empSet.stream().mapToDouble(e-> e.getSalary()).reduce((a, b)-> a+b).getAsDouble());
		
		//stream example
		Stream<Integer> data = Stream.of(1,2,3,4);
		System.out.println(data.mapToInt(n-> n).reduce((x,y)-> x*y).getAsInt());
		
	}
}

class EmpPrinter {
	
	public void print(Emp e) {
		System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getCity()+" "+e.getSalary());
		
	}
}

