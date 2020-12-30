package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ZeroMaxTest {

    @ParameterizedTest
    @MethodSource("zeroMaxTestDataStream")

    public void shouldReturnAnArrayWhereEachZeroValueIsReplacedByTheLargestOddValueToTheRight(int[] nums, List<Integer> expectedResult){

        ZeroMax zeroMax = new ZeroMax();

        assertEquals(expectedResult, zeroMax.zeroMax(nums));

    }

    static Stream<Arguments>zeroMaxTestDataStream(){

        return Stream.of(

            arguments(new int[]{0, 5, 0, 3}, List.of(5, 5, 3, 3)),
            arguments(new int[]{0, 4, 0, 3}, List.of(3, 4, 3, 3)),
            arguments(new int[]{0, 1, 0}, List.of(1, 1, 0)),
            arguments(new int[]{0, 1, 5}, List.of(5, 1, 5)),
            arguments(new int[]{0, 2, 0}, List.of(0, 2, 0)),
            arguments(new int[]{1}, List.of(1)),
            arguments(new int[]{0}, List.of(0)),
            arguments(new int[]{}, List.of()),
            arguments(new int[]{7, 0, 4, 3, 0, 2}, List.of(7, 3, 4, 3, 0, 2)),
            arguments(new int[]{7, 0, 4, 3, 0, 1}, List.of(7, 3, 4, 3, 1, 1)),
            arguments(new int[]{7, 0, 4, 3, 0, 0}, List.of(7, 3, 4, 3, 0, 0)),
            arguments(new int[]{7, 0, 1, 0, 0, 7}, List.of(7, 7, 1, 7, 7, 7))

        );

    }

}
