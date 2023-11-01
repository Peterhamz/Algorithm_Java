package com.example.algorithms_java.easy_grade;

import java.util.Arrays;

public class TwoSum {


    public static void main(String[] args) {
        int[] testing = {2,7,11,15};
        int[] result = twoSum(testing, 9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int number = nums[j] + nums[i];
                if(number == target){
                  return new int[]{nums[i],nums[j]};
                }
            }

        }
        return new int[]{0};
    }

    public static int[] twoSumHashMap(int[] nums, int target) {

        return nums;
    }
}

