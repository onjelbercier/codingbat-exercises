package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonEnd {

    public boolean commonEnd(int[] a, int[] b) {
        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());

        return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);


    }
}
