package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class More14Test {

    @ParameterizedTest
    @MethodSource("more14DataStream")

    public void shouldReturnTrueIfNumOfOnesIsGreaterThanNumOfFours(int[] nums, boolean expectedResult){

        More14 more14 = new More14();

        assertEquals(expectedResult, more14.more14(nums));

    }

    static Stream<Arguments>more14DataStream(){

        return Stream.of(

                arguments(new int[]{1, 4, 1}, true ),
                arguments(new int[]{1, 4, 1, 4}, false ),
                arguments(new int[]{1, 1}, true ),
                arguments(new int[]{1, 6, 6}, true ),
                arguments(new int[]{1}, true ),
                arguments(new int[]{1, 4}, false ),
                arguments(new int[]{6, 1, 1}, true ),
                arguments(new int[]{1, 6, 4}, false ),
                arguments(new int[]{1, 1, 4, 4, 1}, true ),
                arguments(new int[]{}, false),
                arguments(new int[]{4, 1, 4, 6}, false ),
                arguments(new int[]{4, 1, 4, 6, 1}, false ),
                arguments(new int[]{1, 4, 1, 4, 1, 6}, true )


        );

    }

}
