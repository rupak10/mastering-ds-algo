package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {

    public static void main(String[] args) {
        int rowIndex = 5;
        System.out.println(getRow(rowIndex));
    }

    private static List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) {
            return List.of(1);
        }
        else if(rowIndex == 1) {
            return List.of(1, 1);
        }

        List<Integer> prevList = List.of(1, 2, 1);
        if(rowIndex == 2) {
            return prevList;
        }

        int counter = 3;

        List<Integer> currentList = null;
        while(counter <= rowIndex) {
            currentList = new ArrayList<>();
            for(int i=0; i<=counter; i++) {
                if(i==0 || i==counter) {
                    currentList.add(1);
                }
                else {
                    int sum = prevList.get(i) + prevList.get(i-1);
                    currentList.add(sum);
                }
            }
            prevList = currentList;
            counter++;
        }

        return currentList;
    }
}
