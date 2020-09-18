package bank;

public class BankAccount {

	private double balance = 0.0;

	LowBalanceException l =new LowBalanceException();
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	public double withdraw(double amt) {
		try {
			
		if (balance<amt){
//			return 0;
//			throw LowBalanceException("");
			throw l;
		}
		else {
			balance -= amt;
			System.out.println("Transaction Success. New Balance - "+balance);
		 }

		} catch (LowBalanceException e) { 
			System.out.println(e);
			throw e;
		}
		return balance;
	}
}
