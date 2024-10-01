package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {
        //int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {10,2,5,10,9,1,1,4,3,7};
       // int[] nums = {1};
        System.out.println(findDuplicates(nums));
    }

    private static List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int idx = Math.abs(nums[i]);
            if(nums[idx - 1] < 0) {
                list.add(idx);
            }
            else {
                nums[idx - 1] *= -1;
            }
        }
        return list;
    }

}
