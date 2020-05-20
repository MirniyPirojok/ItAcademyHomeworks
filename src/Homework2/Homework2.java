package Homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        /*enter data*/
        int[] numArray = {10, 9, 8, 7, 5, 6, 5, 4, 2, 1};
        String[] strArray = {"stuv", "mnopqr", "jhigkl", "wxyz", "abcdef"};

        // show numbers array
        System.out.print("Entered array of numbers: ");
        for (int value : numArray) {
            System.out.print(value + " ");
        }

        // show strings array
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
        numArray = task7(numArray); // delete an element
        task8(numArray);
        numArray = task9(numArray); // insert an element
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
        double average = (double) sum / numArray.length;

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
        System.out.println("Enter one of the values from array: ");
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

    /*Task 7.  Write a Java program to remove a specific element from an array.*/

    public static int[] task7(int[] oldArray) {
        System.out.println("\n***Task 7.  Write a Java program to remove a specific element from an array.***");

        System.out.println("Enter value for removing: ");
        Scanner input = new Scanner(System.in);
        int specificElement = input.nextInt();
        int sizeNewArray = oldArray.length;


        // move values in the end of the oldArray

        for (int j = 0; j < oldArray.length; j++) {
            for (int i = 0; i < oldArray.length - 1; i++) {
                if (oldArray[i] == specificElement) {
                    oldArray[i] = oldArray[i + 1];
                    oldArray[i + 1] = specificElement;
                }
            }
        }

        //find a size of the newArray
        for (int value : oldArray) {
            if (value == specificElement) sizeNewArray--;
        }

        // output oldArray values and size of newArray
/*        System.out.println("oldArray: ");
        for (int value : oldArray) {
            System.out.println(value);
        }
        System.out.println("sizeNewArray = " + sizeNewArray);
        */

        int[] newArray = new int[sizeNewArray];

        if (sizeNewArray == oldArray.length) {
            System.out.println("Such value doesn't exist in this array. Please, enter correct value next time.");
            return oldArray;
        } else {
            if (sizeNewArray >= 0) System.arraycopy(oldArray, 0, newArray, 0, sizeNewArray);
        }

        if (newArray.length != 0) {
            System.out.print("Array: ");
            for (int i : newArray) {
                System.out.print(" " + i);
            }
        } else {
            System.out.println("Array is empty");
        }

        return newArray;
    }

    /*Task 8.  Write a Java program to copy an array by iterating the array.*/
    public static void task8(int[] oldArray) {
        System.out.println("\n\n***Task 8.  Write a Java program to copy an array by iterating the array.***");
        int[] newArray = new int[oldArray.length];
        int i = 0;

        for (int value : oldArray) {
            newArray[i] = value;
            i++;
        }

        // show newArray values
        System.out.print("Copy is done. New array: ");
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }

    /*Task 9.  Write a Java program to insert an element (specific position) into an array.*/
    public static int[] task9(int[] oldArray) {
        System.out.println("\n\n***Task 9.Write a Java program to insert an element (specific position) into an array.***");
        Scanner input = new Scanner(System.in);
        int[] newArray = new int[oldArray.length + 1];

        System.out.println("Enter a new value: ");
        int newValue = input.nextInt();
        System.out.println("Enter specific position: ");
        int position = input.nextInt();

        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

        if (position < newArray.length) {
            if (newArray.length - 1 - position >= 0)
                System.arraycopy(newArray, position, newArray, position + 1, newArray.length - 1 - position);
            newArray[position] = newValue;

            System.out.print("New array: ");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("Position number is too big. Please, enter correct number next time.");
        }
        return newArray;
    }

} //class closer