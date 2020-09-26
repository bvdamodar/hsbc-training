public class Customer {

	public int custId;
	public String custName;
	public String location;
	public double accBalance;
	
	public Customer() {
		
	}
	
	public Customer(int custId, String custName, String location, double accBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.location = location;
		this.accBalance = accBalance;
	}
	
	@Override
    public String toString() {
        return "Customer{" +
                "id='" + custId + '\'' +
                ", name=" + custName +
                ", location=" + location +
                ", account balance=" + accBalance +                
                '}';
    }
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

}