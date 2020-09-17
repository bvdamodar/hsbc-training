
public class PassByValue {

	int x=20;
	String[] names = {"a","b","c"};
	public void display() {
		x = 10;
		System.out.println("x = "+x);
	}
//	System.out.println(x);
	
	public static void main(String[] args) {

		PassByValue p = new PassByValue();

		p.display();
		System.out.println(p.x);
			
		for(int i=0;i<3;i++) {
			System.out.println(p.names[i]);
				
		}
		p.names[2] = "z"; // Object refernece reassigning
		

		String[] names2 = p.names; 
		
		for(int i=0;i<3;i++) {
			System.out.println(names2[i]);
				
		}
		System.out.println(p.names ==names2);

	}

}
