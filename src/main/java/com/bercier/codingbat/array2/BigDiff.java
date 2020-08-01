package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BigDiff {

    /*Given an array length 1 or more of ints,
    return the difference between the largest
    and smallest values in the array.
    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
    methods return the smaller or larger of two values.*/

    public int bigDiff(int[] nums) {

        List<Integer>numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return Collections.max(numsList) - Collections.min(numsList);

    }

}
