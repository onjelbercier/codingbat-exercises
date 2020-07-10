package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fix23 {

    /*Given an int array length 3, if there is a
    2 in the array immediately followed by a 3,
    set the 3 element to 0.
    Return the changed array.*/

    public List fix23(int[] nums) {

        List<Integer> numsList= Arrays.stream(nums).boxed().collect(Collectors.toList());

        //this range of numbers represents the indices or array
        return IntStream.range(0, nums.length)
                .mapToObj(index -> {
                    if(index > 0){
                        return numsList.get(index) == 3?numsList.get(index-1)==2?0:numsList.get(index):numsList.get(index);
                    }
                    //just return the first element
                   return numsList.get(index);
                }).collect(Collectors.toList());

    }


}
