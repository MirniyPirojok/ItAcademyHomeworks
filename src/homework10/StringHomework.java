package homework10;

public class StringHomework {
    public static void main(String[] args) {

        String defaultString = "This text is for doing homework number 10. Previous sentence contains 8 words and 1 number.";
        System.out.println("Default string:\n" + defaultString);

        task1(defaultString);
        task2(defaultString);
        task3(defaultString);
        task4(defaultString);
    }//end of main

    //task1 1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.
    public static void task1(String defaultString) {
        System.out.println("\nTask1.");
        defaultString = defaultString.trim();

        int lastSpace = defaultString.lastIndexOf(' '); //

        String changedString = "";

        int firstLetter = 0;

        while (firstLetter <= lastSpace) {
            //find index of the first letter of the word
            firstLetter = defaultString.indexOf(" ", firstLetter) + 1;

            //up the first letter of the word
            char upperLetter = Character.toUpperCase(defaultString.charAt(firstLetter));

            //replace first letter with upper letter
            defaultString = changeSymbol(defaultString, firstLetter, upperLetter);
        }
        System.out.println(defaultString);
    }

    //task2 2. Подсчитать количество содержащихся в данном тексте знаков препинания.
    public static void task2(String defaultString) {
        System.out.println("\nTask2.");

        char[] punctuations = {'.', ',', '!', '?', ':', ';', '-', '(', ')', '"', '/', '\\', '\'', '[', ']'};

        int counter = 0;
        for (int i = 0; i < punctuations.length; i++) {
            for (int j = 0; j < defaultString.length(); j++) {
                if (punctuations[i] == defaultString.charAt(j)) {
                    counter++;
                }
            }
        }
        System.out.println("There are " + counter + " punctuation marks in the text.");
    }

    //task3 3.  Определить сумму всех целых чисел, встречающихся в заданном тексте
    public static void task3(String defaultString) {
        System.out.println("\nTask3");

        //split string to words
        String[] strArray = defaultString.split("[ .,:;!?'\"()#$%&*=+@`~a-z]");

        long sum = 0;
        for (String s : strArray) {
            try {
                sum += Integer.parseInt(s);//if word is number then sum it,
            } catch (Exception ignored) { //if word is not number then just ignore it
            }
        }
        System.out.println("The sum of all numbers = " + sum);
    }

    //task4 4. В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова,
    // корректировку не выполнять.
    public static void task4(String defaultString) {
        System.out.println("\nTask4.");
        int k = 5;
        char symbol = 'X';

        //split string to words
        String[] strArray = defaultString.split("[ ]");
        String newStr = "";

        for (int i = 0; i < strArray.length; i++) {
            try {
                strArray[i] = changeSymbol(strArray[i], k, symbol);
            } catch (Exception ignored) {
            }
            newStr += strArray[i] + " ";
        }
        System.out.println(newStr);
    }

    //method for changing a symbol in the string
    public static String changeSymbol(String defaultString, int indexOfChangingSymbol, char newSymbol) {
        String newString = defaultString.substring(0, indexOfChangingSymbol);//cut string before changed letter of the word
        newString = newString + newSymbol; //add new letter to the end of substring
        newString = newString + defaultString.substring(indexOfChangingSymbol + 1);//add the rest of the string
        return newString;
    }


}//end of class
