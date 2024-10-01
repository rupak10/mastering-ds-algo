package com.practice.array;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3,3,2,1,4};
       // int[] nums = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
        System.out.println(thirdMax(nums));
    }

    private static int thirdMax(int[] nums) {
        int arrLength = nums.length;
        Arrays.sort(nums);
        if(arrLength < 3) {
            return nums[arrLength-1];
        }
        int[] reversedArr = new int[arrLength];
        int k = 0;
        for(int i = arrLength-1; i>=0; i--) {
            reversedArr[k++] = nums[i];
        }

        int unique_index = 0;
        int distinct_count = 0;
        for(int j=1; j<arrLength; j++) {
            if(reversedArr[j] != reversedArr[unique_index]) {
                distinct_count++;
                unique_index = j;
                if(distinct_count == 2) {
                    return reversedArr[j];
                }
            }
        }
        return reversedArr[0];
    }
}
