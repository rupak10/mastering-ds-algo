package com.practice.array;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        //int[] nums = {1,1,0,1,1,1};
        //int[] nums = {1,0,1,1,0,1};
        int[] nums = {1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int arrLength = nums.length;
        int counter = 0;
        int maxVal = 0;
        for(int i=0; i<arrLength; i++) {
            if(nums[i] == 1) {
                counter++;
            }
            else {
                if(counter > maxVal) {
                    maxVal = counter;
                }
                counter = 0;
            }
        }
        maxVal = Math.max(counter, maxVal);
        return maxVal;
    }
}
