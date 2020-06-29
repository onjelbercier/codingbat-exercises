package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Sum3Test {

    @ParameterizedTest
    @MethodSource("sumThreeStream")
    public void shouldReturnSumOfThreeElements(int[]nums, int expectedResult){

        Sum3 sum3 = new Sum3();

        assertEquals(expectedResult,sum3.sum3(nums));

    }

    static Stream<Arguments> sumThreeStream(){

        return Stream.of(
                arguments(new int[]{1,2,3}, 6),
                arguments(new int[]{5, 11, 2}, 18),
                arguments(new int[]{7, 0, 0}, 7),
                arguments(new int[]{1, 1, 1}, 3),
                arguments(new int[]{2, 7, 2}, 11)
        );
    }

}
