package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Only14Test {

    @ParameterizedTest
    @MethodSource("only14DataStream")

    public void shouldReturnTrueIfTheArrayContainsOnlyOnesOrFours(int[] nums, boolean expectedResult){

        Only14 only14 = new Only14();

        assertEquals(expectedResult, only14.only14(nums));

    }

    static Stream<Arguments>only14DataStream(){

        return Stream.of(

                arguments(new int[]{1, 4, 1, 4}, true ),
                arguments(new int[]{1, 4, 2, 4}, false ),
                arguments(new int[]{1, 1}, true ),
                arguments(new int[]{4, 1}, true ),
                arguments(new int[]{2}, false ),
                arguments(new int[]{}, true ),
                arguments(new int[]{1, 4, 1, 3}, false ),
                arguments(new int[]{3, 1, 3}, false ),
                arguments(new int[]{1}, true ),
                arguments(new int[]{4}, true),
                arguments(new int[]{3, 4}, false ),
                arguments(new int[]{1, 3, 4}, false ),
                arguments(new int[]{1, 1, 1}, true ),
                arguments(new int[]{1, 1, 1, 5}, false ),
                arguments(new int[]{4, 1, 4, 1}, true )

        );

    }

}
