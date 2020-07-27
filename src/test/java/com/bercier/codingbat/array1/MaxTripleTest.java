package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class MaxTripleTest {

    @ParameterizedTest
    @MethodSource("maxTripleDataStream")

    public void shouldReturnTheLargestOfThreeInts(int[] nums, int expectedResult){

        MaxTriple maxTriple = new MaxTriple();

        assertEquals(expectedResult, maxTriple.maxTriple(nums));

    }

    static Stream<Arguments> maxTripleDataStream(){

        return Stream.of(

                arguments(new int[]{1, 2, 3}, 3),
                arguments(new int[]{1, 5, 3}, 5),
                arguments(new int[]{5, 2, 3}, 5),
                arguments(new int[]{1, 2, 3, 1, 1}, 3),
                arguments(new int[]{1, 7, 3, 1, 5}, 5),
                arguments(new int[]{5, 1, 3, 7, 1}, 5),
                arguments(new int[]{5, 1, 7, 3, 7, 8, 1}, 5),
                arguments(new int[]{5, 1, 7, 9, 7, 8, 1}, 9),
                arguments(new int[]{5, 1, 7, 3, 7, 8, 9}, 9),
                arguments(new int[]{2, 2, 5, 1, 1}, 5)

        );

    }

}
