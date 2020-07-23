package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SwapEndsTest {

    @ParameterizedTest
    @MethodSource("swapEndsDataStream")

    public void shouldReturnAnArrayWithSwappedEnds(int[] nums, List<Integer> expectedResult){

        SwapEnds swapEnds = new SwapEnds();

        assertEquals(expectedResult, swapEnds.swapEnds(nums));

    }

    static Stream<Arguments> swapEndsDataStream(){

        return Stream.of(arguments(new int[]{1, 2, 3,4}, new ArrayList<Integer>(){
                    {
                        add(4);
                        add(2);
                        add(3);
                        add(1);
                    }
                }),
                arguments(new int[]{8, 6, 7, 9, 5}, new ArrayList<Integer>(){
                    {
                        add(5);
                        add(6);
                        add(7);
                        add(9);
                        add(8);
                    }
                }),
                arguments(new int[]{3, 1, 4, 1, 5, 9}, new ArrayList<Integer>(){
                    {
                        add(9);
                        add(1);
                        add(4);
                        add(1);
                        add(5);
                        add(3);
                    }
                }),
                arguments(new int[]{1, 2}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(1);
                    }
                }),
                arguments(new int[]{1}, new ArrayList<Integer>(){
                    {
                        add(1);

                    }
                })

        );

    }

}
