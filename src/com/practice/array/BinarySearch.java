package com.practice.array;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 0;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else if(target > nums[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
