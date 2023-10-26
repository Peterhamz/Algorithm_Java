package com.example.algorithms_java.easy_grade;

import java.util.*;

public class SINGLE_NUMBER {





    public static void main(String[] args) {
        int[] test = {4,2,2,1,1};
        int result = singleNumber(test);
        System.out.println(result);
    }






    // Using bitwize Operator
    public static int singleNumber(int[] nums){
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }






    // Using HashSet
    public static int singleNumberHashSet(int[] nums) {

       Set<Integer> set = new HashSet<>();

       int number = 0;

        for (int j : nums) {
            if (set.contains(j)) {
                set.remove(j);
            } else {
                set.add(j);
            }

        }
        for (Integer num : set){
            number = num;
        }
        return number;
    }




    // Using HashMap

    public static int singleNumberHashMap(int[] nums){

    }
}
