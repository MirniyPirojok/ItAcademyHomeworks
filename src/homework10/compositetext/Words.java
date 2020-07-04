package homework10.compositetext;

public class Words extends AText {

    Words(IText... values) {
        super(values);
    }

    @Override
    public IText separate() {
        return null;
    }
}//end of class
