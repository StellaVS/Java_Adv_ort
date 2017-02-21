package parcer_SAX_16;

import java.io.File;
import java.io.IOException;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MainSAX {

	public static void main(String[] args) {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		try {
			SAXParser sp = spf.newSAXParser();
			StudentsHandler handler = new StudentsHandler();

			sp.parse(new File("src/parcer_SAX_16/_01_students.xml"), handler);

			List<Students> studentList = handler.studensList();

			for (Students stude : studentList) {
				System.out.println(stude);
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
