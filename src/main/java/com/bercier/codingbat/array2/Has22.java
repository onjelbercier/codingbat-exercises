package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Has22 {

    /*Given an array of ints,
    return true if the array contains a 2 next to a 2 somewhere.*/

    public boolean has22(int[] nums) {
        // int i=0;
        // i++;
        // int i2=0;
        // i++;
        // if(i == 2&& i2 == 2){
        // return true;
        // }
        // return false;

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        final int[] previousValue = new int[1]; // stream has no state, so we need a final field to store it

        //stop at the first pair of 2's
        return numsList.stream().anyMatch(num -> {
            if(num==2 && previousValue[0]==2){
                return true;
            }
            else{
                previousValue[0]=num;
                return false;
            }
        });

        /*for(int i = 0; i < numsList.size()-1; i++)
        {
            if(numsList.get(i) == 2 && numsList.get(i + 1) == 2)
                return true;
        }
        return false;*/
    }

}
