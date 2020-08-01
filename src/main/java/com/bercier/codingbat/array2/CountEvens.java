package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountEvens {

    /*Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder,
    e.g. 5 % 2 is 1.*/

    public int countEvens(int[] nums) {

        List<Integer> numsList= Arrays.stream(nums).boxed().collect(Collectors.toList());

        return (int)numsList.stream().filter(num -> num % 2 == 0).count();

    }

}
