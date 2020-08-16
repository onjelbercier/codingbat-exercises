package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Sum28Test {

    @ParameterizedTest
    @MethodSource("sum28DataStream")

    public void shouldReturnTrueIfSumofTwosEqualsEight(int[]nums, boolean expectedResult){

        Sum28 sum28 = new Sum28();

        assertEquals(expectedResult, sum28.sum28(nums));

    }

    static Stream<Arguments>sum28DataStream(){

        return Stream.of(

                arguments(new int[]{2, 3, 2, 2, 4, 2}, true ),
                arguments(new int[]{2, 3, 2, 2, 4, 2, 2}, false ),
                arguments(new int[]{1, 2, 3, 4}, false ),
                arguments(new int[]{2, 2, 2, 2}, true ),
                arguments(new int[]{1, 2, 2, 2, 2, 4}, true ),
                arguments(new int[]{}, false ),
                arguments(new int[]{2}, false ),
                arguments(new int[]{8}, false ),
                arguments(new int[]{2, 2, 2}, false ),
                arguments(new int[]{2, 2, 2, 2, 2}, false ),
                arguments(new int[]{1, 2, 2, 1, 2, 2}, true ),
                arguments(new int[]{5, 2, 2, 2, 4, 2}, true )


        );

    }

}
