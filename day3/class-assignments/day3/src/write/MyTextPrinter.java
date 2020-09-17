package write;

public class MyTextPrinter {

	Writer writer;
	
	public void printText(String msg) {
		System.out.println(writer.write(msg));
	}

}
