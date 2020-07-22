/*
package practicexml.parsers.dom;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import practicexml.parsers.Bank;

import java.io.IOException;
import java.util.ArrayList;

public class BankAnalyzer {
	public static ArrayList<Bank> listBuilder(Element root)
			throws SAXException, IOException {
		ArrayList<Bank> banks = new ArrayList<>();
		NodeList banksNodes = root.getElementsByTagName("bank");
		Bank tempBank = null;

		for (int i = 0; i < banksNodes.getLength(); i++) {
			Element bankNode = (Element) banksNodes.item(i);
			tempBank = new Bank();
			tempBank.setCountry(getChildValue(bankNode, "country"));
			tempBank.setNameBank(getChildValue(bankNode, "name-Bank"));
			tempBank.getDeposit().setDeposit(getChildValue(bankNode, "deposit"));
			tempBank.getDeposit().setDepositor(
					getChildValue(bankNode, "depositor"));
			tempBank.getDeposit().setAccountId(
					getChildValue(bankNode, "account-Id"));
			tempBank.getDeposit().setAmountOnDeposit(
							Integer.valueOf(getChildValue(bankNode,
									"amount-On-Deposit")));
			tempBank.getDeposit().setProfitability(
					Double.valueOf(getChildValue(bankNode, "profitability")));
			tempBank.getDeposit().setTimeConstraints(
					getChildValue(bankNode, "time-Constraints"));

			banks.add(tempBank);
		}
		return banks;
	}

	private static Element getChildElement(Element parent, String childName) {
		NodeList nodes = parent.getElementsByTagName(childName);
		Element child = (Element) nodes.item(0);
		return child;
	}

	private static String getChildValue(Element parent, String childElement) {
		Element child = getChildElement(parent, childElement);
		Node node = child.getFirstChild();
		String value = node.getNodeValue().trim();
		return value;
	}
}*/
