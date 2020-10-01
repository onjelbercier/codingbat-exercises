package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Has77 {

    /*Given an array of ints,
    return true if the array contains two 7's next to each other,
    or there are two 7's separated by one element,
    such as with {7, 1, 7}.*/

    public boolean has77(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
          return IntStream.range(0, numsList.size()).anyMatch(index ->{
              //example [0][7][0][7][5][7]
             if(numsList.get(index) == 7){
                 //let's
                 if(index > 1 && numsList.get(index-2) == 7){
                     return true;
                 }
                 else if(index > 0 && numsList.get(index-1) == 7){
                     return true;
                 }
                 else{
                     return false;
                 }
            }
             else{
                 return false;
             }
        });

    }

}
