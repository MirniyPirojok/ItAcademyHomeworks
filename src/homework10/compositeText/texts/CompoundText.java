package homework10.compositeText.texts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundText extends BaseText {
    protected List<Text> children = new ArrayList<>();

    public CompoundText(Text... components){
        super();
        add(components);
    }

    private void add(Text component){ children.add(component);}

    public void add(Text... components){
        children.addAll(Arrays.asList(components));
    }

    public void remove(Text child){
        children.remove(child);
    }

    public void remove(Text... components){
        children.removeAll(Arrays.asList(components));
    }

    public void clear(){
        children.clear();
    }
}//end of class
