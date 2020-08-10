package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CenteredAverage {

    /*Return the "centered" average of an array of ints,
    which we'll say is the mean average of the values,
    except ignoring the largest and smallest values in the array.
    If there are multiple copies of the smallest value,
    ignore just one copy, and likewise for the largest value.
    Use int division to produce the final average.
    You may assume that the array is length 3 or more.*/

    public int centeredAverage(int[] nums) {

        List<Integer> numsList= Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());


        //end sorting


    /*
      because the instructions says that we should ignore the first and last value
      if they're not duplicated but also say ignore one of the duplicates if there
      is duplication then the sum of that logic is that we should ALWAYS "ignore"
      the first and last elements regardless. And because these are integers
      then "ignoring" means setting the value to zero which is the additive
      identity effective removing it from the sum.
    */
        int sum = numsList.stream().reduce(0, Integer::sum);


    /*because we are removing 2 elements ALWAYS we must adjust the count
      by 2 in the mean-average equation mean = sum / numOfElements
    */
        return (sum-numsList.get(0)-numsList.get(numsList.size()-1))/(numsList.size()-2);


    }

}
