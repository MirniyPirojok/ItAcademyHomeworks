package practicexml.parsers.stax;

import practicexml.parsers.Car;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import static practicexml.parsers.stax.StAXParser.process;

public class StAXRunner {
    public static void main(String[] args) {

        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            FileInputStream fileInputStream = new FileInputStream("src\\recources\\cars.xml");

            XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(fileInputStream);

            List<Car> cars = process(xmlStreamReader);
            for (Car car : cars) {
                System.out.println(car);
            }

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }

    }//end of main
}//end of class
