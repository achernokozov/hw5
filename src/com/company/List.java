package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class List {
    ///first task
    static ArrayList<Integer> firstCollection = new ArrayList<>();

    public static void homeWork() {
        for (int i = 0; i < 50; i++) {
            firstCollection.add((int) Math.round(Math.random() * 30) - 15);
        }
////        firstCollection.add(8);
////        firstCollection.add(8);
////        firstCollection.add(8);
////        firstCollection.add(8);
////        firstCollection.add(8);
        System.out.println("First collection" + firstCollection);
        ArrayList<Integer> secondTask = new ArrayList<>(firstCollection);
        System.out.println("Second" + secondTask);

        Set<Integer> set = new HashSet<>(firstCollection);
        System.out.println("Second set" + set);

        Collections.sort(firstCollection);
        System.out.println("Sorted collection " + firstCollection); //sort collection

        System.out.println("Max value " + Collections.max(firstCollection)); //max

        System.out.println("Min value " + Collections.min(firstCollection)); //min

        int sum = 0;
        for (int i : firstCollection) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum); //sum

        ArrayList<Integer> positiveList = new ArrayList<>(firstCollection);
        positiveList.removeIf(i -> (i < 1));
        System.out.println("Positive list: " + positiveList); // positive

        ArrayList<Integer> evenList = new ArrayList<>(firstCollection);
        evenList.removeIf(i -> (i % 2 != 0));
        System.out.println("Even list: " + evenList); // even

        if (firstCollection.indexOf("7")<0) System.out.println("ERROR: There is no 7 in the list"); //find 7
        else {
            System.out.println("This is index of 7" + firstCollection.indexOf("7"));
        }




    }
}