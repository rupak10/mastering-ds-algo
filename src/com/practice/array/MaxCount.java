package com.practice.array;

public class MaxCount {

    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(nums));
    }

    private static int maximumCount(int[] nums) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        for(int num : nums) {
            if(num < 0) {
                negativeNumber++;
            }
            else if(num > 0) {
                positiveNumber++;
            }
        }
        return Math.max(positiveNumber, negativeNumber);
    }
}


