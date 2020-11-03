package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TripleUp {

    /*Return true if the array contains,
    somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.*/

    public boolean tripleUp(int[] nums) {

         List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

         if(numsList.size()<3){

             return false;
         }
                                                // the value of the index after i is equal to the value of i plus 1...
        return IntStream.range(0, numsList.size()-2).anyMatch(i-> numsList.get(i+1) == numsList.get(i) +1 && numsList.get(i+2) == numsList.get(i)+2);
                                    //^
        //guard against ArrayIndexOutOfBoundsException since we are looking at groups of three; we will land on the element 3 indexes away from the end

    }//end method


}
