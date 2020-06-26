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
                "\nThis sentence contains aaaaaa loooot of vooowel." +
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
            //find index of the first letter of the word
            firstLetter = defaultString.indexOf(" ", firstLetter) + 1;

            //up the first letter of the word
            char upperLetter = Character.toUpperCase(defaultString.charAt(firstLetter));

            //replace first letter with upper letter
            defaultString = replaceByIndex(defaultString, firstLetter, upperLetter);
        }
        System.out.println(defaultString);
    }

    //+task2. Подсчитать количество содержащихся в данном тексте знаков препинания.
    public static void task2(String str) {
        System.out.println("\nTask2.");

        int defaultStrLength = str.length();
        str = str.replaceAll("[.,!?;:\\-()\\[\\]'\"]", "");
        int punctuationsCount = defaultStrLength - str.length();

        System.out.println("There are " + punctuationsCount + " punctuation marks in the text.");
    }

    //+task3. Определить сумму всех целых чисел, встречающихся в заданном тексте
    public static void task3(String str) {
        System.out.println("\nTask3.");
        int sum = 0;

        Pattern pattern = Pattern.compile("[\\d]+");
        Matcher m = pattern.matcher(str);

        while (m.find()) {
            sum += Integer.parseInt(m.group());
        }

        System.out.println("The sum of all numbers = " + sum);
    }

    //+task4. В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова,
    // корректировку не выполнять.
    public static void task4(String str) {
        System.out.println("\nTask4.");
        int k = 2;
        char newSymbol = 'X';

        //split string to words
        String[] strArray = str.split("[ ]");
        StringBuilder newStr = new StringBuilder();

        for (String word : strArray) {
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            if (k < word.length()) {
                char oldSymbol = sb.charAt(k);
                if (Character.isLetter(oldSymbol)) {
                    sb.setCharAt(k, newSymbol);
                }
            }
            newStr.append(sb).append(" ");
        }
        System.out.println(newStr);
    }

    //+task5. Удалить из текста его часть, заключенную между двумя символами,
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

        String[] words = defaultStr.split("[!?;:\"'#%^*.\\s()]+");

        for (String word : words) {
            int oldStrLength = defaultStr.length(); //remember string length
            defaultStr = defaultStr.replace(word, "");//delete the same words from default string
            int count = (oldStrLength - defaultStr.length()) / word.length();//count how many words was deleted
            if (count > 0) { //checking if words have already found and printed
                System.out.printf("%-9s= %d%n", word, count);//print found word and count
            }
        }
    }

    //task7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста
    public static void task7(String str) {
        System.out.println("\nTask7.");
        String[] stringArray = str.split("[.]");

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringArray[i].toLowerCase();
            stringArray[i] = stringArray[i].replaceAll("[^a-z]", "");//del symbols except letters
            int lettersTotal = stringArray[i].length();                              //how many letters in total
            stringArray[i] = stringArray[i].replaceAll("[aeiouy]", "");//del vowel letters
            int consonants = stringArray[i].length();                                 //how many consonant letters
            int vowels = lettersTotal - consonants;                                    //how many vowel letters

            if (consonants > vowels) {
                System.out.println("Sentence number " + (i + 1) + " contains " + " more consonants then vowels.");
            } else if (consonants < vowels) {
                System.out.println("Sentence number " + (i + 1) + " contains " + " more vowels then consonants.");
            } else if (!stringArray[i].equals("")) {
                System.out.println("Sentence number " + (i + 1) + " contains the same number of vowels and consonants");
            }
        }
    }

    //task8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины
    public static void task8(String defaultString) {
        System.out.println("\nTask8.");

        int requiredWordLength = 2;

        Pattern pattern = Pattern.compile("([A-ZА-Я][^.!?]*)\\?"); //pattern for sentences with "?" in the end
        Matcher m = pattern.matcher(defaultString);

        String newString = "";
        while (m.find()) {
            //add to new string only words and spaces
            newString = newString.concat(m.group().replaceAll("[^a-zA-z ]", ""));
        }

        String[] strArray = newString.split(" ");

        Set<String> strSet = new HashSet<>(Arrays.asList(strArray));//del all duplicates

        //print words of required length
        for (String word : strSet) {
            if (word.length() == requiredWordLength) {
                System.out.println(word);
            }
        }
    }


    //methods for changing a symbol in the string
    public static String replaceByIndex(String defaultString, int indexOfChangingSymbol, char newSymbol) {
        String newString = defaultString.substring(0, indexOfChangingSymbol);//cut string before changed letter of the word
        newString = newString + newSymbol; //add new letter to the end of substring
        newString = newString + defaultString.substring(indexOfChangingSymbol + 1);//add the rest of the string
        return newString;
    }

    public static String replaceByIndex(String defaultString, int indexOfChangingSymbol, String newSymbol) {
        String newString = defaultString.substring(0, indexOfChangingSymbol);//cut string before changed letter of the word
        newString = newString + newSymbol; //add new letter to the end of substring
        newString = newString + defaultString.substring(indexOfChangingSymbol + 1);//add the rest of the string
        return newString;
    }

}//end of class

