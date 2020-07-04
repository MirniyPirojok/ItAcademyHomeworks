package homework10.compositetext;

import java.util.Arrays;

public class Text implements IText {
    private final String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public IText separate() { //separate text to sentences.
        IText text = null;
        if (this.text != null) {
            String[] texts = this.text.trim().split("[?!.]+");//массив со строчками, создаётся нужного размера автоматом
            IText[] part = new IText[texts.length];
            int index = 0;
            for (String line : texts) {
                line = line.trim();
                if (!line.isEmpty()) {
                    part[index++] = new Text(line.trim());
                }
            }
            part = Arrays.copyOf(part, index);
            text = new Sentences(part);
        }
        return text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}//end of class
