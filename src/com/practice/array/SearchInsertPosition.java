package com.practice.array;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 10, 14};
        int element = 19;

       // int index =  findInsertPosition(arr, element);
        int index =  findInsPosition(arr, element);
        System.out.println(index);
    }

    /**
     * Binary search approach
     * Complexity : O(logn)
     */
    private static int findInsertPosition(int[] arr, int element) {
        int arrLength = arr.length;
        int start = 0;
        int end = arrLength - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == element) {
                return mid;
            }
            else if(element > arr[mid]) {
                start = mid + 1;
            }
            else if(element < arr[mid]) {
                end = mid - 1;
            }
        }
        return start;
    }

    /**
     * Complexity O(n)
     */
    private static int findInsPosition(int[] arr, int element) {
        int arrLength = arr.length;
        int index = -1;
        int i;
        for(i=0; i<arrLength; i++) {
            if(element == arr[i]) {
                index = i;
                break;
            }
            else if(element > arr[i]) {
                continue;
            }
            else if(element < arr[i]) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            index = i;
        }
        return index;
    }

}
