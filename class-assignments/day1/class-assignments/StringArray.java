
public class StringArray {

	public static void main(String[] args) {

		String[] namearray = {"RamSundar", "Shyam", "Kishore","Jay Ram", "Satish", "Hruthik","Mahesh", "Mohan", "Jonny","Sundar"}; 

		String[] grtarray = {"Hi", "Wassup", "Welcome","How DO you Do", "Heyy", "Welcome to You","Hey Man", "Wassup Buddy", "Welcome","Hello"};
	
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"."+namearray[i]+" :\t "+grtarray[i]);
		}
	}

}
