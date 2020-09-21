package com.file.attributes;

import java.io.File;
/**
 * 
 * @author bvdam
 *
 */
public class FileAttributes {

	public static void main(String[] args) {
		
		File f = new File("D:\\work\\save.txt");
		
		System.out.println("File Name " + f.getName());
		System.out.println("Path - " + f.getPath());
		System.out.println("Absolute Path " + f.getAbsolutePath());
		System.out.println("Parent - " + f.getParent());
		System.out.println("File exists? " + f.exists());
		System.out.println("File Readable " + f.canRead());
		System.out.println("File Writable? " + f.canWrite());
		System.out.println("File directory " + f.isDirectory());
		System.out.println("Last modified? " + f.lastModified());
		System.out.println("File Size : " + f.length() + "Bytes");

	}

}
