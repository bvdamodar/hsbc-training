package bank;

public class LowBalanceException extends RuntimeException {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Your balance is Low";
	}
	
	public LowBalanceException() {
		
	}

	public LowBalanceException(String msg) {
		super(msg);
	}	
}
