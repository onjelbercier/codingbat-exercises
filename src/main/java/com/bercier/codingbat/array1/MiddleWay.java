package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiddleWay {

    public List middleWay(int[] a, int[] b) {


        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());

        return Arrays.asList(aList.get(1),bList.get(1));
    }

}
