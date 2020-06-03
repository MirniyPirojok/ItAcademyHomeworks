package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        /*enter data*/
        int[] numArray = {1, 1, 1, 1, 7, 3, 4, 6, 4, 5, 8, 9, 7, 3, 4, 6, 4, 5, 8, 9};
        // {1, 10, 10, 10, 1, 1, 1, 7, 3, 4, 6, 4, 5, 8, 9, 7, 3, 4, 6, 4, 5, 8, 9};
        String[] strArray = {"bbb", "ddd", "ccc", "fff", "aaa", "eee", "jjj", "ccc"};

        // show numbers array
        System.out.print("\nDefault array of numbers: ");
        for (int value : numArray) {
            System.out.print(value + " ");
        }

        // show strings array
        System.out.print("\nDefault array of strings: ");
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
        task10(numArray);
        numArray = task11(numArray);
        task12(numArray);
        task13(strArray);
        task14(strArray);
        task15(numArray);
        numArray = task16(numArray); //remove duplicates
        task17(numArray);
        task18(numArray);
        task19(numArray);
        task20(strArray, numArray);

/*        System.out.println("\nnumArray:");
        for (int value : numArray) {
            System.out.print(" " + value);
        }*/
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
    public static void task6(int[] numArray) {
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
            System.out.print("Now array contains: ");
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

            System.out.print("Now array contains: ");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("Position number is too big. Please, enter correct number next time.");
        }
        return newArray;
    }

    /*Task 10. Write a Java program to find the maximum and minimum value of an array.*/
    public static void task10(int[] numArray) {
        System.out.println("\n\n***Task 10. Write a Java program to find the maximum and minimum value of an array.***");
        int max = numArray[0];
        int min = numArray[0];

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
            if (numArray[i] < min) {
                min = numArray[i];
            }
        }
        System.out.println("Maximum value: " + max + ". Minimum value: " + min + ".");
    }

    /*Task 11. Write a Java program to reverse an array of integer values.*/
    public static int[] task11(int[] numArray) {
        System.out.println("\n***Task 11. Write a Java program to reverse an array of integer values.***");

        for (int i = 0; i < numArray.length / 2; i++) {
            int temp = numArray[i];
            numArray[i] = numArray[numArray.length - 1 - i];
            numArray[numArray.length - 1 - i] = temp;
        }

        System.out.print("Reversed array:");
        for (int value : numArray) {
            System.out.print(" " + value);
        }
        return numArray;
    }

    /*Task 12. Write a Java program to find the duplicate values of an array of integer values.*/
    public static void task12(int[] numArray) {
        System.out.println("\n\n***Task 12. Write a Java program to find the duplicate values of an array of integer values.***");

        // sort array
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

/*
        System.out.print("Sorted array of numbers : ");
        for (int value : numArray) {
            System.out.print(value + " ");
        }
*/

        // find duplicates
        boolean duplicateCheck = false;
        System.out.print("Next values have duplicate:");

        if (numArray[0] == numArray[numArray.length - 1]) {
            System.out.print(" " + numArray[0]);
        } else {
            for (int i = 1; i < numArray.length - 1; i++) {
                if ((numArray[i] == numArray[i - 1] && numArray[i] != numArray[i + 1])
                        || (numArray[i] != numArray[i - 1] && numArray[i] == numArray[numArray.length - 1])) {
                    System.out.print(" " + numArray[i]);
                    duplicateCheck = true;
                }
            }
            if (!duplicateCheck) {
                System.out.print(" Sorry, no duplicates.");
            }
        }
    }

    /*Task 13. Write a Java program to find the duplicate values of an array of string values.*/
    static public void task13(String[] strArray) {
        System.out.println("\n\n***Task 13. Write a Java program to find the duplicate values of an array of string values.***");

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

        //string array output
/*        System.out.print("\nSorted array of strings : ");
        for (String s : strArray) {
            System.out.print("\"" + s + "\"" + " ");
        }*/

        // find duplicates
        boolean duplicateCheck = false;
        System.out.print("Next values have duplicate:");

        if (strArray[0].equals(strArray[strArray.length - 1])) {
            System.out.print(" " + strArray[0]);
        } else {
            for (int i = 1; i < strArray.length - 1; i++) {
                if (strArray[i].equals(strArray[i - 1]) && !strArray[i].equals(strArray[i + 1])
                        || (!strArray[i].equals(strArray[i - 1]) && strArray[i].equals(strArray[strArray.length - 1]))) {
                    System.out.print(" " + strArray[i]);
                    duplicateCheck = true;
                }
            }
            if (!duplicateCheck) {
                System.out.print(" Sorry, no duplicates.");
            }
        }

    }

    /*Task 14. Write a Java program to find the common elements between two arrays (string values).*/
    public static void task14(String[] firstArray) {
        System.out.println("\n\n***Task 14. Write a Java program to find the common elements between two arrays (string values).***");

        //first array sorting
        String str1Temp;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length - 1 - i; j++) {
                if (firstArray[j].compareTo(firstArray[j + 1]) > 0) {
                    str1Temp = firstArray[j + 1];
                    firstArray[j + 1] = firstArray[j];
                    firstArray[j] = str1Temp;
                }
            }
        }
/*        System.out.print("\nSorted first array of strings : ");
        for (String s : firstArray) {
            System.out.print("\"" + s + "\"" + " ");
        }*/

        String[] secondArray = {"ooo", "bbb", "aaa", "kkk", "lll"};

        System.out.print("Array for comparison: ");
        for (String value : secondArray) {
            System.out.print(" \"" + value + "\"");
        }

        // strings second array sorting
        String str2Temp;
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray.length - 1 - i; j++) {
                if (secondArray[j].compareTo(secondArray[j + 1]) > 0) {
                    str2Temp = secondArray[j + 1];
                    secondArray[j + 1] = secondArray[j];
                    secondArray[j] = str2Temp;
                }
            }
        }

/*        System.out.print("\nSorted second array of strings : ");
        for (String s : secondArray) {
            System.out.print("\"" + s + "\"" + " ");
        }*/

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
    public static void task15(int[] firstArray) {
        System.out.println("\n\n***Task 15. Write a Java program to find the common elements between two arrays of integers.***");


        // first array sorting
        int numTemp1;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length - 1 - i; j++) {
                if (firstArray[j] > firstArray[j + 1]) {
                    numTemp1 = firstArray[j + 1];
                    firstArray[j + 1] = firstArray[j];
                    firstArray[j] = numTemp1;
                }
            }
        }
/*        System.out.print("Sorted first array: ");
        for (int value : firstArray) {
            System.out.print(value + " ");
        }
        System.out.println();*/

        //create second array for comparison
        int[] secondArray = {4, 6, 2, 3, 4, 68, 2, 1, 10, 10, 1}; // {1, 1, 1, 1, 1}
        System.out.print("Array for comparison:");
        for (int value : secondArray) {
            System.out.print(" " + value);
        }

        // second array sorting
        int numTemp2;
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray.length - 1 - i; j++) {
                if (secondArray[j] > secondArray[j + 1]) {
                    numTemp2 = secondArray[j + 1];
                    secondArray[j + 1] = secondArray[j];
                    secondArray[j] = numTemp2;
                }
            }
        }
/*        System.out.print("\nSorted second array: ");
        for (int value : secondArray) {
            System.out.print(value + " ");
        }*/

        System.out.print("\nNext values are common:");
        for (int i = 0; i < firstArray.length - 1; i++) {
            for (int j = 0; j < secondArray.length - 1; j++) {
                if (firstArray[i] == secondArray[j] && secondArray[j] != secondArray[j + 1] && firstArray[i] != firstArray[i + 1]) {
                    System.out.print(" " + firstArray[i]);
                }
            }
        }

        for (int i = 0; i < secondArray.length - 1; i++) {
            if (firstArray[firstArray.length - 1] == secondArray[i] && secondArray[i] != secondArray[i + 1]) {
                System.out.print(" " + secondArray[i]);
            }
        }


    }

    /*Task 16. Write a Java program to remove duplicate elements from an array.*/
    public static int[] task16(int[] numArray) {
        System.out.println("\n\n***Task 16. Write a Java program to remove duplicate elements from an array.***");

        // sort array
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

/*
        System.out.print("Sorted array of numbers : ");
        for (int value : numArray) {
            System.out.print(value + " ");
        }
        System.out.println();
*/

        // find duplicates
        int duplicateQuantity = 0;
//        System.out.print("Next values have duplicate:");


        if (numArray[0] == numArray[numArray.length - 1]) {
            System.out.print(" " + numArray[0]);
            duplicateQuantity = numArray.length - 1;
        } else {
            for (int i = 1; i < numArray.length - 1; i++) {
/*                if ((numArray[i] == numArray[i - 1] && numArray[i] != numArray[i + 1])
                        || (numArray[i] != numArray[i - 1] && numArray[i] == numArray[numArray.length - 1])) {
                    System.out.print(" " + numArray[i]);
                }*/
                if (numArray[i] == numArray[i - 1] || numArray[i] == numArray[numArray.length - 1]) {
                    duplicateQuantity++;
                }
            }
            if (duplicateQuantity == 0) {
                System.out.print(" Sorry, no duplicates.");
            }
        }
//        System.out.print("\nQuantity of duplicates: " + duplicateQuantity);

        //create new array
        int size = numArray.length - duplicateQuantity;
        int[] newArray = new int[size];

        //fill new array
        if (numArray[0] == numArray[numArray.length - 1]) {
            newArray[0] = numArray[0];
        } else {
            newArray[0] = numArray[0];
            int j = 1;
            for (int i = 1; i < numArray.length; i++) {
                if (numArray[i] != numArray[i - 1]) {
                    newArray[j++] = numArray[i];
                }
            }
        }

        System.out.print("Duplicates removed. Now array contains:");
        for (int value : newArray) {
            System.out.print(" " + value);
        }
        return newArray;
    }

    /*Task 17. Write a Java program to find the second largest element in an array.*/
    public static void task17(int[] numArray) {
        System.out.println("\n\n***Task 17. Write a Java program to find the second largest element in an array.***");

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
 /*       System.out.print("Sorted array of numbers : ");
        for (int value : numArray) {
            System.out.print(value + " ");
        }
        System.out.println();*/

        if (numArray[0] == numArray[numArray.length - 1]) {
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
    public static void task18(int[] numArray) {
        System.out.println("\n***Task 18. Write a Java program to find the second smallest element in an array.***");

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
/*        System.out.print("Sorted array of numbers : ");
        for (int value : numArray) {
            System.out.print(value + " ");
        }
        System.out.println();*/

        if (numArray[0] == numArray[numArray.length - 1]) {
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
    public static void task19(int[] numArray) {
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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        //output matrix2
        System.out.println("Second matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        //add two matrices
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] +=matrix2[i][j];
            }
        }

        System.out.println("Result of adding:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matrix1[i][j]);
            }
                System.out.println();
        }

    }

    /*Task 20. Write a Java program to convert an array to ArrayList.*/
    public static void task20(String[] strArray, int[] numArray){
        System.out.println("\n***Task 20. Write a Java program to convert an array to ArrayList.***");

        List<Integer> integerArrayList = new ArrayList<Integer>(numArray.length);
        for (int value: numArray) {
            integerArrayList.add(value);
        }

        ArrayList<String> stringArrayList = new ArrayList<String>(strArray.length);
        for (String value: strArray) {
            stringArrayList.add(value);
        }

        System.out.println("Integer arrayList = " + integerArrayList);
        System.out.println("String arrayList = " + stringArrayList);
    }

} //class closer