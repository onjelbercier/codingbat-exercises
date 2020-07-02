package com.bercier.codingbat.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class MakeLast {

    /*Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0.
    The original array will be length 1 or more. Note: by default, a new int array contains all 0's.*/

    public List makeLast(int[] nums) {

        List<Integer>numsList= Arrays.stream(nums).boxed().collect(Collectors.toList());

        int doubleSizeOfTheArray = numsList.size()*2; // create an int variable to hold the size of the array.

        int lastElementOfNumsList = numsList.get(nums.length-1); // holding the last element in a variable "3"

        /*Collections.nCopies() is to return an immutable list which contains n copies of given object.
         */

        List<Integer>doubleSizeList = new ArrayList<Integer>(Collections.nCopies(doubleSizeOfTheArray, 0));

        int lastElementOfDoubleSizeList = doubleSizeList.get(doubleSizeList.size()-1); // assign a variable to the las element of the new list

        //use set method to replace the lastElementOfList with a lastElementOfArray
        doubleSizeList.set(doubleSizeList.size()-1, lastElementOfNumsList);//so 0,0,0,0,0,0 is now 0,0,0,0,0,3

        //    doubleSizeList.set(lastElementOfDoubleSizeList, doubleSizeList.get(0));
        return doubleSizeList;

    }

}
