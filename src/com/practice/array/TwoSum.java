package com.practice.array;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,3,3,15};
        int target = 6;

        int[] arr = twoSumBruteForce(nums, target);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        int[] arr = new int[2];
        int arrLength = nums.length;
        for(int i=0; i<arrLength-1; i++) {
            for(int j=i+1; j<arrLength; j++) {
                if(nums[i]+nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}
