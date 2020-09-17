package write;

public class MainWriter {

	public static void main(String[] args) {

		Writer h = new HTMLWriter();
		Writer d = new DecoratedWriter();
		Writer p = new PlainTextWriter();
		

		System.out.println(p.write("PLAIN"));
		System.out.println(d.write("DECORATE"));
		System.out.println(h.write("HTML"));
		
		Writer w =MyWriteFactory.getWriter("Plain");
		System.out.println(w.write("Hello Interfaces"));
		

	}

}
