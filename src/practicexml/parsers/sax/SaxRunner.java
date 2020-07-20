package practicexml.parsers.sax;

import org.xml.sax.SAXException;
import practicexml.parsers.Car;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class SaxRunner {
    public static void main(String[] args) {
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            SaxHandler saxHandler = new SaxHandler();
            saxParser.parse("src/recources/cars.xml", saxHandler);

            List<Car> cars = saxHandler.getResultList();

            for (Car car : cars) {
                System.out.println(car);
            }


        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }
    }//end of main
}//end of class
