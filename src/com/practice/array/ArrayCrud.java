package com.practice.array;

import java.util.Arrays;

public class ArrayCrud {

    private static int ARRAY_SIZE = 10;
    private static int[] arr = new int[ARRAY_SIZE];
    private static int arrElementCount = 0;

    public static void main(String[] args) {
        addElementToEnd(5);
        addElementToEnd(10);
        addElementToEnd(20);
        addElementToEnd(20);
        addElementToEnd(20);

        System.out.println(Arrays.toString(arr));
        System.out.println("Array element count : "+arrElementCount);
    }

    private static String addElementToEnd(int element) {
        String msg = "";
        if(arrElementCount == ARRAY_SIZE) {
            msg = "Array is full!";
        }
        else {
            if(arrElementCount >= 0 && arrElementCount < ARRAY_SIZE) {
                arr[arrElementCount] = element;
                arrElementCount++;
                msg = element + " added to the array";
            }
        }
        return msg;
    }
}
