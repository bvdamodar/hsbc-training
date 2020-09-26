import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class File_JSON {
	public static void main(String[] args) {

		Customer[] cust=new Customer[5];
		JSONObject custJson=new JSONObject();
		
		//Insert 5 customers and show them
		for(int i=1;i<6;i++) {
			cust[i-1]=new Customer(200+i,"Name"+i,"Vizag"+i,50000+1000*(i-1));
			System.out.println(cust[i-1]);
		}
		
		//Print Customer's Balance and Location 
		for(int i=0;i<5;i++)
			System.out.println(cust[i].getAccBalance()+" "+cust[i].getLocation() );
		
		//Printing initial JSON
		System.out.println(custJson);
		
		//Inserting Customers
		try {
				custJson.put("customer", cust);
		} catch (JSONException e1) {
				e1.printStackTrace();
		}
		
		//Writing into File
		try {			
				FileWriter fw=new FileWriter("customer.json", true);
				fw.write(custJson.toString());
				fw.close();
				System.out.println("Written into JSON file Succcessfully.");
		}catch(IOException e){
				System.out.println(e);
		}
	}

}