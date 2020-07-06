package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Double23Test {

@ParameterizedTest
@MethodSource("double23DataStream")

    public void shouldReturnTrueIfArrayContainsDoubleTwosOrThrees(int[] nums, boolean expectedResult){

    Double23 double23 = new Double23();

    assertEquals(expectedResult, double23.double23(nums));

}

    static Stream<Arguments>double23DataStream(){

    return Stream.of(

            arguments(new int[]{2, 2}, true),
            arguments(new int[]{3, 3}, true),
            arguments(new int[]{2, 3}, false),
            arguments(new int[]{3, 2}, false),
            arguments(new int[]{4, 5}, false),
            arguments(new int[]{2}, false),
            arguments(new int[]{3}, false),
            arguments(new int[]{}, false),
            arguments(new int[]{3,4}, false)

    );

    }

}
