package write;

public class PlainTextWriter implements Writer {

	@Override
	public String write(String msg) {
		return msg+" is written in PlainTextWriter";
	}
}
