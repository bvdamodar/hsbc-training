
public class Emp {

	private int empId;
	private String name;
	

	public Emp() {

	}
		
	public Emp(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	public String getEmpInfo() {
		return empId +" "+ name ;
	}

	public int getEmpId() {
		return empId ;
	}
	
	public String getEmpName() {
		return name ;
	}
	
	public void setEmpDetails(int empId,String name) {
		this.empId = empId;
		this.name = name;
		
	}
	public void setEmpId(int empId) {
		this.empId = empId;
		
	}
	
	public void setEmpName(String name) {
		this.name = name;
	}
	
}
