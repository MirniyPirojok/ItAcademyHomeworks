package Homework2;

import org.w3c.dom.ls.LSOutput;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        /*enter data*/
        int[] numArray = {5, 4, 3, 2, 1};
        String[] strArray = {"e", "d", "c", "b", "a"};

        // numbers array
        System.out.print("Entered array of numbers: ");
        for (int value : numArray) {
            System.out.print(value + " ");
        }

        // strings array
        System.out.print("\nEntered array of strings: ");
        for (String s : strArray) {
            System.out.print("\"" + s + "\" ");
        }

        /*functions calls*/
        task1(numArray, strArray);
        task2(numArray);
        task4(numArray);
        task5(numArray);
        task6(numArray);
    }

    /*Task 1. Write a Java program to sort a numeric array and a string array.*/
    public static void task1(int[] numArray, String[] strArray) {
        System.out.println("\n\n***Task 1. Write a Java program to sort a numeric array and a string array.***");

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
        System.out.print("Sorted array of numbers : ");
        for (int value : numArray) {
            System.out.print(value + " ");
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

    /*Task 2. Write a Java program to sum values of an array.*/
    public static void task2(int[] numArray) {
        System.out.println("\n\n***Task 2. Write a Java program to sum values of an array.***");
        int sum = 0;
        for (int i :
                numArray) {
            sum += i;
        }
        System.out.println("Sum values of an array: " + sum);
    }

    /*Task 4. Write a Java program to calculate the average value of array elements.*/
    public static void task4(int[] numArray) {
        System.out.println("\n***Task 4. Write a Java program to calculate the average value of array elements.***");
        int sum = 0;

        for (int value : numArray) {
            sum += value;
        }
        int average = sum / numArray.length;

        System.out.println("Average value: " + average);
    }

    /*Task 5.  Write a Java program to test if an array contains a specific value.*/
    public static void task5(int[] numArray) {
        System.out.println("\n***Task 5. Write a Java program to test if an array contains a specific value.***");
        System.out.println("Enter any number: ");

        Scanner input = new Scanner(System.in);
        int specificValue = input.nextInt();

        boolean checker = false;

        for (int value : numArray) {
            if (value == specificValue) {
                System.out.println("Array contains such value.");
                checker = true;
                break;
            }
        }
        if (!checker) {
            System.out.println("Array doesn't contain such value.");
        }
    }

    /*Task 6.  Write a Java program to find the index of an array element.*/
    public static void task6(int[] numArray) {
        System.out.println("\n***Task 6. Write a Java program to find the index of an array element.***");
        System.out.println("Enter one of the values you just entered: ");
        Scanner input = new Scanner(System.in);

        int value = input.nextInt();

        boolean checker = false;
        int index = 0;

        for (int i : numArray) {
            if (i == value) {
                System.out.println("The index of array element: " + index);
                checker = true;
                break;
            }
            index++;
        }
        if (!checker) {
            System.out.println("No such value in the array! Please, enter correct value next time.");
        }
    }


} //class closer