package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MakeEndsTest {

    @ParameterizedTest
    @MethodSource("makeEndsDataStream")

    public void shouldReturnAnArrayOfFirstAndLasyInts(int[] nums, List<Integer> expectedResult){

        MakeEnds makeEnds = new MakeEnds();

        assertEquals(expectedResult, makeEnds.makeEnds(nums));

    }

    static Stream<Arguments> makeEndsDataStream(){

        return Stream.of(

                arguments(new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(3);
                    }
                }),
                arguments(new int[]{1, 2, 3, 4}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(4);
                    }
                }),
                arguments(new int[]{7, 4, 6, 2}, new ArrayList<Integer>(){
                    {
                        add(7);
                        add(2);
                    }
                }),
                arguments(new int[]{1, 2, 2, 2, 2, 2, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(3);
                    }
                }),
                arguments(new int[]{7, 4}, new ArrayList<Integer>(){
                    {
                        add(7);
                        add(4);
                    }
                }),
                arguments(new int[]{7}, new ArrayList<Integer>(){
                    {
                        add(7);
                        add(7);
                    }
                }),
                arguments(new int[]{5, 2, 9}, new ArrayList<Integer>(){
                    {
                        add(5);
                        add(9);
                    }
                }),
                arguments(new int[]{2, 3, 4, 1}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(1);
                    }
                })

        );
    }

}
