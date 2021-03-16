package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{7, 8, 9};

        MyCustomSuperArray array = new MyCustomSuperArray(array1);
        array.print();
        array.add(5);
        array.print();
        array.remove(2);
        array.print();
        array.swap(1, 3);
        array.print();
        array.addArray(array2);
        array.print();
        System.out.println(array.size());

        System.out.println("-------------------------------------");

        MyCustomSuperSet arraySet = new MyCustomSuperSet(array1);
        arraySet.add(9);
        arraySet.add(0);
        arraySet.add(0);
        arraySet.add(7);
        arraySet.print();
        arraySet.addArray(array2);
        arraySet.print();
        System.out.println(arraySet.size());
    }
}