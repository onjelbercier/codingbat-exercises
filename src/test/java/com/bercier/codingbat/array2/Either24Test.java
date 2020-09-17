package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Either24Test {

    @ParameterizedTest
    @MethodSource("either24DataStream")

    public void shouldReturnTrueForDoubleTwosOrDoubleFoursButNotBoth(int[] nums, boolean expectedResult){

        Either24 either24 = new Either24();

        assertEquals(expectedResult, either24.either24(nums));

    }

    static Stream<Arguments>either24DataStream(){

        return Stream.of(

                arguments(new int[]{1, 2, 2}, true ),
                arguments(new int[]{4, 4, 1}, true ),
                arguments(new int[]{4, 4, 1, 2, 2}, false ),
                arguments(new int[]{1, 2, 3, 4}, false ),
                arguments(new int[]{3, 5, 9}, false ),
                arguments(new int[]{1, 2, 3, 4, 4}, true ),
                arguments(new int[]{2, 2, 3, 4}, true ),
                arguments(new int[]{1, 2, 3, 2, 2, 4}, true ),
                arguments(new int[]{1, 2, 3, 2, 2, 4, 4}, false ),
                arguments(new int[]{1, 2}, false),
                arguments(new int[]{2, 2}, true ),
                arguments(new int[]{4, 4}, true ),
                arguments(new int[]{2}, false ),
                arguments(new int[]{}, false )

        );

    }

}
