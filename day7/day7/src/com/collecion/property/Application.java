package com.collecion.property;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Application {

	public static void main(String[] args) {

		Properties props = System.getProperties();
		
		System.out.println(props+"\n");
		
		
		Set<Object> keySet = props.keySet();
		
		Iterator<Object> itr  = keySet.iterator();
		
		// vale corrrespondin gto key
		int i=1;
		while(itr.hasNext()) {
			Object k = itr.next();
			System.out.println(i+" "+k+" -----> "+props.get(k));
			i+=1;
		}

	}

}
