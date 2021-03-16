package com.company;

public class MyArray {
    //region Properties
    private int[] array = new int[]{0};
    //endregion

    //region Constructors
    public MyArray() {
    }

    public MyArray(int[] array) {
        this.array = array;
    }
    //endregion

    //region Public Methods
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
