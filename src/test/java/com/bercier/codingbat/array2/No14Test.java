package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class No14Test {

@ParameterizedTest
    @MethodSource("no14DataStream")

    public void shouldReturnTrueIfThereAreNoOnesInTheArray(int[] nums, boolean expectedResult){

    No14 no14 = new No14();

    assertEquals(expectedResult, no14.no14(nums));

}

    static Stream<Arguments>no14DataStream(){

    return Stream.of(

            arguments(new int[]{1, 2, 3}, true ),
            arguments(new int[]{1, 2, 3, 4}, false ),
            arguments(new int[]{2, 3, 4}, true ),
            arguments(new int[]{1, 1, 4, 4}, false ),
            arguments(new int[]{2, 2, 4, 4}, true ),
            arguments(new int[]{2, 3, 4, 1}, false ),
            arguments(new int[]{2, 1, 1}, true ),
            arguments(new int[]{1, 4}, false ),
            arguments(new int[]{2}, true ),
            arguments(new int[]{2, 1}, true),
            arguments(new int[]{1}, true ),
            arguments(new int[]{4}, true ),
            arguments(new int[]{}, true ),
            arguments(new int[]{1, 1, 1, 1}, true ),
            arguments(new int[]{9, 4, 4, 1}, false),
            arguments(new int[]{4, 2, 3, 1}, false ),
            arguments(new int[]{4, 2, 3, 5}, true ),
            arguments(new int[]{4, 4, 2}, true ),
            arguments(new int[]{1, 4, 4}, false )

    );

    }

}
