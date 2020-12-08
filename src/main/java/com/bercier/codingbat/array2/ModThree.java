package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModThree {

    /*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.*/

    public boolean modThree(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        System.out.println("Using reverse order iteration and using even as default test");
        System.out.println("------------ numsList ="+numsList+"---------------");
        return IntStream.range(0, numsList.size())
                .map(i -> 0 +(numsList.size() -1 -i))
                .anyMatch(index -> {
                    System.out.println("\t********** iteration ="+index+"***************");
                    if(index >= 2){
                        System.out.println("\t********** index>=2 ="+index+"***************");
                        System.out.println("\tvalue n ="+numsList.get(index));
                        System.out.println("\tn ="+((numsList.get(index)%2)==0));
                        System.out.println("\tvalue n-1 ="+numsList.get(index-1));
                        System.out.println("\tn-1 ="+((numsList.get(index-1)%2)==0));
                        System.out.println("\tvalue n-2 ="+numsList.get(index-2));
                        System.out.println("\tn-2 ="+((numsList.get(index-2)%2)==0));
                    }
                    System.out.println("---------------------------------------");
                    return index < 2?false: ( ( ((numsList.get(index)%2)==0) == ((numsList.get(index-1)%2)==0) ) && ( ((2%numsList.get(index-1)%2)==0) == ((2%numsList.get(index-2)%2)==0) ) );} );
    }//end method


}
