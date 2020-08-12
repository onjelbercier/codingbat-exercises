package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum13 {

    /*Return the sum of the numbers in the array,
    returning 0 for an empty array. Except the number 13 is very unlucky,
    so it does not count and numbers that come immediately after a 13 also do not count.*/

    public int sum13(int[] nums) {

        List<Integer> numsList= Arrays.stream(nums).boxed().collect(Collectors.toList());
            // red mark here^


        if(numsList.size()==0)
            return 0;

        int sum = 0;

        for(int i =0;i<numsList.size(); i++){
            // red mark here^

            if(numsList.get(i)==13){
                if(i+1 >= numsList.size())
                    break;
                i=i+1;
      // and here ^

            }
            else{
                sum += numsList.get(i);
            }

        }//end for

        return sum;
    }// end method


}



