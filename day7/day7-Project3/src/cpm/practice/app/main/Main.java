package cpm.practice.app.main;

import cpm.practice.app.dao.EmpDao;
import cpm.practice.app.entity.Emp;
import cpm.practice.app.impl.EmpMapImpl;
import cpm.practice.app.service.EmpService;

public class Main {

		public static void main(String[] args) {
			
			EmpDao dao = new EmpMapImpl();
			EmpService es = new EmpService(dao);
			
			try {
				System.out.println(es.registerEmp(101, "Shyam","Vizag", 25000));
				System.out.println(es.registerEmp(102, "Dam","Vizag", 50000));
				System.out.println(es.registerEmp(103, "Ram","GOa", 45000));
				es.printAll();
				System.out.println(es.search(102));
				es.updateEmployee(103, new Emp(103, "Ram", "Hyderabad", 26000));
				es.printAll();
				es.removeEmp(103);
				es.printAll();
				es.updateEmployeeAttr(100, "name", "Aakash");
				es.updateEmployeeAttr(101, "city", "Pune");
				es.updateEmployeeAttr(102, "salary", 26000);
				es.printAll();
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}
