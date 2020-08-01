package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Make2Test
{

    @ParameterizedTest
    @MethodSource("make2DataStream")

    public void shouldReturnAnArrayContianingElementsFromAAndB(int[] a, int[] b, List<Integer> expectedResult){

        Make2 make2 = new Make2();

        assertEquals(expectedResult, make2.make2(a, b));

    }

    static Stream<Arguments> make2DataStream(){

        return Stream.of(

                arguments(new int[]{4, 5},new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(4);
                        add(5);
                    }
                }),
                arguments(new int[]{4},new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(4);
                        add(1);
                    }
                }),
                arguments(new int[]{},new int[]{1, 2}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                    }
                }),
                arguments(new int[]{1,2},new int[]{}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                    }
                }),
                arguments(new int[]{3},new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(1);
                    }
                }),
                arguments(new int[]{3, 1, 4},new int[]{}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(1);
                    }
                }),
                arguments(new int[]{3},new int[]{1}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(1);
                    }
                }),
                arguments(new int[]{1},new int[]{1}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(1);
                    }
                }),
                arguments(new int[]{1, 2, 3},new int[]{7, 8}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                    }
                }),
                arguments(new int[]{7, 8},new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(7);
                        add(8);
                    }
                }),
                arguments(new int[]{7},new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(7);
                        add(1);
                    }
                }),
                arguments(new int[]{5, 4},new int[]{2, 3, 7}, new ArrayList<Integer>(){
                    {
                        add(5);
                        add(4);
                    }
                })

        );

    }

}
