package test;

import interfaces.AccountOperationsInterface;
import exception.AccountBlockedException;
import exception.InsufficientBalanceException;

public class Account implements AccountOperationsInterface{

	private int balance = 0,accno = 0;
	private String accHolderName = "";
	private boolean accountBlocked, t=true, f=false;

	public Account(int accno, String accHolderName,int balance) {
		this.accno = accno;
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.accountBlocked = f;
		
		System.out.println("Account for "+accHolderName+" with account number "+accno+" is added with balance of Rs."+balance);
	}
	
	@Override
	public double deposit(double amt) throws AccountBlockedException {
		if (accountBlocked == f) {
			balance += amt;
			System.out.println("Balance after depositing Rs."+amt+" is Rs."+balance);
		} else 
			throw new AccountBlockedException();
		return balance;
		
		
	}

	@Override
	public double withdraw(double amt) throws AccountBlockedException,InsufficientBalanceException{
		if (accountBlocked==t) {
			throw new AccountBlockedException();
		} else {
			if (balance<amt) {
				throw new InsufficientBalanceException();
			} else {
				balance -= amt;
				System.out.println("Balance after withdrawing Rs."+amt+" is Rs."+balance);
			}
		}
		return balance;
	}

	@Override
	public double getBalance() throws AccountBlockedException {
		if (this.accountBlocked)
			throw new AccountBlockedException();
		else
			return balance;
	}

	@Override
	public void blockAccount() {
		accountBlocked = t;
		System.out.println("Acccount is Blocked.");		
	}
	


}
