package homework10.compositetext;

public class CompositeDemo {
    public static String TEXT = "This text is for doing the homework number 10." +
            " The first default sentence contains 8 words and 1 number. " +
            " (This sentence is for the task number 5). " +
            " This sentence contains aaaaaa loooot of vooowels." +
            " Is this a question 1?" +
            " Is this a question 2?";

    public static void main(String[] args) {
        IText text = new Text(TEXT);
        System.out.println(text);

        System.out.println();
        IText sentences = new Sentences(text.separate());
        System.out.println(sentences);

        System.out.println();
        IText words = new Words(sentences.separate());
        System.out.println(words);

    }//end of main
}//end of class
