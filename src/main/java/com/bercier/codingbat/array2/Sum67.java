package com.bercier.codingbat.array2;

import java.util.ArrayList;
import java.util.List;

public class Sum67 {

    /*Return the sum of the numbers in the array,
    except ignore sections of numbers starting with a 6
    and extending to the next 7 (every 6 will be followed by at least one 7).
    Return 0 for no numbers.*/

    public int sum67(int[] nums) {

        List excludedIndices = new ArrayList(); //<- List because of it's dynamic growth.

        int sum = 0;

        boolean trackingEI = false; // default to false out because no 6/7's have been found yet.

        for(int i = 0; i < nums.length;i++){

            // if(trackingEI== false && nums[i] == 6){
            if(!trackingEI && nums[i] ==6){

                trackingEI = true;

            }

            if(trackingEI){
                excludedIndices.add(i); // add everything after and including 6 to the List.
            }
            if(nums[i] ==7){ // last index of exludedIndices
                trackingEI =false;
            }
        }//end for:1

        for(int i = 0; i<nums.length; i++){//loop for adding the everything in nums without the EI.
            if(!excludedIndices.contains(i)){
                sum+=nums[i];
            }
        }//end for:2
        return sum;
    }

}
