package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No23 {

    /*Given an int array length 2, return true if it does not contain a 2 or 3.*/

    public boolean no23(int[] nums) {

        List<Integer>numsList= Arrays.stream(nums).boxed().collect(Collectors.toList());

        if(numsList.get(0) !=2 && numsList.get(0) !=3 && numsList.get(1)!=2 && numsList.get(1)!=3){
            return true;

        }else{
            return false;
        }

    }


}
