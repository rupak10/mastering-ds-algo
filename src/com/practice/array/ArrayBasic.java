package com.practice.array;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 0, 6};
       // Arrays.sort(arr);

/*      int counter = 0;
        for (int a : arr) {
            counter++;
        }
        System.out.println("Array Length : "+counter);*/

        System.out.println(Arrays.toString(arr));
        int elementToRemove = 1;
        removeElement(arr, elementToRemove);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * remove provided element from the array.
     * it will also output relevant message. --
     */
    private static void removeElement(int[] arr, int elementToRemove) {
        int index = -1;
        int arrLength = arr.length;
        for(int i=0; i<arrLength; i++) {
            if(arr[i] == elementToRemove) {
                index = i;
            }
        }
        if(index == -1) {
            System.out.println(elementToRemove + " not found in the array!");
            return;
        }

        for(int i=index; i<arrLength-1; i++) {
            arr[i] = arr[i+1];
        }
    }


}