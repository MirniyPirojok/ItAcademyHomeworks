package homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static homework2.Homework2Util.bubbleSort;
import static homework2.Homework2Util.calcSum;
import static homework2.Homework2Util.findDuplicate;
import static homework2.Homework2Util.printArray;
import static homework2.Homework2Util.printMatrix;

public class Homework2 {

    /*enter data*/
    private static Integer[] numArray = {1, 1, 1, 1, 7, 3, 4, 6, 4, 5, 8, 9, 7, 3, 4, 6, 4, 5, 8, 9};
    // just a set of numbers if you lazy to enter with your own hands:
    // {1, 10, 10, 10, 1, 1, 1, 7, 3, 4, 6, 4, 5, 8, 9, 7, 3, 4, 6, 4, 5, 8, 9};

    private static final String[] strArray = {"bbb", "ddd", "ccc", "fff", "aaa", "eee", "jjj", "ccc"};

    public static void main(String[] args) {

        // show numbers array
        System.out.print("\nDefault array of numbers: ");
        printArray(numArray);

        // show strings array
        System.out.print("\nDefault array of strings: ");
        printArray(strArray);

        //call methods
        task1(numArray, strArray);
        task2(numArray);
        task4(numArray);
        task5(numArray);
        task6(numArray);
        task7(numArray);
        task8(numArray);
        task9(numArray);
        task10(numArray);
        task11(numArray);
        task12(numArray);
        task13(strArray);
        task14(strArray);
        task15(numArray);
        task16(numArray);
        task17(numArray);
        task18(numArray);
        task19();
        task20(strArray, numArray);
    }

    /*Task 1. Write a Java program to sort a numeric array and a string array.*/
    public static void task1(Integer[] numArray, String[] strArray) {
        System.out.println("\n\n***Task 1. Write a Java program to sort a numeric array and a string array.***");

        bubbleSort(numArray);
        System.out.print("Sorted array of numbers : ");
        printArray(numArray);

        bubbleSort(strArray);
        System.out.print("\nSorted array of strings : ");
        printArray(strArray);
    }

    /*Task 2. Write a Java program to sum values of an array.*/
    public static void task2(Integer[] numArray) {
        System.out.println("\n\n***Task 2. Write a Java program to sum values of an array.***");

        int sum = calcSum(numArray);

        System.out.println("Sum values of an array: " + sum);
    }

    /*Task 4. Write a Java program to calculate the average value of array elements.*/
    public static void task4(Integer[] numArray) {
        System.out.println("\n***Task 4. Write a Java program to calculate the average value of array elements.***");

        int sum = calcSum(numArray);

        double average = (double) sum / numArray.length;

        System.out.println("Average value: " + average);
    }

    /*Task 5.  Write a Java program to test if an array contains a specific value.*/
    public static void task5(Integer[] numArray) {
        System.out.println("\n***Task 5. Write a Java program to test if an array contains a specific value.***");
        System.out.println("Enter any number: ");

        Scanner input = new Scanner(System.in);
        int specificValue = input.nextInt();

        //check if array contains specific value
        boolean checker = false;
        for (int value : numArray) {
            if (value == specificValue) {
                System.out.println("Yes, array contains such value.");
                checker = true;
                break;
            }
        }
        if (!checker) {
            System.out.println("Array doesn't contain such value.");
        }
    }

    /*Task 6.  Write a Java program to find the index of an array element.*/
    public static void task6(Integer[] numArray) {
        System.out.println("\n***Task 6. Write a Java program to find the index of an array element.***");
        System.out.println("Enter one of the values from array: ");
        Scanner input = new Scanner(System.in);

        int value = input.nextInt();

        boolean checker = false;
        int index = 0;

        for (int i : numArray) {
            if (i == value) {
                System.out.println("Value " + value + " has index " + index);
                checker = true;
            }
            index++;
        }
        if (!checker) {
            System.out.println("No such value in the array! Please, enter correct value next time.");
        }
    }

    /*Task 7.  Write a Java program to remove a specific element from an array.*/
    public static void task7(Integer[] oldArray) {
        System.out.println("\n***Task 7.  Write a Java program to remove a specific element from an array.***");

        System.out.println("Enter value for removing: ");
        Scanner input = new Scanner(System.in);
        int specificElement = input.nextInt();
        int sizeNewArray = oldArray.length;


        // move specific values in the end of the oldArray
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

        // make new array with size that equal old array without specific values
        Integer[] newArray = new Integer[sizeNewArray];

        if (sizeNewArray == oldArray.length) { //if array equals it means that specific value wasn't found
            System.out.println("Such value doesn't exist in this array. Please, enter correct value next time.");
            newArray = oldArray;
        } else {
            // copy old array in the new array,
            // specific values will be not copied because new array size is less than old array
            if (sizeNewArray >= 0) System.arraycopy(oldArray, 0, newArray, 0, sizeNewArray);
        }

        //output new array
        if (newArray.length != 0) {
            System.out.print("Now array contains: ");
            printArray(newArray);
        } else {
            //if old array contained only specific values than new array is empty
            System.out.println("Array is empty");
        }

        numArray = newArray;
    }

    /*Task 8.  Write a Java program to copy an array by iterating the array.*/
    public static void task8(Integer[] oldArray) {
        System.out.println("\n\n***Task 8.  Write a Java program to copy an array by iterating the array.***");
        Integer[] newArray = new Integer[oldArray.length];
        int i = 0;

        for (int value : oldArray) {
            newArray[i] = value;
            i++;
        }

        // show newArray values
        System.out.print("Copy is done. New array: ");
        printArray(newArray);
    }

    /*Task 9.  Write a Java program to insert an element (specific position) into an array.*/
    public static void task9(Integer[] oldArray) {
        System.out.println("\n\n***Task 9.Write a Java program to insert an element (specific position) into an array.***");
        Scanner input = new Scanner(System.in);
        Integer[] newArray = new Integer[oldArray.length + 1];

        System.out.println("Enter a new value: ");
        int newValue = input.nextInt();
        System.out.println("Enter specific position: ");
        int position = input.nextInt();

        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

        //Check if position number is not more and not less than array size,
        // add new number into the required position into the new array.
        if (position < newArray.length) {
            if (newArray.length - 1 - position >= 0) {
                System.arraycopy(newArray, position, newArray, position + 1, newArray.length - 1 - position);
            }
            newArray[position] = newValue;

            System.out.print("Now array contains: ");
            printArray(newArray);
            numArray = newArray;

        } else {
            System.out.print("Position number is too big. Please, enter correct number next time.");
        }
    }

    /*Task 10. Write a Java program to find the maximum and minimum value of an array.*/
    public static void task10(Integer[] numArray) {
        System.out.println("\n\n***Task 10. Write a Java program to find the maximum and minimum value of an array.***");
        int max = numArray[0];
        int min = numArray[0];

        for (Integer integer : numArray) {
            if (integer > max) {
                max = integer;
            }
            if (integer < min) {
                min = integer;
            }
        }
        System.out.println("Maximum value: " + max + ". Minimum value: " + min + ".");
    }

    /*Task 11. Write a Java program to reverse an array of integer values.*/
    public static void task11(Integer[] array) {
        System.out.println("\n***Task 11. Write a Java program to reverse an array of integer values.***");

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.print("Reversed array:");
        printArray(array);

        numArray = array;
    }

    /*Task 12. Write a Java program to find the duplicate values of an array of integer values.*/
    public static void task12(Integer[] numArray) {
        System.out.println("\n\n***Task 12. Write a Java program to find the duplicate values of an array of integer values.***");

        bubbleSort(numArray);

        findDuplicate(numArray);
    }

    /*Task 13. Write a Java program to find the duplicate values of an array of string values.*/
    public static void task13(String[] strArray) {
        System.out.println("\n\n***Task 13. Write a Java program to find the duplicate values of an array of string values.***");

        bubbleSort(strArray);

        findDuplicate(strArray);
    }

    /*Task 14. Write a Java program to find the common elements between two arrays (string values).*/
    public static void task14(String[] firstArray) {
        System.out.println("\n\n***Task 14. Write a Java program to find the common elements between two arrays (string values).***");

        //first array sorting
        bubbleSort(firstArray);

        //making array for comparison
        String[] secondArray = {"ooo", "bbb", "aaa", "kkk", "lll"};

        System.out.print("Array for comparison: ");
        printArray(secondArray);

        // strings second array sorting
        bubbleSort(secondArray);

        System.out.print("\nNext strings are common with default array:");
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = i; j < secondArray.length; j++) {
                if (firstArray[i].equals(secondArray[j])) {
                    System.out.print(" \"" + firstArray[i] + "\"");
                }
            }
        }
    }

    /*Task 15. Write a Java program to find the common elements between two arrays of integers.*/
    public static void task15(Integer[] firstArray) {
        System.out.println("\n\n***Task 15. Write a Java program to find the common elements between two arrays of integers.***");


        // first array sorting
        bubbleSort(firstArray);

        //create second array for comparison
        Integer[] secondArray = {4, 6, 2, 3, 4, 68, 2, 1, 10, 10, 1}; // {1, 1, 1, 1, 1}
        System.out.print("Array for comparison:");
        printArray(secondArray);

        // second array sorting
        bubbleSort(secondArray);

        //output common values
        System.out.print("\nNext values are common:");
        for (int i = 0; i < firstArray.length - 1; i++) {
            for (int j = 0; j < secondArray.length - 1; j++) {

                if (firstArray[i].equals(secondArray[j]) &&
                        !secondArray[j].equals(secondArray[j + 1]) &&
                        !firstArray[i].equals(firstArray[i + 1])) {
                    System.out.print(" " + firstArray[i]);
                }
            }
        }

        for (int i = 0; i < secondArray.length - 1; i++) {
            if (firstArray[firstArray.length - 1].equals(secondArray[i]) && !secondArray[i].equals(secondArray[i + 1])) {
                System.out.print(" " + secondArray[i]);
            }
        }
    }

    /*Task 16. Write a Java program to remove duplicate elements from an array.*/
    public static void task16(Integer[] array) {
        System.out.println("\n\n***Task 16. Write a Java program to remove duplicate elements from an array.***");

        // sort array
        bubbleSort(array);

        // find duplicates
        int duplicateQuantity = 0;
//        System.out.print("Next values have duplicate:");

        //find how many duplicates
        if (array[0].equals(array[array.length - 1])) {
            System.out.print(" " + array[0]);
            duplicateQuantity = array.length - 1;
        } else {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i].equals(array[i - 1]) || array[i].equals(array[array.length - 1])) {
                    duplicateQuantity++;
                }
            }
            if (duplicateQuantity == 0) {
                System.out.print(" Sorry, no duplicates.");
            }
        }

        //create new array
        int size = array.length - duplicateQuantity;
        Integer[] newArray = new Integer[size];

        //fill new array
        if (array[0].equals(array[array.length - 1])) {
            newArray[0] = array[0];
        } else {
            newArray[0] = array[0];
            int j = 1;
            for (int i = 1; i < array.length; i++) {
                if (!array[i].equals(array[i - 1])) {
                    newArray[j++] = array[i];
                }
            }
        }

        System.out.print("Duplicates removed. Now array contains:");
        printArray(newArray);

        numArray = newArray;
    }

    /*Task 17. Write a Java program to find the second largest element in an array.*/
    public static void task17(Integer[] numArray) {
        System.out.println("\n\n***Task 17. Write a Java program to find the second largest element in an array.***");

        // numbers array sorting
        bubbleSort(numArray);

        if (numArray[0].equals(numArray[numArray.length - 1])) {
            System.out.println("There is only one value in the array: " + numArray[0]);
        } else {
            System.out.print("The second largest element in the array: ");
            for (int i = numArray.length - 2; i > 0; i--) {
                if (numArray[i] < numArray[numArray.length - 1]) {
                    System.out.println(numArray[i]);
                    break;
                }
            }
        }
    }

    /*Task 18. Write a Java program to find the second smallest element in an array.*/
    public static void task18(Integer[] numArray) {
        System.out.println("\n***Task 18. Write a Java program to find the second smallest element in an array.***");

        // numbers array sorting
        bubbleSort(numArray);

        if (numArray[0].equals(numArray[numArray.length - 1])) {
            System.out.println("There is only one value in the array: " + numArray[0]);
        } else {
            System.out.print("The second smallest element in the array: ");
            for (int i = 0; i < numArray.length - 1; i++) {
                if (numArray[i + 1] > numArray[i]) {
                    System.out.println(numArray[i + 1]);
                    break;
                }
            }
        }
    }

    /*Task 19. Write a Java program to add two matrices of the same size.*/
    public static void task19() {
        System.out.println("\n***Task 19. Write a Java program to add two matrices of the same size.***");

        int[][] matrix1 = {
                {2, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1},
        };
        int[][] matrix2 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
        };

        //output matrix1
        System.out.println("First matrix:");
        printMatrix(matrix1);

        System.out.println();

        //output matrix2
        System.out.println("Second matrix:");
        printMatrix(matrix2);
        System.out.println();


        //add two matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] += matrix2[i][j];
            }
        }

        System.out.println("Result of adding:");
        printMatrix(matrix1);
    }

    /*Task 20. Write a Java program to convert an array to ArrayAndLinkedList.*/
    public static void task20(String[] strArray, Integer[] numArray) {
        System.out.println("\n***Task 20. Write a Java program to convert an array to ArrayAndLinkedList.***");

        List<Integer> integerArrayList = new ArrayList<>(numArray.length);
        integerArrayList.addAll(Arrays.asList(numArray));

        ArrayList<String> stringArrayList = new ArrayList<>(strArray.length);
        stringArrayList.addAll(Arrays.asList(strArray));

        System.out.println("Integer arrayList = " + integerArrayList);
        System.out.println("String arrayList = " + stringArrayList);
    }
} //class closer