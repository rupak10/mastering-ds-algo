package com.practice.array;
import java.util.*;

public class IntersectionMultipleArrays {

    public static void main(String[] args) {
        //int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        int[][] nums = {{1,2,3},{4,5,6}};
        System.out.println(intersection(nums));
    }
    private static List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int totalRow = nums.length;
        for(int row=0; row<totalRow; row++) {
            int totalColumn = nums[row].length;
            for(int col=0; col<totalColumn; col++) {
                int key = nums[row][col];
                if(map.containsKey(nums[row][col])) {
                    map.put(key, map.get(key)+1);
                }
                else {
                    map.put(key, 1);
                }
            }
        }
        for(Integer key : map.keySet()) {
            if(map.get(key) == totalRow) {
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
    }
}
