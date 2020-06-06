package homework2;

public class Homework2Util {

    public static void bubbleSort(Integer[] numArray) {
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
    }

    public static void bubbleSort(String[] strArray) {
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
    }

    public static <T> void printArray(T[] array) {
        for (T value : array) {
            System.out.print(value + " ");
        }
    }

    public static int calcSum(Integer[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static <T> void findDuplicate(T[] array) {
        // find duplicates
        boolean duplicateCheck = false;
        System.out.print("Next values have duplicate:");

        if (array[0].equals(array[array.length - 1])) { //output value if only single element in the array
            System.out.print(" " + array[0]);
        } else {
            //checking if the value has duplicates among neighbors
            for (int i = 1; i < array.length - 1; i++) {
                boolean isEqualPrevious = array[i].equals(array[i - 1]);
                boolean isNotEqualNext = !array[i].equals(array[i + 1]);
                boolean isNotEqualPrevious = !array[i].equals(array[i - 1]);
                boolean isEqualLast = array[i].equals(array[array.length - 1]);
                if (isEqualPrevious && isNotEqualNext || isNotEqualPrevious && isEqualLast) {
                    System.out.print(" " + array[i]);
                    duplicateCheck = true;
                }
            }
            if (!duplicateCheck) {
                System.out.print(" Sorry, no duplicates.");
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}//end of class
