
public class StringConcat {

	public static void main(String[] args) {

		int x = args.length;
		String s = "";
		System.out.println(x);
		for(int i=0;i<x;i++) {
			s+= " "+args[i];
		}
		System.out.println(s);
		
		
	}

}
