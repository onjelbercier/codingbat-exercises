package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrontPiece {

    /*Given an int array of any length,
    return a new array of its first 2 elements.
    If the array is smaller than length 2,
    use whatever elements are present.*/

    public List frontPiece(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        if(nums.length > 1) return  Arrays.asList(numsList.get(0), numsList.get(1));

        else {

            return numsList;
        }

    }


}