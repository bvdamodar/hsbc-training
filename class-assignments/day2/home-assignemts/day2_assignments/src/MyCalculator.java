
public class MyCalculator {

	/**
	 * @author bvdam
	 */
		public int add(int x,int y){
			return (x+y);
		}

		public int dif(int x,int y){
			if(x>=y) {
				return (x-y);
			}
			return (y-x);
		}

		public int multiply(int x,int y){
			return (x*y);
		}

		public int divide(int x,int y){
			return (x/y);
		}


	public static void main(String[] args) {
		
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.add(2, 3));
		System.out.println(mc.dif(2, 3));
		System.out.println(mc.multiply(2, 3));
		System.out.println(mc.divide(2, 3));

		Employee e = new Employee();
		e.calculateSal();
		
		System.out.println("\n");
		Student s = new Student();
		s.calculateMarks();
	}

}

class Student{
	
	String[] stdName = {"Suchit","Akhil","Lucifer","Jack"};
	int[][] marks = {{50,35,25} , {39,30,45}, {42,45,30} , {47,35,40} };

	public void calculateMarks(){
	
	MyCalculator mc  = new MyCalculator();

	System.out.println("STUDENTS\n");
	int i, s=0,p=2;
	for(i=0;i<stdName.length;i++) {
		s= mc.add(marks[i][0],marks[i][1] );
		
		while(p<(marks[i].length)) {
			s = mc.add(s,marks[i][p] );
			p+=1;
		}
		System.out.println(stdName[i]+" got "+s+" marks out of 150.");
		System.out.println(stdName[i]+"'s average is "+ mc.divide(s, stdName.length)+".\n");
		s=0;
	}
	
	}
	
}


class Employee{

	String[] empName = {"Raju","Shyam Sundar","Sherlock"};
	int[][] es1 = {{1050,3500,2000} , {3500,1000,4000}, {2200,1500,1000} };

	public void calculateSal(){
	
	MyCalculator mc  = new MyCalculator();
	
	System.out.println("\nEMPLOYEES\n");
	int i, s=0,p=2;
	for(i=0;i<3;i++) {
		s= mc.add(es1[i][0],es1[i][1] );
		
		while(p<(es1[i].length)) {
			s = mc.add(s,es1[i][p] );
			p+=1;
		}
		System.out.println("Salary of "+empName[i]+" is "+s);
		System.out.println(empName[i]+"'s  Average Salary  is Rs."+mc.divide(s, empName.length)+".\n");
		
		s=0;
	}
	
	}
	
	
}
