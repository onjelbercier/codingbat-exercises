package com.bercier.codingbat.array2;

import com.bercier.codingbal.array2.utils.Comparators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import static java.util.Collections.swap;

public class ZeroFront {

    /*Return an array that contains the exact same numbers as the given array,
    but rearranged so that all the zeros are grouped at the start of the array.
    The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
    You may modify and return the given array or make a new array.*/


    public List zeroFront(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        numsList.sort(Comparators::compareIntegersZeroLessThanAny);

        return numsList;

    }//end method


}
