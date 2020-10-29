package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SameEnds {

    /*Return true if the group of N numbers at the start and end of the array are the same.
    For example, with {5, 6, 45, 99, 13, 5, 6},
    the ends are the same for n=0 and n=2, and false for n=1 and n=3.
    You may assume that n is in the range 0..nums.length inclusive.*/

    public boolean sameEnds(int[] nums, int len) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return !IntStream.range(0,len).anyMatch(
                i-> numsList.get(i) != numsList.get(numsList.size()-(len-i))
        );

    }


}
