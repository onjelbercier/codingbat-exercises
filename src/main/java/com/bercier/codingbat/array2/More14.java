package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class More14 {

    /*Given an array of ints,
    return true if the number of 1's is greater than the number of 4's*/

    public boolean more14(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

      return numsList.stream().filter(num -> num == 1).count() > numsList.stream().filter(num -> num == 4).count();

    }

}
