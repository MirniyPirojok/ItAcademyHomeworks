package practicexml.parsers.sax;

import java.util.Collections;
import java.util.Set;

public enum CarTagNames {
    CARS("cars"), CAR("car"), VIN("vin"), MODEL("model"),
    PRODUCTION_DATE("productionDate"), PRICE("price"), EMPTY("");

    private String tagName;

    CarTagNames(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    private static Set<CarTagNames> tags = Collections.unmodifiableSet
            (Set.of(CarTagNames.values()));

    private static Set<CarTagNames> getTags() {
        return tags;
    }

    public static CarTagNames findByName(String tagName) {
        for (CarTagNames tag : getTags()) {
            if (tagName.equalsIgnoreCase(tag.getTagName())) {
                return tag;
            }
        }
        return EMPTY;
    }


}
