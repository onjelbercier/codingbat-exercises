package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NotAlone {

    /*We'll say that an element in an array is "alone" if there are values before and after it,
    and those values are different from it.
    Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.*/

    public List<Integer> notAlone(int[] nums, int val) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return IntStream.range(0,numsList.size()).map(i->{

            if(i > 0 && i < numsList.size()-1 && numsList.get(i) == val && numsList.get(i-1) != val && numsList.get(i+1) != val){

                return Math.max(numsList.get(i-1), numsList.get(i+1));
            }
            return numsList.get(i);
        }).boxed().collect(Collectors.toList());


    }


}
