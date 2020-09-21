package com.files.copy.user;


/**
 * 
 * @author bvdam
 *
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;

public class UserFilesCopy {
	
	public static void copyContent(String srcFile, String destFile) {
		try {
			if ((!new File(srcFile).exists())) {
					System.out.println("Sorry!! The source file does not exist.");
			} 
			else {
					FileReader fr = new FileReader(srcFile);
					FileWriter fw = new FileWriter(destFile);
					BufferedReader br = new BufferedReader(fr);
					BufferedWriter bw = new BufferedWriter(fw);
	
					String line = "";
					while ((line = br.readLine()) != null) 
								bw.write(line);
	
					br.close();
					bw.close();
					
					System.out.println("Content copied to "+destFile+" Successfully!!");
					
			}
		} catch (IOException e) {
				System.out.println(e);
		}
	}

	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the source and destination file names with extensions:");
		String srcFile = br.readLine();
		String destFile = br.readLine();

		copyContent(srcFile, destFile);
	}


}
