
public class IncomeTaxDeductions {


	/**
	 * @author bvdam
	 */
	
	String[] empName = {"Raj","Shyam","Tony"};
	int[] empSal = {10500,35000,20000};
	
	public int TaxAmount(String s) {
		for(int i=0;i<empSal.length;i++) {
			if (s.equals(empName[i])){
				return empSal[i];
			}			
		}
		return 0;
	}

	public static void main(String[] args) {

		IncomeTaxDeductions tax = new IncomeTaxDeductions();
		
		System.out.println("Tax Amount of Raj is Rs."+  tax.TaxAmount("Raj"));
		System.out.println("Tax Amount of Tony is Rs."+  tax.TaxAmount("Tony"));
		System.out.println("Tax Amount of Sony is Rs."+  tax.TaxAmount("Sony"));		

	}

}
