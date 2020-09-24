package com.hsbc.tr.collections;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesDemo {
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		System.out.println("Date: "+date);
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("Today is day "+c.getTime());
		
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(date));
		
		String d = "23/09/2020";
		
//		System.out.println(df.parseObject(d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d");
		
		System.out.println(sdf.parse(d));
		
		
	}
}
