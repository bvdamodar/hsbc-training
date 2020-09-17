package write;

public class HTMLWriter implements Writer {

	@Override
	public String write(String msg) {
		return msg+" is written in HTMLWriter";
	}
}
