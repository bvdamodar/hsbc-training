
public class EmpDb {

//	Emp e = new Emp();

	Emp[] empList = new Emp[10];
	int i,x=1;
	public EmpDb() {
		
//		empList[0] = new Emp(100,"Ram");
//		empList[1] = new Emp(101,"Shyam");
		
		empList[0] = new Emp();
		empList[0].setEmpDetails(100, "Ram");
		empList[1] = new Emp();
		empList[1].setEmpDetails(101, "Shyam");

	}
		
	public String addEmp(Emp e) {
		String msg="";
		for(i=0;i<empList.length;i++) {
			if(empList[i]== null) {
				empList[x] = e;
				msg="Added Successfully.";
				break;
			}
			else {
				msg= "DB Full.";
			}
		}
		return msg;
		
	}
//		if (x<9){	
//			x+=1;
//			empList[x] = e;
//		}
//		else {
//			System.out.println("Sorry! List is Full.");
//		}
//	}
	
	public void findEmp(int empId) {
		
		for(i=0;i<empList.length;i++) {
			if(empList[i]!= null) {
				int p =empList[i].getEmpId();
				if (p==empId){
					System.out.println(empList[i]); 
				}
			}
		}
//		return "Not Found";
	}
	
	public void listEmps() {
		for(i=0;i<empList.length;i++) {
			if(empList[i]!= null) {
				System.out.println(empList[i].getEmpInfo());
			}
		}
		
		
	}
	public static void main(String[] args) {

		EmpDb db = new EmpDb();
		Emp e = new Emp();
		e.setEmpDetails(102, "Raj");
//		e.setEmpId(102);
//		e.setEmpName("Raj");
		System.out.println(db.addEmp(e));
		db.listEmps();
//		System.out.println(db.findEmp(100));
//		db.findEmp(104);

	}

}
