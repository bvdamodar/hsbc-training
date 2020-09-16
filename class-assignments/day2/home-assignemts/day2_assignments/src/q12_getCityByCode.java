
public class q12_getCityByCode {

	/**
	 * @author bvdam
	 */
	public String getCityByCode(int x) {
		switch(x){
		case 1:
			return "DELHI";
		case 2:
			return "NOIDA";
		case 3:
			return "GUARGAON";
		case 4:
			return "BANGLORE";
		default:
			return "INVALIDCODE";
		}
	}

	public static void main(String[] args) {

		q12_getCityByCode q = new q12_getCityByCode();
		System.out.println(q.getCityByCode(1));
		System.out.println(q.getCityByCode(2));
		System.out.println(q.getCityByCode(3));
		System.out.println(q.getCityByCode(4));
		System.out.println(q.getCityByCode(5));
		System.out.println(q.getCityByCode(66));
		System.out.println(q.getCityByCode(-111));

	}

}
