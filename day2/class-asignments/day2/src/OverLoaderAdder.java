
public class OverLoaderAdder {

	public void add() {
		System.out.println("nOTHING to aDD.");
	}

	public int add(int a, int b) {
		System.out.println("int a + int b = "+(a+b));
		return (a+b);
	}

	public float add(int a, float b) {
		System.out.println("int a + float b = "+(a+b));
		return (a+b);
	}
	
	public double add(int a, double b) {
		System.out.println("int a + double b = "+(a+b));
		return (a+b);
	}
	
	public double add(double a, double b) {
		System.out.println("double a + double b = "+(a+b));
		return (a+b);
	}
	
	public static void main(String[] args) {

		OverLoaderAdder adder = new OverLoaderAdder();
		adder.add();
		adder.add(1, 2);
		adder.add(1, 2.0f);
		adder.add(1, 2.0);
		adder.add(1.0 , 2.0);
		
		
	}

}
