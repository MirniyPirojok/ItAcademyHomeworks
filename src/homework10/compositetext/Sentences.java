package homework10.compositetext;

import java.util.ArrayList;
import java.util.List;

public class Sentences extends AText {

    Sentences(IText... values) {
        super(values);
    }

    @Override
    public IText separate() {
        return null;
    }


    @Override
    public String toString() {
        return this.list.toString().replaceAll("[\\[\\]]", "").replaceAll(", ","\n");
    }
}//end of class
