package com.example.algorithms_java.easy_grade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plus_One {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] result = plusOne(digits);
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
}
