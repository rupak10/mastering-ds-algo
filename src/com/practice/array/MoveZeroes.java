package com.practice.array;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    private static void moveZeroes(int[] nums) {
        int arrLength = nums.length;
        int nonZeroIndex = 0;
        for (int i = 0; i < arrLength; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for(int i = nonZeroIndex; i < arrLength; i++) {
            nums[i] = 0;
        }
    }
}
