package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String d = "D:\\work\\IO\\demo.txt";
		
		FileOutputStream fos =null;
		FileInputStream fis = null;
		
		try {
		
			File f = new File(d);
			fis= new FileInputStream(f);
			fos= new FileOutputStream("demo1.txt");
			
			int data = 0;
//			while(true) {
//				data = fis.read();
//				if (data== -1) break;
//				System.out.print((char)data);
//								
//			}
			while((data= fis.read()) != -1) {
				
				System.out.print((char)data);
				fos.write(data);				
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			System.out.println("\nFinally..");
			try {
				if (fis != null && fos != null) {
					fis.close();
					fos.close();	
				}
			} catch (Exception e2) {
				System.out.println("File Not Closed.");
			}
		}
		System.out.println("End of task.");
	}
}
