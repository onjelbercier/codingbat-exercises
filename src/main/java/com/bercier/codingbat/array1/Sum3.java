package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum3 {

/*
    Given an array of ints length 3, return the sum of all the elements.
*/


    public int sum3(int[] nums) {


        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return (numsList.get(0) + numsList.get(1) + numsList.get(2));





    }

}
