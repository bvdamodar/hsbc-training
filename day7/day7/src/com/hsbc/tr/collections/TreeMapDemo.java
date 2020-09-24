package com.hsbc.tr.collections;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap<String, String> stateCapital = new TreeMap<>();
		stateCapital.put("AP","Amaravati");
		stateCapital.put("TS","Hyderabad");
		stateCapital.put("MP","Bhopal");
		stateCapital.put("RJ","Jaipur");
		stateCapital.put("TN","Chennai");
		stateCapital.put("JH","Ranchi");
		stateCapital.put("UP","Lucknow");
		
		System.out.println(stateCapital);
		
		System.out.println(stateCapital.get("JH"));
		
		
		Set<String> keySet = stateCapital.keySet();
		
		Iterator<String> itr  = keySet.iterator();
		
		// vale corrrespondin gto key
		while(itr.hasNext()) {
			String k = itr.next();
			System.out.println(k+" -----> "+stateCapital.get(k));
		}
		
		System.out.println("\n ---------\n ");
		// or by direct values
		Collection<String> values = stateCapital.values();
		
		for(String s:values) {
			System.out.println(s);
		}
		
	}
	
}
