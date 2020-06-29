package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlusTwo {

/*    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.*/

    public List plusTwo(int[] a, int[] b) {

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());

        return Arrays.asList(aList.get(0),aList.get(1),bList.get(0),bList.get(1));
    }


}
