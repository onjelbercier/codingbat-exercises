package com.bercier.codingbat.array1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PlusTwoTest {

    @ParameterizedTest

    @MethodSource("plusTwoDataStream")

    public void plusTwoTest(int[] a, int[] b, List<Integer> expectedResult){

        PlusTwo plusTwo = new PlusTwo();
        assertEquals(expectedResult,plusTwo.plusTwo(a, b));
    }

    static Stream<Arguments> plusTwoDataStream(){

        return Stream.of(

                arguments(new int[]{1, 2},new int[]{4, 5}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                        add(4);
                        add(5);
                    }
                }),
                arguments(new int[]{4, 4},new int[]{2, 2}, new ArrayList<Integer>(){
                    {
                        add(4);
                        add(4);
                        add(2);
                        add(2);
                    }
                }),
                arguments(new int[]{9, 2},new int[]{3, 4}, new ArrayList<Integer>(){
                    {
                        add(9);
                        add(2);
                        add(3);
                        add(4);
                    }
                })
        );

    }

}
