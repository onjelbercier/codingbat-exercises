package com.bercier.codingbat.array2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class IsEverywhere {
    /*We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
     */
    public boolean isEverywhere(int[] nums, int val){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int[] previousValueHolder = new int[]{val};
        return numsList.stream().filter(currentValue -> {
            boolean insideThisPair = previousValueHolder[0]==val || currentValue==val;
            previousValueHolder[0] = currentValue;
            return insideThisPair;
        }).count() == numsList.size();
    }
}