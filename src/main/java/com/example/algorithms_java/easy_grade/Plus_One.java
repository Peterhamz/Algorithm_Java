package com.example.algorithms_java.easy_grade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plus_One {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] result = plusOneNumber(digits);
        System.out.println(Arrays.toString(result));

    }

    public static int[] plusOne(int[] digits) {

        List<Integer> digitList = new ArrayList<>();

        int sumNumber = 0;

        String sumNumTOString = "";

        StringBuilder stringDigit = new StringBuilder();

        for (int j : digits) {
            stringDigit.append(j);
        }
         sumNumber = Integer.parseInt(stringDigit.toString());
            sumNumber++;

          sumNumTOString =  Integer.toString(sumNumber);


        for (int i = 0; i < sumNumTOString.length(); i++) {
            char digitChar = sumNumTOString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            digitList.add(digit);
        }

        int[] resultArray = new int[digitList.size()];

        for (int i = 0; i < digitList.size(); i++) {
             resultArray[i] = digitList.get(i);

        }

        return resultArray;
    }

    // Another Solution
    public static int[] plusOneNumber(int[] digits){


        int n = digits.length;



        // Iterate from the rightmost digit to the left
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {


                // If the digit is less than 9, just increment it by 1 and return
                digits[i]++;
                return digits;
            } else {


                // If the digit is 9, set it to 0 and continue to the next digit
                digits[i] = 0;
            }
        }

        // If we reached this point, it means we have a carry to the most significant digit
        // In this case, we need to add a new digit (1) at the beginning of the array
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
    public  static int[] plusOneWithHashMap(int[] digits){

        return digits;
    }
}

