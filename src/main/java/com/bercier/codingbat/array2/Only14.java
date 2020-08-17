package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Only14 {

    /*Given an array of ints, return true if every element is a 1 or a 4.*/

    public boolean only14(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return !(numsList.stream().filter(num-> num !=1 && num !=4).count() >0);

    }

}
