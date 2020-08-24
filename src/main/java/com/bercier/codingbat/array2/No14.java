package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class No14 {

       /*Given an array of ints,
    return true if it contains no 1's or it contains no 4's.*/

    public boolean no14(int[] nums) {

        List<Integer> numsList= Arrays.stream(nums).boxed().collect(Collectors.toList());

        Function<Long,Boolean> evaluateCount = num  -> {
            boolean flag;

            switch (num.intValue()) {
                case 0: flag = true;
                    break;
                case 1: flag = true;
                    break;
                default: flag =false;
            }

            return flag;
        };

        return evaluateCount.apply(numsList.stream().map(num -> num==1 || num==4?num:-1).filter(num2 -> num2!=-1).distinct().count());

        /*boolean anyOnes = false;
        boolean anyFours = false;

        for (Integer integer : numsList) {

            if (integer == 1) {
                anyOnes = true;
            }

            if (integer == 4) {
                anyFours = true;
            }

        }//end for

        return !(anyOnes && anyFours);*/

    }//end method

}
