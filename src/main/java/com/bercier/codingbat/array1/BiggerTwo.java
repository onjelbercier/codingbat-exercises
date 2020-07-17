package com.bercier.codingbat.array1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class BiggerTwo {
    /*
Start with 2 int arrays, a and b, each length 2.
Consider the sum of the values in each array.
Return the array which has the largest sum.
In event of a tie, return a.
     */
    public List biggerTwo(int[] a, int[] b){
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        int sumOfA = listA.stream().reduce(0, Integer:: sum);
        int sumOfB = listB.stream().reduce(0,Integer:: sum); //0 the integer value is the identity
        if (sumOfA >= sumOfB){
            return listA;
        }
        else
            return listB;
    }
}


