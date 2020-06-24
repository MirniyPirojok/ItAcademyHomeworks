package homework7;

import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedList {

    public static final int STRING_COUNT = 10000;
    public static final int STRING_NUMBER_TO_REMOVE = 5000;
    public static final int STRING_NUMBER_TO_SET = 5001;

    public static void main(String[] args) {

        //*** Array List ***
        System.out.println("*** Array List ***");

        long startedTimeMillsArray = System.currentTimeMillis();

        java.util.ArrayList<String> stringArrayList = new java.util.ArrayList<>();

        for (int i = 0; i < STRING_COUNT; i++) {
            stringArrayList.add("String" + i);
        }

        stringArrayList.remove(STRING_NUMBER_TO_REMOVE);
        stringArrayList.add("******New string");
        stringArrayList.set(STRING_NUMBER_TO_SET, "******Set string");

        for (String string : stringArrayList) {
            System.out.println(" " + string);
        }

        long finishedTimeMillsArray = System.currentTimeMillis();

        //*** Linked List ***
        System.out.println("\n*** Linked List ***");

        long startTimeMillsLinked = System.currentTimeMillis();

        List<String> stringLinkedList = new LinkedList<>();
        for (int i = 0; i < STRING_COUNT; i++) {
            stringLinkedList.add("String" + i);
        }

        stringLinkedList.remove(STRING_NUMBER_TO_REMOVE);
        stringLinkedList.add("******New string");
        stringLinkedList.set(STRING_NUMBER_TO_SET, "******Set string");

        for (String string : stringLinkedList) {
            System.out.println(" " + string);
        }

        long finishedTimeMillsLinked = System.currentTimeMillis();

        //***Time***
        System.out.println();
        long arrayListTime = finishedTimeMillsArray - startedTimeMillsArray;
        System.out.println("arrayListTime = " + arrayListTime + " ms.");

        long linkedListTime = finishedTimeMillsLinked - startTimeMillsLinked;
        System.out.println("linkedListTime = " + linkedListTime + " ms.");

    }//end of main
}//end of class
