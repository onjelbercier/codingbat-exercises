package com.bercier.codingbat.array1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Start1 {

    /*Start with 2 int arrays, a and b, of any length.
    Return how many of the arrays have 1 as their first element.*/

    public long start1(int[] a, int[] b) {

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());

        final long findingOneA = aList.stream().filter(num -> num==1&&aList.size()>0).count();

        final long findingOneB = bList.stream().filter(num -> num==1&&bList.size()>0).count();

        return findingOneA + findingOneB;
    }

}
