package com.practice.array;

import java.util.*;

public class FindDiffTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[]  nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> lists = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length;
        Set<Integer> setOne = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!isFound(nums2, nums1[i])) {
                setOne.add(nums1[i]);
            }
        }
        lists.add(setOne.stream().toList());

        int m = nums2.length;
        Set<Integer> setTwo = new HashSet<>();
        for(int i=0; i<m; i++){
            if(!isFound(nums1, nums2[i])) {
                setTwo.add(nums2[i]);
            }
        }
        lists.add(setTwo.stream().toList());

        return lists;
    }

    private static boolean isFound(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return true;
            }
            else if(target < nums[mid]) {
                end = end - 1;
            }
            else if(target > nums[mid]) {
                start = mid + 1;
            }
        }
        return false;
    }

}
