package practicexml.parsers.dom;
import java.util.ArrayList;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import practicexml.parsers.Bank;

public class BankObjectList {
	public static ArrayList<Bank> banks() throws SAXException, ParserConfigurationException, IOException {
		ArrayList<Bank> banks = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse("Banks.xml");
		
		Element root = document.getDocumentElement();
		banks = BankAnalyzer.listBuilder(root);
		
		return banks;
	}
}