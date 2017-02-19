package parcer_SAX_16;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MainSAX {

	public static void main(String[] args) {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		try {
			SAXParser sp = spf.newSAXParser();
			sp.parse(new File("src/parcer_SAX_16/_01_students.xml"), new StudentsHandler());

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class StudentsHandler extends DefaultHandler {
	boolean login = false;
	boolean faculty = false;
	boolean phone = false;
	boolean address = false;

	public void startElement(String uri, String localName,String qName,
                Attributes attributes) throws SAXException {

		System.out.println("Start Element :" + qName);

		if (qName.equalsIgnoreCase("LOGIN")) {
			login = true;
		}

		if (qName.equalsIgnoreCase("FACULTY")) {
			faculty = true;
		}

		if (qName.equalsIgnoreCase("PHONE")) {
			phone = true;
		}

		if (qName.equalsIgnoreCase("ADDRESS")) {
			address = true;
		}

	}

	public void endElement(String uri, String localName,
		String qName) throws SAXException {

		System.out.println("End Element :" + qName);

	}

	public void characters(char ch[], int start, int length) throws SAXException {

		if (login) {
			System.out.println("First Name : " + new String(ch, start, length));
			login = false;
		}

		if (faculty) {
			System.out.println("Last Name : " + new String(ch, start, length));
			faculty = false;
		}

		if (phone) {
			System.out.println("Nick Name : " + new String(ch, start, length));
			phone = false;
		}

		if (address) {
			System.out.println("Salary : " + new String(ch, start, length));
			address = false;
		}

	}

}
