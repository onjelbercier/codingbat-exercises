package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MiddleWayTest {

    @ParameterizedTest
    @MethodSource("middleWayDataStream")

    public void middleWayTest(int[] a, int[] b, List<Integer> expectedResult){

        MiddleWay middleWay = new MiddleWay();

        assertEquals(expectedResult, middleWay.middleWay(a, b));
    }

    static Stream<Arguments> middleWayDataStream(){

       return Stream.of(

               arguments(new int[]{1, 2, 3},new int[]{4, 5, 6}, new ArrayList<Integer>(){
                   {
                       add(2);
                       add(5);
                   }
               }),
               arguments(new int[]{7, 7, 7},new int[]{3, 8, 0}, new ArrayList<Integer>(){
                   {
                       add(7);
                       add(8);
                   }
               }),
               arguments(new int[]{5, 2, 9},new int[]{1, 4, 5}, new ArrayList<Integer>(){
                   {
                       add(2);
                       add(4);
                   }
               }),
               arguments(new int[]{1, 9, 7},new int[]{4, 8, 8}, new ArrayList<Integer>(){
                   {
                       add(9);
                       add(8);
                   }
               }),
               arguments(new int[]{1, 2, 3},new int[]{3, 1, 4}, new ArrayList<Integer>(){
                   {
                       add(2);
                       add(1);
                   }
               }),
               arguments(new int[]{1, 2, 3},new int[]{4, 1, 1}, new ArrayList<Integer>(){
                   {
                       add(2);
                       add(1);
                   }
               })

        );
    }
}
