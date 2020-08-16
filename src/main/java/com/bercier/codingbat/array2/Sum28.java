package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sum28 {

    /*Given an array of ints,
    return true if the sum of all the 2's in the array is exactly 8.*/

    public boolean sum28(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

//        return numsList.stream().filter(num -> num == 2).count() == 4;

          return numsList.stream().filter(num -> num == 2).reduce(0, Integer::sum) == 8;

    }


}
