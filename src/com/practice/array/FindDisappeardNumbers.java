package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappeardNumbers {

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    private static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int index = Math.abs(nums[i]);
            if(nums[index - 1] > 0) {
                nums[index - 1] = nums[index - 1]*(-1);
            }
        }
        for(int i=0; i<n; i++) {
            if(nums[i] > 0) {
                list.add(i+1);
            }
        }
        System.out.println(Arrays.toString(nums));
        return list;
    }
}
