package com.bercier.codingbat.array1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class RotateLeft3 {
    /*Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     */
    public List rotateLeft3(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return Arrays.asList(numsList.get(1),numsList.get(2),numsList.get(0));
    }
}