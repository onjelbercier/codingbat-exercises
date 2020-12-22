package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class WithoutTenTest {

    @ParameterizedTest
    @MethodSource("WithoutTenDataStream")

    public void shouldReturnAVersionOfTheGivenArrayWhereAllTensHaveBeenRemovedAndEveryOtherNumberHaveShiftedLeft(int[] nums, List<Integer> expectedResult){

        WithoutTen withoutTen = new WithoutTen();

        assertEquals(expectedResult, withoutTen.withoutTen(nums));

    }

    static Stream<Arguments> WithoutTenDataStream(){

        return Stream.of(

                arguments(new int[] {1, 10, 10, 2}, List.of(1, 2, 0, 0)),
                arguments(new int[] {10, 2, 10}, List.of(2, 0, 0)),
                arguments(new int[] {1, 99, 10}, List.of(1, 99, 0)),
                arguments(new int[] {10, 13, 10, 14}, List.of(13, 14, 0, 0)),
                arguments(new int[] {10, 13, 10, 14, 10}, List.of(13, 14, 0, 0, 0)),
                arguments(new int[] {10, 10, 3}, List.of(3, 0, 0)),
                arguments(new int[] {1}, List.of(1)),
                arguments(new int[] {13, 1}, List.of(13, 1)),
                arguments(new int[] {10}, List.of(0)),
                arguments(new int[] {}, List.of())

        );

    }

}