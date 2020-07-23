package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MidThree {

    /*
    Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
*/

    public List midThree(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int middleIndex = (nums.length/2)-1;

        return Arrays.asList(numsList.get(middleIndex), numsList.get(middleIndex +1),numsList.get(middleIndex+2));
    }

}
