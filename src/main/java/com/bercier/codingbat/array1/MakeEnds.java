package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeEnds {

    /*Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
    The original array will be length 1 or more.*/

    public List makeEnds(int[] nums) {

        List<Integer>numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return Arrays.asList(numsList.get(0),numsList.get(nums.length-1));

    }


}
