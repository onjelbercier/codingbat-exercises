package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lucky13 {

    /*Given an array of ints,
    return true if the array contains no 1's and no 3's.*/

    public boolean lucky13(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return !(numsList.stream().filter(num -> num ==1 || num ==3).count() > 0);
    }


}
