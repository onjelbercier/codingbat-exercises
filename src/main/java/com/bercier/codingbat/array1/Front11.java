package com.bercier.codingbat.array1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Front11 {

    /*Given 2 int arrays, a and b, of any length,
    return a new array with the first element of each array.
    If either array is length 0, ignore that array.*/

    public List front11(int[] a, int[] b){
        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
        if(aList.size() == 0 && bList.size() == 0){
            return new ArrayList(0);
        }
        else if (aList.size() == 0){
            return Arrays.asList(bList.get(0));
        }
        else if(bList.size() == 0){
            return Arrays.asList(aList.get(0));
        }
        else
            return  Arrays.asList(aList.get(0), bList.get(0));
    }
}
