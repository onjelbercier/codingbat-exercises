package com.bercier.codingbat.array1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum2 {

    /*Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.*/

    public int sum2(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        //guard against array length == 0; empty array
        if(numsList.size()==0){
            return 0;
        }

        //return element[1] if array length less than 2
        if(numsList.size() < 2){
            return numsList.get(0);
        }

        //finally, do the math as requirements state; add first two elements
        return numsList.get(0) + numsList.get(1);

    }//end of sum2

}
