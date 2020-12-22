package com.bercier.codingbat.array2;

import com.bercier.codingbal.array2.utils.Comparators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WithoutTen {

    /*Return a version of the given array where all the 10's have been removed.
    The remaining elements should shift left towards the start of the array as needed,
    and the empty spaces a the end of the array should be 0.
    So {1, 10, 10, 2} yields {1, 2, 0, 0}.
    You may modify and return the given array or make a new array.*/


    public List withoutTen(int[] nums) {

        List<Integer>numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return numsList.stream().map(i-> {
            if(i == 10) {
                return 0;
            }
            else return i;
        }

        ).sorted(Comparators::compareIntegersZeroGreaterThanAny).collect(Collectors.toList());


    }
}