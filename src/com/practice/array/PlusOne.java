package com.practice.array;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));

    }

    private static int[] plusOne(int[] digits) {
        int[] newDigits = new int[digits.length + 1];
        int arrLength = digits.length;
        int index = arrLength;
        int carry = 1;
        for(int i = arrLength-1; i >= 0; i--){
            int sum = digits[i] + carry;
            if(sum > 9){
                carry = 1;
                newDigits[index--] = 0;
            }
            else {
                carry = 0;
                newDigits[index--] = sum;
            }
        }
        if(carry == 1){
            newDigits[index] = 1;
            return newDigits;
        }
        return Arrays.copyOfRange(newDigits, 1, newDigits.length);
    }
}
