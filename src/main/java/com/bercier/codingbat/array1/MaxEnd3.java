package com.bercier.codingbat.array1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxEnd3 {

    /*    Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.*/

    public List maxEnd3(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());


        if(numsList.get(0) == numsList.get(2)){
            return Arrays.asList(nums[0],nums[0], nums[0]);


        }

        if(numsList.get(0) > numsList.get(2)){
            return Arrays.asList(nums[0],nums[0], nums[0]);


        }
        else if(numsList.get(2) > numsList.get(0)){
            return Arrays.asList(nums[2],nums[2], nums[2]);

        }
        else
            return numsList;
    }

}
