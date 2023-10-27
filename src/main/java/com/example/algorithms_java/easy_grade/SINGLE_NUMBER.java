package com.example.algorithms_java.easy_grade;

import java.util.*;

public class SINGLE_NUMBER {





    public static void main(String[] args) {
        int[] test = {4,4,2,1,1};
        int result = singleNumberHashMap(test);
        System.out.println(result);
    }






    // Using bitwise Operator
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
        // Create a HashMap to store the count of each element.
       HashMap<Integer, Integer> storeNum = new HashMap<>();
        //default variable for the result
       int result = 0;
       // Store in the nums Items in the hashmap
        for (int num : nums){
            storeNum.put(num, storeNum.getOrDefault(num,0) + 1);
        }
        // iterate through the map and print the value
        for (Map.Entry<Integer, Integer> number : storeNum.entrySet()){
            if (number.getValue() == 1){
                result = number.getKey();
            }
        }

        return result;
    }
}
