
public class q8_Student {

	/**
	 * @author bvdam
	 */
	
	// /*
	public q8_Student() {
		//This is the 	DEFAULT constructor of the q8_Student Class
	}
	// */

	public String q8_Student() {
		//This is the 	overloaded  constructor of the q8_Student Class with String return type of student name
		return "Ram";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q8_Student s = new q8_Student();
		System.out.println("Student name is "+s.q8_Student());
	}

	// When I commented default constructor, there is no effect on overloaded constructor and gives output.
}
