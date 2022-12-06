package p388;

interface Parseable{
	public abstract void parse(String fileName);
}


class ParserManager{
	public static Parseable getParser(String type) {
		if(type.equals("XML")){
		 return new XMLParser();	
		}else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}

public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser=ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}

}
