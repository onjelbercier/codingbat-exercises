package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Unlucky1 {

    /*We'll say that a 1 immediately followed
    by a 3 in an array is an "unlucky" 1.
    Return true if the given array contains an
    unlucky 1 in the first 2 or last 2 positions in the array.*/

    public boolean unlucky1(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());


            if (numsList.size() == 0 || numsList.size() == 1) {

                return false;
            }

            if (numsList.get(0) == 1 && numsList.get(1) == 3) {

                return true;
            }


            if (numsList.get(1) == 1 && numsList.get(2) == 3) {

                return true;
            }

            if (numsList.get(numsList.size() - 2) == 1 && numsList.get(numsList.size() - 1) == 3) {

                return true;
            }
            return false;
        }

}
