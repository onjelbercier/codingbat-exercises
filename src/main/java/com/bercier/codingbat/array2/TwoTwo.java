package com.bercier.codingbat.array2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class TwoTwo {
    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.
     */
    public boolean twoTwo(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        /*
        Approach: look for fail cases
                Scenario 1: Empty listt reurns true
                Scenario 2: List.size == 1, returns true if not two. false else
                Scenario 3: Normal List 2 or more elements. If element(0) don't look back if element(n) dont look forward.
                                else
                                    if elem(i) == 2
                                        if elem(i+1)!= 2
                                            if elem(i-1)!=2 return true
         */
        return numsList.size()==0?true: //Empty list returns true
                numsList.size()==1?!(numsList.get(0) == 2): //List.size == 1, returns true if not two. false else
                        //   numsList.size()==2?(numsList.get(0) == 2 && numsList.get(1) == 2):
                        !(IntStream.range(0,numsList.size())
                                .filter(i -> {
                                    if(numsList.get(i) != 2){
                                        return false;
                                    }
                                    if(i == numsList.size()-1){
                                        if ((numsList.get(i - 1) != 2))
                                            return true;
                                    }
                                    else if ((numsList.get(i) == 2)&& (i==0 || (i > 0 && numsList.get(i - 1) != 2))) {
                                        if ((numsList.get(i + 1) != 2))
                                            return true;
                                    }
                                    return false;
                                }).count()>0);
    }
}
       /* boolean isTwoNextToTwo = numsList.stream().anyMatch(i -> {
            if (i == 2)
                if (i < numsList.size() - 1 && i +1 != 2) {
                    if (i > 0 && i - 1 != 2)
                        return false;
            }
            else if (i > 0 && i == numsList.size() - 1) {
                if (i - 1 != 2)
                    return false;
            }
            else if (numsList.size() == 1)
                return false;
            return true;
        });
        return isTwoNextToTwo;
       }
        */
// return numsList.stream().anyMatch(i-> i< numsList.size()-1 && ((numsList.get(i)==2 && numsList.get(i+1)==2)) ?true:false);
//return numsList.stream().anyMatch(i-> i< numsList.size()-1 && numsList.get(i)==2 && numsList.get(i+1)==2?true:false);