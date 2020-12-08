package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ZeroFrontTest {

    @ParameterizedTest
    @MethodSource("zeroFrontDataStream")

    public void shouldReturnANewArrayInWhichAllZerosAreGroupedAtTheBeginning(int[] nums, List<Integer> expectedResult){

        ZeroFront zeroFront = new ZeroFront();

        assertEquals(expectedResult, zeroFront.zeroFront(nums));

    }

    static Stream<Arguments>zeroFrontDataStream(){

        return Stream.of(

                arguments(new int[]{1, 0, 0, 1}, List.of(0, 0, 1, 1)),
                arguments(new int[]{0, 1, 1, 0, 1}, List.of(0, 0, 1, 1, 1)),
                arguments(new int[]{1, 0}, List.of(0, 1)),
                arguments(new int[]{0, 1}, List.of(0, 1)),
                arguments(new int[]{1, 1, 1, 0}, List.of(0, 1, 1, 1)),
                arguments(new int[]{2, 2, 2, 2}, List.of(2, 2, 2, 2)),
                arguments(new int[]{0, 0, 1, 0}, List.of(0, 0, 0, 1)),
                arguments(new int[]{-1, 0, 0, -1, 0}, List.of(0, 0, 0, -1, -1)),
                arguments(new int[]{0, -3, 0, -3}, List.of(0, 0, -3, -3)),
                arguments(new int[]{}, List.of()),
                arguments(new int[]{9, 9, 0, 9, 0, 9}, List.of(0, 0, 9, 9, 9, 9))

        );

    }

}
