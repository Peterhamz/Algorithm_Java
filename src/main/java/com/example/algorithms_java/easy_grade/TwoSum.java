package com.example.algorithms_java.easy_grade;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {
        int[] testing = {2,7,11,15};
        int[] result = twoSumHashMap(testing, 9);
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
        Map<Integer, Integer> numberTOIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numberTOIndex.containsKey(complement)){
                return new int[]{numberTOIndex.get(complement),i};
            }
            numberTOIndex.put(nums[i],i);

        }

        return new int[]{0};
    }



    static class Solution {
        public int climbStairs(int n) {
            if (!(n==n)){
                return n + 1;
            }else {
                return n;
            }
        }
    }
}

