package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse3 {

/*
    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
*/

    public List reverse3(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return Arrays.asList(numsList.get(2),numsList.get(1),numsList.get(0));
    }


}
