package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShiftLeft {

    /*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
    You may modify and return the given array, or return a new array.*/

    public Object shiftLeft(int[] nums) {

        List<Integer>numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        if(numsList.size() < 2)
            return numsList;

        return  IntStream.range(0,numsList.size()).map(i -> {

            if(i == numsList.size()-1) {
                return numsList.get(0);
            }
            else {
                return numsList.get(i+1);
            }

        }).boxed().collect(Collectors.toList());

    }


}
