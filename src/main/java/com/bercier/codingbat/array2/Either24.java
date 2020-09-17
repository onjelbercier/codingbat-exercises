package com.bercier.codingbat.array2;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Either24 {
    /*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
     */
    public boolean either24(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int[] previousValueHolder = new int[1];
        /*Function<Long,Boolean> evaluateCount = num  -> {
            boolean flag;
            switch (num.intValue()) {
                case 0: flag = false;
                    break;
                case 1: flag = true;
                    break;
                default: flag =false;
            }
            return flag;
        };*/
         /*
        In this approach we:
            1. pass through all numbers that are part of a pair of 2's or pair of 4's as currentValue
            2. turned every number that not's part of a pair of 2's or 4's into a -1 in the resultant list
                a. The purpose is to get to a normalized list of numbers that we can interpret into
                    one of the 3 desired outcomes
            4. remove all -1's; they are not needed
            6. take a count of how many records are in the resulting stream
            5. The outcomes will be:
                a. 0 which means there were no pairs of 2's or pairs of 4's
                b. 1 which means there were at least one pair of 2's and not pairs of 4's or vice versa
                c. greater than 1 which means that there were:
                    i. pairs of 2's and pair's of 4's
                    ii. no pairs of 2's or pairs of 4's
            This is where we apply logic to the resultant count (in the evaluateCount function):
                if the element count is 0 return false; no 2's or 4's
                if the element count is 1 return true; either 2's or 4's
                if the element count is anything else then return false because we know that we had:
                    1. pairs of 2's and 4's
         */
/*        return evaluateCount.apply(numsList.stream().map(num -> {
            int currentValue = ((num==2 && previousValueHolder[0]==2) || (previousValueHolder[0]==4 && num==4))?num:-1;
            previousValueHolder[0] = num;
            return currentValue;
        }).filter(num2 -> num2!=-1).distinct().count());*/
        Function<Integer,Boolean> evaluateSum = num  -> {
            boolean flag;
            switch (num.intValue()) {
                case 2: flag = true;
                    break;
                case 4: flag = true;
                    break;
                default: flag =false;
            }
            return flag;
        };
        /*
        In this approach we:
            1. turned every pair of 2's into a single 2 in the resultant list
            2. turned every paif of 4's into a single 4 in the resultant list
            3. turned every other pair into 0 in the resultant list
            4. executed a distinct to removed duplicates or each number so we end up with a single 2, 4 and 0
                if they are individually present
            This is where we apply logic to the resultant sum:
                if the total is 2 then we know we only had pairs of 2's and no pairs of 4's
                if the total is 4 then we know we only had pairs of 4's and no pairs of 2's
                if the total is anything else then we know that we had:
                    1. pairs of 2's and 4's
                    2. no pairs of 2's or 4's
         */
        return evaluateSum.apply(numsList.stream().map(num -> {
            int currentValue = (num==2 && previousValueHolder[0]==2)?2:(previousValueHolder[0]==4 && num==4)?4:0;
            previousValueHolder[0] = num;
            return currentValue;
        }).distinct().reduce(0,Integer::sum));
    }
}