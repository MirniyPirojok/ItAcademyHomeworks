package Homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        // enter data
        int[] numArray = new int[5];
        String[] strArray = new String[5];

        // enter numbers of array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integer numbers for array: ");
        for (int i = 0; i < 5; i++) {
            numArray[i] = input.nextInt();
        }
        input.nextLine();

        // enter strings of array
        System.out.println("Enter five strings for array: ");
        for (int i = 0; i < 5; i++) {
            strArray[i] = input.nextLine();
        }
        input.close();


//        functions calls
        task1(numArray, strArray);
        task2(numArray);

    }

/*Task 4. Write a Java program to calculate the average value of array elements.*/


/*Task 2. Write a Java program to sum values of an array.*/

    public static void task2(int[] numArray) {
        System.out.println("\n\n***Task 2. Write a Java program to sum values of an array.***");
        int sum = 0;
        for (int i:
             numArray) {
            sum += i;
        }
        System.out.println("Sum values of an array: " + sum);
    }

/*Task 1. Write a Java program to sort a numeric array and a string array.*/
    public static void task1(int[] numArray, String[] strArray) {
        System.out.println("\n***Task 1. Write a Java program to sort a numeric array and a string array.***");


// numbers array
        System.out.print("Entered array of numbers: ");
        for (int value : numArray) {
            System.out.print(value + " ");
        }

        // numbers array sorting
        int numTemp;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray.length - 1 - i; j++) {
                if (numArray[j] > numArray[j + 1]) {
                    numTemp = numArray[j + 1];
                    numArray[j + 1] = numArray[j];
                    numArray[j] = numTemp;
                }
            }
        }
        System.out.print("\nSorted array of numbers : ");
        for (int value : numArray) {
            System.out.print(value + " ");
        }

// strings array
        System.out.print("\nEntered array of strings: ");
        for (String s : strArray) {
            System.out.print("\"" + s + "\" ");
        }

        // strings array sorting
        String strTemp;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length - 1 - i; j++) {
                if (strArray[j].compareTo(strArray[j + 1]) > 0) {
                    strTemp = strArray[j + 1];
                    strArray[j + 1] = strArray[j];
                    strArray[j] = strTemp;
                }
            }
        }

        System.out.print("\nSorted array of strings : ");
        for (String s : strArray) {
            System.out.print("\"" + s + "\"" + " ");
        }
    }
}

