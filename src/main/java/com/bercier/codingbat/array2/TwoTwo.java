package com.bercier.codingbat.array2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class TwoTwo {
    public boolean twoTwo(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return numsList.stream().anyMatch(i-> i < numsList.size() - 1 && numsList.get(i) == 2 && numsList.get(i + 1) != 2);
    }
}