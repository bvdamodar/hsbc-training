package q4_loans;

public class Loan {
  private double interest;
  private int noOfYears;
  private double amount;
  
  public Loan() {
    this(2.5, 1, 1000);
  }

  public Loan(double interest, int noOfYears,
      double amount) {
    this.interest = interest;
    this.noOfYears = noOfYears;
    this.amount = amount;
  }

  public double getInterest() {
    return interest;
  }

  public void setInterest(double interest) {
    this.interest = interest;
  }

  public int getnoOfYears() {
    return noOfYears;
  }

  public void setnoOfYears(int noOfYears) {
    this.noOfYears = noOfYears;
  }

  public double getamount() {
    return amount;
  }

  public void setamount(double amount) {
    this.amount = amount;
  }

  public double getMonthlyPayment() {
    double monthlyInterestRate = interest / 1200;
    double monthlyPayment = amount * monthlyInterestRate / (1 -
      (1 / Math.pow(1 + monthlyInterestRate, noOfYears * 12)));
    return monthlyPayment;    
  }

  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * noOfYears * 12;
    return totalPayment;    
  }

	public static void main(String[] args) {
		
		Loan n = new Loan();
		
		System.out.println(n.getamount());
		System.out.println(n.getInterest());
		System.out.println(n.getnoOfYears());
		System.out.println(n.getTotalPayment());
		System.out.println(n.getMonthlyPayment());
		
		Loan l =new Loan(10,2,200000);
		
		System.out.println("\n"+l.getamount());
		System.out.println(l.getInterest());
		System.out.println(l.getnoOfYears());
		System.out.println(l.getTotalPayment());
		System.out.println(l.getMonthlyPayment());
		
		
	}
}