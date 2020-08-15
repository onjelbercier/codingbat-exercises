package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Lucky13Test {

    @ParameterizedTest
    @MethodSource("lucky13DataStream")

    public void shouldReturnTrueIfArrayHasNoOnesOrThrees(int[] nums, boolean expectedResult){

        Lucky13 lucky13 = new Lucky13();

        assertEquals(expectedResult, lucky13.lucky13(nums));

    }

    static Stream<Arguments>lucky13DataStream(){

        return Stream.of(


                arguments(new int[]{0, 2, 4}, true ),
                arguments(new int[]{1, 2, 3}, false ),
                arguments(new int[]{1, 2, 4}, false ),
                arguments(new int[]{2, 7, 2, 8}, true ),
                arguments(new int[]{2, 7, 1, 8}, false ),
                arguments(new int[]{3, 7, 2, 8}, false ),
                arguments(new int[]{2, 7, 2, 1}, false ),
                arguments(new int[]{1, 2}, false ),
                arguments(new int[]{2, 2}, true ),
                arguments(new int[]{2}, true),
                arguments(new int[]{3}, false ),
                arguments(new int[]{}, true )


        );

    }

}
