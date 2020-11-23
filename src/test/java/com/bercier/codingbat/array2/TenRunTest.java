package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TenRunTest {

    @ParameterizedTest
    @MethodSource("TenRunTestDataStream")

    public void shouldReturnAnArrayWhereAllValuesHaveBeenChangedThatFollowAMultipleOfTenToThatMultiple(int[] nums, List<Integer> expectedResult){

        TenRun tenRun = new TenRun();

        assertEquals(expectedResult, tenRun.tenRun(nums));

    }

    static Stream<Arguments>TenRunTestDataStream(){

        return Stream.of(

                arguments(new int[] {2, 10, 3, 4, 20, 5}, List.of(2, 10, 10, 10, 20, 20)),
                arguments(new int[] {10, 1, 20, 2}, List.of(10, 10, 20, 20)),
                arguments(new int[] {10, 1, 9, 20}, List.of(10, 10, 10, 20)),
                arguments(new int[] {1, 2, 50, 1}, List.of(1, 2, 50, 50)),
                arguments(new int[] {1, 20, 50, 1}, List.of(1, 20, 50, 50)),
                arguments(new int[] {10, 10}, List.of(10, 10)),
                arguments(new int[] {10, 2}, List.of(10, 10)),
                arguments(new int[] {0, 2}, List.of(0, 0)),
                arguments(new int[] {1, 2}, List.of(1, 2)),
                arguments(new int[] {1}, List.of(1)),
                arguments(new int[] {}, List.of())

        );

    }

}
