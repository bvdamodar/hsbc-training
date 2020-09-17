package write;

public class DecoratedWriter implements Writer {

	@Override
	public String write(String msg) {
		return msg+" is written in DecoratedWriter";
	}
}
