package homework10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHomework {

    public static void main(String[] args) {

        String defaultString = "This text is for doing the homework number 10." +
                "\nThe first default sentence contains 8 words and 1 number. " +
                "\n(This sentence is for the task number 5). " +
                "\nThis sentence contains aaaaaa loooot of vooowels." +
                "\nIs this a question 1?" +
                "\nIs this a question 2?";
        defaultString = defaultString.trim();
        System.out.println("Default string:\n" + defaultString);

        task1(defaultString);
        task2(defaultString);
        task3(defaultString);
        task4(defaultString);
        task5(defaultString);
        task6(defaultString);
        task7(defaultString);
        task8(defaultString);

    }//end of main

    //task1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.
    public static void task1(String defaultString) {
        System.out.println("\nTask1.");
        defaultString = defaultString.trim();

        int lastSpace = defaultString.lastIndexOf(' ');
        int firstLetter = 0;
        String changedString = "";

        while (firstLetter <= lastSpace) {

            //up the first letter of the word
            char upperLetter = Character.toUpperCase(defaultString.charAt(firstLetter));

            //replace first letter with upper letter
            defaultString = replaceByIndex(defaultString, firstLetter, upperLetter);

            //find index of the first letter of the next word
            firstLetter = defaultString.indexOf(" ", firstLetter) + 1;

        }
        System.out.println(defaultString);
    }

    //task2. Подсчитать количество содержащихся в данном тексте знаков препинания.
    public static void task2(String str) {
        System.out.println("\nTask2.");

        int defaultStrLength = str.length();
        str = str.replaceAll("[.,!?;:\\-()\\[\\]'\"]", "");//del punctuation marks
        int punctuationsCount = defaultStrLength - str.length();

        System.out.println("There are " + punctuationsCount + " punctuation marks in the text.");
    }

    //task3. Определить сумму всех целых чисел, встречающихся в заданном тексте
    public static void task3(String str) {
        System.out.println("\nTask3.");
        int sum = 0;

        Pattern pattern = Pattern.compile("[\\d]+");//get numbers
        Matcher m = pattern.matcher(str);

        while (m.find()) {
            sum += Integer.parseInt(m.group());
        }

        System.out.println("The sum of all numbers = " + sum);
    }

    //task4. В каждом слове текста k-ю букву заменить заданным символом.
    // Если k больше длины слова, корректировку не выполнять.
    public static void task4(String str) {
        System.out.println("\nTask4.");
        int kLetter = 2; //number of letter in the word
        int kIndex = kLetter - 1; //index of letter in the word
        char newSymbol = 'X';

        //split string to words
        String[] strArray = str.split("[ ]");
        StringBuilder newStr = new StringBuilder();

        //replace k-letter in the words
        for (String word : strArray) {
            StringBuilder sb = new StringBuilder();
            sb.append(word); //add word to the string builder
            if (word.length() >= kLetter) { //if word is not shorter then number of kLetter
                char oldSymbol = sb.charAt(kIndex); //find k-symbol
                if (Character.isLetter(oldSymbol)) { //if k-symbol is letter
                    sb.setCharAt(kIndex, newSymbol); //replace k-letter with new symbol
                }
            }
            newStr.append(sb).append(" "); //add space in the end of words
        }
        System.out.println(newStr);
    }

    //task5. Удалить из текста его часть, заключенную между двумя символами,
    // которые вводятся (например, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).
    public static void task5(String str) {
        System.out.println("\nTask5.");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first symbol: ");
        String symbol1 = input.nextLine();
        int symbol1Index = str.indexOf(symbol1);

        System.out.println("Enter the second symbol: ");
        String symbol2 = input.nextLine();
        int symbol2Index = str.lastIndexOf(symbol2);

        input.close();

        //removing
        for (int i = symbol1Index + 1; i < symbol2Index; i++) {
            str = replaceByIndex(str, symbol1Index + 1, "");
        }

        System.out.println(str);
    }

    //task6. Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
    public static void task6(String defaultStr) {
        System.out.println("\nTask6.");
        defaultStr = defaultStr.toLowerCase();

        //split text to words
        String[] words = defaultStr.split("[!?;:\"'#%^*.\\s()]+");

        //find duplicates and their count
        for (String word : words) {
            int oldStrLength = defaultStr.length(); //remember string length
            defaultStr = defaultStr.replace(word, "");//delete the same words from default string
            int count = (oldStrLength - defaultStr.length()) / word.length();//count how many words was deleted
            if (count > 0) { //checking if words have already found and printed
                System.out.printf("%-9s= %d%n", word, count);//print found word and its count
            }
        }
    }

    //task7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста
    public static void task7(String str) {
        System.out.println("\nTask7.");

        String[] sentencesArray = str.split("[.!?]+");//split sentences to array

        for (int i = 0; i < sentencesArray.length; i++) {
            //cut out only vowels
            String vowelsStr = sentencesArray[i].replaceAll("(?i:[^aeiouy])", "");
            //cut out only consonants
            String consonantsStr = sentencesArray[i].replaceAll("(?i:[^bcdfjhgklmnpqrstvwxz])", "");

            int vowelsCount = vowelsStr.length();
            int consonantsCount = consonantsStr.length();

            if (consonantsCount > vowelsCount) {
                System.out.println("Sentence number " + (i + 1) + " contains more consonants then vowels.");
            } else if (consonantsCount < vowelsCount) {
                System.out.println("Sentence number " + (i + 1) + " contains more vowels then consonants.");
            } else if (!sentencesArray[i].equals("")) {
                System.out.println("Sentence number " + (i + 1) + " contains the same number of vowels and consonants");
            }
        }
    }

    //task8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины
    public static void task8(String defaultString) {
        System.out.println("\nTask8.");

        int requiredWordLength = 2;

        //find sentences with questions
        Pattern pattern = Pattern.compile("([\\w][^.!?]*)\\?");
        Matcher m = pattern.matcher(defaultString);

        String newString = "";
        while (m.find()) {
            //add from found sentences to new string only words and spaces
            newString = newString.concat(m.group().replaceAll("[^a-zA-z ]", ""));
        }

        //cut out words
        String[] words = newString.split(" ");

        //del all duplicates
        Set<String> wordsSet = new HashSet<>(Arrays.asList(words));

        //print words of required length
        for (String word : wordsSet) {
            if (word.length() == requiredWordLength) {
                System.out.println(word);
            }
        }
    }


    //methods for changing a symbol
    public static String replaceByIndex(String defaultString, int indexOfChangingSymbol, char newSymbol) {
        String newString = defaultString.substring(0, indexOfChangingSymbol);//cut string before changed letter of the word
        newString = newString + newSymbol; //add new letter to the end of substring
        newString = newString + defaultString.substring(indexOfChangingSymbol + 1);//add the rest of the string
        return newString;
    }

    //methods for changing symbol to substring
    public static String replaceByIndex(String defaultString, int indexOfChangingSymbol, String newSubstring) {
        String newString = defaultString.substring(0, indexOfChangingSymbol);//cut string before changed letter of the word
        newString = newString + newSubstring; //add new substring to the end of substring
        newString = newString + defaultString.substring(indexOfChangingSymbol + 1);//add the rest of the string
        return newString;
    }

}//end of class

