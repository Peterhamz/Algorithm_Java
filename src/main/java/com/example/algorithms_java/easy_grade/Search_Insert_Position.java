package com.example.algorithms_java.easy_grade;

import java.util.Arrays;

import static org.apache.tomcat.util.buf.ByteChunk.indexOf;

public class Search_Insert_Position {

//  Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [1,3,5,6], target = 5
//  Output: 2

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 4, 5},6));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);

        if (index < 0) {
            //if target not found, return the insertion point
            return -index - 1;
        } else {
            //if target found, return the index
            return index;
        }

    }
}
