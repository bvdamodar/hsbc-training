package com.student;
/**
 * 
 * @author bvdam
 *
 */
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class AddStudent {
public void save(Student std) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
				fw = new FileWriter("students.txt", true);
				bw = new BufferedWriter(fw);
				String str = std.getId() + "," + std.getName() + "," + std.getAge() + "," + std.getGender() + "," + std.getLocation() + "\n";
				bw.write(str);
				System.out.println("Written into File Successfully. ");
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found ");
		}
		catch(EOFException e) {
			System.out.println("Done Reading");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				if(bw != null) {
					bw.close();
				}
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}