package com.bercier.codingbat.array1;

public class MaxTriple {

    /*Given an array of ints of odd length,
    look at the first, last, and middle values in the array and return the largest.
    The array length will be a least 1.*/

    public int maxTriple(int[] nums) {
        int middleIndex = (nums.length/2);

        int f= nums[0];
        int m= nums[middleIndex];
        int l= nums[nums.length-1];

        return Math.max(f, Math.max(m, l));

    }

}
