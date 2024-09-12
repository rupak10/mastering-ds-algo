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
        addElementToIndex(2, 4);
        System.out.println(Arrays.toString(arr));
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

    private static void addElementToIndex(int element, int index) {
        if(arrElementCount < ARRAY_SIZE) {
            for(int i = arrElementCount-1; i >= index; i--) {
                arr[i+1]=arr[i];
            }
            arr[index]=element;
            arrElementCount++;
        }
    }
}
