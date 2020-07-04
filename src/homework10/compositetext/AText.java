package homework10.compositetext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AText implements IText {
    List<IText> list;

    public AText(IText... values) {
        this.list = new ArrayList<>();
        add(values);
    }

    private void add(IText... values) {
        Collections.addAll(this.list, values);
    }

    @Override
    public IText separate() {
        return null;
    }

}//end of class
