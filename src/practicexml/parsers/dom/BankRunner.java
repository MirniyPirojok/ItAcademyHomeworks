package practicexml.parsers.dom;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import practicexml.parsers.Bank;

public class BankRunner {
	public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException {
		ArrayList<Bank> list = new ArrayList<>();
		list = BankObjectList.banks();
		for(Bank temp : list){
			System.out.println(temp);
		}
	}
}
