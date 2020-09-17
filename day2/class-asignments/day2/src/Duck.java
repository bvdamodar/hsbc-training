
public class Duck {

	
	static {
		System.out.println("Static Runs!!");
	}
	
//	int duckCount = 0;
	static int duckCount = 0;
	
	public Duck() {
		System.out.println("Duck is Created!!");
		duckCount++;
	}
	public static String getDuckBreed() {
		return "Swedish Duck";
	}

}
