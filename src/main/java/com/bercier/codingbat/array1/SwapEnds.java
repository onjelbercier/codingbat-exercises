package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SwapEnds {

    public List swapEnds(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Collections.swap(numsList, 0, numsList.size()-1);

        return numsList;
    }


}
