package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Reverse3Test {

    @ParameterizedTest
    @MethodSource("reverse3DataStream")
    public void shouldRotateElementsToTheLeft(int[] nums, List<Integer> expectedResult){
        Reverse3 reverse3 = new Reverse3();
        assertEquals(expectedResult, reverse3.reverse3(nums));
    }
    static Stream<Arguments> reverse3DataStream(){
        return Stream.of(
                arguments(new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(2);
                        add(1);
                    }
                }),
                arguments(new int[]{5,11, 9}, new ArrayList<Integer>(){
                    {
                        add(9);
                        add(11);
                        add(5);
                    }
                }),
                arguments(new int[]{7, 0, 0}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(7);
                    }
                }),
                arguments(new int[]{2, 1, 2}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(1);
                        add(2);
                    }
                }),
                arguments(new int[]{1, 2, 1}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                        add(1);
                    }
                }),
                arguments(new int[]{2, 11, 3}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(11);
                        add(2);
                    }
                }),arguments(new int[]{0, 6, 5}, new ArrayList<Integer>(){
                    {
                        add(5);
                        add(6);
                        add(0);
                    }
                }),arguments(new int[]{7, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(2);
                        add(7);
                    }
                })
        );
    }

}
