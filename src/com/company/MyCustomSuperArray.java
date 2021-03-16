package com.company;

import java.lang.reflect.Array;

public class MyCustomSuperArray implements List {
    //region Properties
    private int[] array = new int[1];
    //endregion

    //region Constructors
    public MyCustomSuperArray() {
    }

    public MyCustomSuperArray(int[] array) {
        this.array = array;
    }
    //endregion

    //region Public Methods
    @Override
    public int[] add(int a) {
        int[] myArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = array[i];
        }
        myArray[myArray.length - 1] = a;
        array = myArray;
        return array;
    }

    @Override
    public int[] remove(int index) {
        if (array.length == 0) {
            return array;
        } else {
            int[] myArray = new int[array.length - 1];
            for (int i = 0; i < index; i++) {
                myArray[i] = array[i];
            }
            for (int i = index; i < array.length - 1; i++) {
                myArray[i] = array[i + 1];
            }
            array = myArray;
            return array;
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int[] swap(int index1, int index2) {
        int[] myArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = array[i];
        }
        int temp = array[index1];
        myArray[index1] = array[index2];
        myArray[index2] = temp;
        array = myArray;
        return array;
    }

    @Override
    public int[] addArray(int[] array1) {
        int[] myArray = new int[array.length + array1.length];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = array[i];
        }
        for (int i = array.length, j = 0; i < myArray.length; i++, j++) {
            myArray[i] = array1[j];
        }
        array = myArray;
        return array;
    }

    @Override
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
    //endregion

    //region Getters and Setters
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    //endregion
}