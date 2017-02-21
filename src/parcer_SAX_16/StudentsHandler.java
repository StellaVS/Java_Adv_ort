package parcer_SAX_16;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class StudentsHandler extends DefaultHandler {

	private List<Students> studensList = null;
	String elementEssence = "";
	Students student = new Students();
	Addresses address = new Addresses();

	public List<Students> studensList() {
		return studensList;
	}

	@Override
	public void startDocument() {
		System.out.println("Start Parsing");
	}
/**
 * Execute attributes from xml files
 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		elementEssence = qName;
		if (studensList == null) {
			studensList = new ArrayList<>();
		}
		if (elementEssence.equals("student")) {
			student = new Students();
			address = new Addresses();
			student.setLogin(attributes.getValue("login"));
			student.setFaculty(attributes.getValue("faculty"));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		elementEssence = "";
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		if (elementEssence.equals("name")) {
			student.setName(new String(ch, start, length));
		}
		if (elementEssence.equals("login")) {
			student.setLogin(new String(ch, start, length));
		}

		if (elementEssence.equals("faculty")) {
			student.setFaculty(new String(ch, start, length));
		}

		if (elementEssence.equals("phone")) {
			student.setPhone(new String(ch, start, length));
		}

		if (elementEssence.equals("country")) {
			address.setCountry(new String(ch, start, length));
		}

		if (elementEssence.equals("city")) {
			address.setCity(new String(ch, start, length));
		}

		if (elementEssence.equals("street")) {
			address.setStreet(new String(ch, start, length));
		}
		if (elementEssence.equals("student")) {
			student.setAddress(address);
			studensList.add(student);
		}
	}

	@Override
	public void endDocument() {
		System.out.println("Stop Parsing");
	}

}
