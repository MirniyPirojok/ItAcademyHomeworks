package practicexml.parsers.stax;

import practicexml.parsers.Car;
import practicexml.parsers.sax.CarTagNames;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.List;

import static javax.xml.stream.XMLStreamConstants.CHARACTERS;
import static javax.xml.stream.XMLStreamConstants.END_ELEMENT;
import static javax.xml.stream.XMLStreamConstants.START_ELEMENT;

public class StAXParser {
    public static List<Car> process(XMLStreamReader reader) throws XMLStreamException {
        ArrayList<Car> cars = new ArrayList<>();
        Car currentCar = null;
        CarTagNames currentTag = null;

        while (reader.hasNext()) {

            int type = reader.next();
            switch (type) {
                case START_ELEMENT:
                    currentTag = CarTagNames.findByName(reader.getLocalName());
                    if (currentTag == CarTagNames.CAR) {
                        currentCar = new Car();

                        currentCar.setId(Integer.parseInt(reader.getAttributeValue(null, "id")));
                    }
                    break;
                case CHARACTERS:
                    String payload = reader.getText().trim();

                    if (payload.isEmpty()) {
                        break;
                    }

                    switch (currentTag) {
                        case VIN:
                            currentCar.setVin(Integer.parseInt(payload));
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
                    break;

                case END_ELEMENT:
                    currentTag = CarTagNames.findByName(reader.getLocalName());
                    if (currentTag == CarTagNames.CAR) {
                        cars.add(currentCar);
                    }
                    break;
            }
        }
        return cars;
    }
}//end of class
