package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Double23 {

    /*Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.*/

    public boolean double23(int[] nums) {

        List<Integer> numsList= Arrays.stream(nums).boxed().collect(Collectors.toList());

        final long numTwos = numsList.stream().filter(num -> num==2).count();

        final long numThrees = numsList.stream().filter(num -> num==3).count();

        return numTwos==2 || numThrees==2;
    }

}
