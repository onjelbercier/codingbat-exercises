package com.bercier.codingbat.array2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZeroMax {

    /*Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
    If there is no odd value to the right of the zero,
    leave the zero as a zero.*/

    public List<Integer> zeroMax(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());



        return IntStream.range(0, numsList.size()).map(i-> {

           if(numsList.get(i) == 0) { // if i is a zero

               return numsList.subList(i,numsList.size()).stream() // create a sublist after each zero
                       .filter(subI ->(subI % 2 != 0 )) // and filter out all of the odd values
                       .max(Integer::compare).orElse(0); // then compare them and return the largest, or if there arre none, return i: 0

           }

           return numsList.get(i);

        }).boxed().collect(Collectors.toList());

    }


}
