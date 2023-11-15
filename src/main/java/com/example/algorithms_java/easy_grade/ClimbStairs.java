package com.example.algorithms_java.easy_grade;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {

    public static void main(String[] args) {
       // System.out.println(climbStairs(2));

        int result = climbingStairsWithHashMap(5);
        System.out.println("Distinct ways to climb stairs: " + result);
    }

    public static int climbStairs(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i-2];
        }

        return dp[n];
    }

    public static int climbingStairsWithHashMap(int n){

            // Create a HashMap for memoization
            Map<Integer, Integer> memo = new HashMap<>();
            return climbStairsHelper(n, memo);
        }

        private static int climbStairsHelper(int n, Map<Integer, Integer> memo) {
            // Base cases
            if (n <= 1) {
                return 1;
            }

            // Check if the result for 'n' is already memoized
            if (memo.containsKey(n)) {
                return memo.get(n);
            }

            // Calculate the result for 'n' and memoize it
            int ways = climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2, memo);
            memo.put(n, ways);
            System.out.println(ways);

            return ways;
        }

    }

