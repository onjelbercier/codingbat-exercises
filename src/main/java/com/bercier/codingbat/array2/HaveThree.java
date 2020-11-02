package com.bercier.codingbat.array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HaveThree {

    /*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.*/
    public boolean haveThree(int[] nums) {

        List<Integer> numsList= Arrays.stream(nums).boxed().collect(Collectors.toList());

        //exit case 1; you need at least 5 elements to create the pattern of 3's required
        if(numsList.size() ==1){
             if(numsList.get(0) ==3){
                 return false;
             }
             else{
                 return true;
             }
        }

        /*
        if we have less than 3 or more than 3 3's then it's a fail
         */
        if(numsList.stream().filter(i -> i==3).count()!=3){
            return false;
        }
        /*
        here we deal with any consecutive threes and fail
         */
        if (IntStream.range(0, numsList.size())
                .anyMatch(index -> {

                    if(index < numsList.size()-1 && numsList.get(index)==3 && numsList.get(index+1)==3){
                        return true;
                    }
                    return false;
                })){
            return false;
        }

        /*
        filter list and remove any two or more zeros next to each other
        so that no pair of 3's have more than one integer between them
        so 3,0,0,3,0,0,0,3 becomes 3,0,3,0,3
         */
        List<Integer> numsListNonThreesAreZeros = IntStream.range(0, numsList.size())
                                    .map(i -> numsList.get(i)==3?3:0)
                                    .boxed().collect(Collectors.toList());

        List<Integer> numsListRemovingDuplicateZerosByGroup = IntStream.range(0, numsListNonThreesAreZeros.size())
                .map(i -> {
                    return (i < numsListNonThreesAreZeros.size() - 1 && numsListNonThreesAreZeros.get(i) !=3 && numsListNonThreesAreZeros.get(i).equals(numsListNonThreesAreZeros.get(i + 1))?-1:numsListNonThreesAreZeros.get(i));})
                .filter(i -> i != -1)
                .boxed().collect(Collectors.toList());

        /*
        1. With all the previous filters in place, if we make it this far, then there is either one pattern match or none
         */
        return IntStream.range(0, numsListRemovingDuplicateZerosByGroup.size())
                .anyMatch(index -> {

                    return numsListRemovingDuplicateZerosByGroup.size() >= 5 && index < numsListRemovingDuplicateZerosByGroup.size()-4 &&
                            (  (numsListRemovingDuplicateZerosByGroup.get(index)==3) && (numsListRemovingDuplicateZerosByGroup.get(index+1)!=3) &&(numsListRemovingDuplicateZerosByGroup.get(index+2)==3) && (numsListRemovingDuplicateZerosByGroup.get(index+3)!=3) && (numsListRemovingDuplicateZerosByGroup.get(index+4)==3));
                });
    }

}
