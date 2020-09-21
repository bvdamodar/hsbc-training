package com.student;
/**
 * 
 * @author bvdam
 *
 */
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileToArray {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		String[] std = new String[10];
		int i=0;
		
		try {
			fr = new FileReader("students.txt");
			br = new BufferedReader(fr);
			String line = "";
			
			while((line = br.readLine()) != null) {
//				System.out.println(line);
				std[i]=line;
				i+=1;
			}
			
			for (int j = 0; j < std.length; j++) {
				if (std[j]!= null) {
					System.out.println("Student "+(j+1)+" : "+std[j]);
				}
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found ");
		}
		catch(EOFException e) {
			System.out.println("Done Reading");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			
			try {
				if(br != null) {
					br.close();
				}
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}