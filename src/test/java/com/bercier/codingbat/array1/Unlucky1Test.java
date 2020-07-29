package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Unlucky1Test {

    @ParameterizedTest
    @MethodSource("unlucky1DataStream")

    public void shouldReturnABooleanForOnesFollowedByThrees(int[]nums, boolean expectedResult){

        Unlucky1 unlucky1 = new Unlucky1();

        assertEquals(expectedResult, unlucky1.unlucky1(nums));

    }

    static Stream<Arguments>unlucky1DataStream(){

        return Stream.of(

                arguments(new int[]{1, 3, 4, 5}, true),
                arguments(new int[]{2, 1, 3, 4, 5}, true),
                arguments(new int[]{1, 1, 1}, false),
                arguments(new int[]{1, 3, 1}, true),
                arguments(new int[]{1, 1, 3}, true),
                arguments(new int[]{1, 2, 3}, false),
                arguments(new int[]{3, 3, 3}, false),
                arguments(new int[]{1, 3}, true),
                arguments(new int[]{1, 4}, false),
                arguments(new int[]{1}, false),
                arguments(new int[]{}, false),
                arguments(new int[]{1, 1, 1, 3, 1}, false),
                arguments(new int[]{1, 1, 3, 1, 1}, true),
                arguments(new int[]{1, 4, 1, 5}, false),
                arguments(new int[]{1, 1, 2, 3}, false),
                arguments(new int[]{2, 3, 2, 1}, false),
                arguments(new int[]{2, 3, 1, 3}, true),
                arguments(new int[]{1, 2, 3, 4, 1, 3}, true)


        );

    }

}
