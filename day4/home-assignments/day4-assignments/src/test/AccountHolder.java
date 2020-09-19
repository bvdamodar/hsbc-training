package test;
/**
 * 
 * @author bvdam
 */
public class AccountHolder {


	public static void main(String[] args) {
		
		Account acc = new Account(58231,"Raj",5000);
		
		//Depost 1000
		try {
			acc.deposit(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//Check Balance
		try {
			acc.getBalance();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//Withdraw 2000
		try {
			acc.withdraw(2000);
		} catch (Exception e) {
			System.out.println(e);
		}

		//Check Balance
		try {
			acc.getBalance();
		} catch (Exception e) {
			System.out.println(e);
		}

		//Withdraw 5000
		try {
			acc.withdraw(5000);
		} catch (Exception e) {
			System.out.println(e);
		}

		//Check Balance
		try {
			acc.getBalance();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//Block Account
		try {
			acc.blockAccount();			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
