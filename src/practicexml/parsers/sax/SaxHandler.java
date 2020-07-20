package practicexml.parsers.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import practicexml.parsers.Car;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {
    private final List<Car> resultList = new ArrayList<>();

    private Car currentCar = null;

    private CarTagNames currentTag = null;

    public List<Car> getResultList() {
        return resultList;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parsing!");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End parsing!");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String payload = new String(ch, start, length).trim();

        if (currentTag == null) {
            return;
        }

        switch (currentTag) {
            case VIN:
                currentCar.setVin(Long.parseLong(payload));
                break;
            case MODEL:
                currentCar.setModel(payload);
                break;
            case PRODUCTION_DATE:
                currentCar.setProductionDate(Integer.parseInt(payload));
                break;
            case PRICE:
                currentCar.setPrice(Integer.parseInt(payload));
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println(uri + " " + localName + " " + qName);
        System.out.println("We have found start element");

        if (qName.equals(CarTagNames.CAR.getTagName())) {
            System.out.println("Bank creation!");
            currentCar = new Car();

            currentCar.setId(Integer.parseInt(attributes.getValue("id")));
        }

        currentTag = CarTagNames.findByName(qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals(CarTagNames.CAR.getTagName())){
            System.out.println("Bank loading into result list!");
            resultList.add(currentCar);
        }
        currentTag = null;
    }
}//end of class
