package bank;

public class Main {

	public static void main(String[] args) {

		BankAccount b= new BankAccount(10000.0);
		
		b.withdraw(4500);
		b.withdraw(2000);
		b.withdraw(2);
		b.withdraw(1499);
		
		System.out.println("Done Successfully.");
//		if (x!=0.0) {
//			System.out.println("Balance is "+x);	
//		}else {
//			System.out.println("Sorry, Balance is 0. ");	
//			
//		}
		
	}

}
