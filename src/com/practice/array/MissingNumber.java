package com.practice.array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int arrLength = nums.length;
        int sum = (arrLength*(arrLength + 1))/2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
