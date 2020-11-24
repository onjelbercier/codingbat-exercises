package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Post4 {

    /*Given a non-empty array of ints,
    return a new array containing the elements from the original array that come after the last 4 in the original array.
    The original array will contain at least one 4.
    Note that it is valid in java to create an array of length 0.*/

    public List<Integer> post4(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return numsList.subList(numsList.lastIndexOf(4) +1, numsList.size());

    }// end method

// 	ArrayList<Integer> numbersAfterFour = new ArrayList<Integer>();

//   for(int index =0; index < nums.length; index++){

//     if(nums[index-1] == 4 && nums[index]!=4){

//       numbersAfterFour.add(index);

//     }//end if

//   }//end for

//   return numbersAfterFour;

// }//end method


}
