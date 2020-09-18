package file;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		String d = "D:\\work\\IO";
		File f = new File(d);
//		boolean x = f.isDirectory()?System.out.println("Its a Directory"):System.out.println("Not a Directory");;

		System.out.println("Directory: "+f.isDirectory());
		System.out.println("Can Write: "+f.canWrite());
	}

}
