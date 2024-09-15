package com.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,1,3,3,9};
        int target = 7;

        //int[] arr = twoSum(nums, target);
        //int[] arr = twoSumHashMap(nums, target);
        //int[] arr = twoSumTwoPointer(nums, target);
        int[] arr = towSumBinarySearch(nums, target);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSum(int[] nums, int target) {
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

    /**
     * HashMap approach
     * Complexity : O(n)
     */
    private static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int arrLength = nums.length;
        for(int i=0; i<arrLength; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1}; //not found
    }

    /**
     * Prepare a 2D matrix from the array to hold original indices of the element
     * Sort the array and then apply tow pointer approach
     */
    private static int[] twoSumTwoPointer(int[] nums, int target) {
        int[][] numsWithIndices = new int[nums.length][2];
        int arrLength = nums.length;
        for(int i=0; i<arrLength; i++) {
            numsWithIndices[i][0] = nums[i];
            numsWithIndices[i][1] = i;
        }
        Arrays.sort(numsWithIndices, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(numsWithIndices));
        int left = 0;
        int right = arrLength-1;
        while(left < right) {
            int sum = numsWithIndices[left][0] + numsWithIndices[right][0];
            if(sum == target) {
                return new int[]{numsWithIndices[left][1], numsWithIndices[right][1]};
            }
            else if(sum > target) {
                right--;
            }
            else if (sum < target) {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * Binary search approach
     * Complexity : O(nlogn)
     */
    private static int[] towSumBinarySearch(int[] nums, int target) {
        int[][] numsWithIndices = new int[nums.length][2];
        int arrLength = nums.length;
        for(int i=0; i<arrLength; i++) {
            numsWithIndices[i][0] = nums[i];
            numsWithIndices[i][1] = i;
        }
        System.out.println(Arrays.deepToString(numsWithIndices));
        Arrays.sort(numsWithIndices, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(numsWithIndices));
        for(int i=0; i<arrLength; i++) {
            int complement = target - numsWithIndices[i][0];
            int start = i+1;
            int end = arrLength-1;
            int complementIndex = binarySearch(numsWithIndices, complement, start, end);
            if(complementIndex != -1) {
                return new int[]{numsWithIndices[i][1], complementIndex};
            }
        }
        return new int[]{-1, -1};
    }

    private static int binarySearch(int[][] numsWithIndices, int complement, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (complement == numsWithIndices[mid][0]) {
                return numsWithIndices[mid][1];
            } else if (complement < numsWithIndices[mid][0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
