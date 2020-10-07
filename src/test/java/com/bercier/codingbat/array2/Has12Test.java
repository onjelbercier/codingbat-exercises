package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Has12Test {

    @ParameterizedTest
    @MethodSource("has12TestDataStream")

    public void shouldReturnTrueIfArrayContainsAOnePrecedingATwoSomewhere(int[] nums, boolean expectedResult){

        Has12 has12 = new Has12();

        assertEquals(expectedResult, has12.has12(nums));

    }

    static Stream<Arguments>has12TestDataStream(){

        return Stream.of(

                arguments(new int[]{1, 3, 2}, true ),
                arguments(new int[]{3, 1, 2}, true ),
                arguments(new int[]{3, 1, 4, 5, 2}, true ),
                arguments(new int[]{3, 1, 4, 5, 6}, false ),
                arguments(new int[]{3, 1, 4, 1, 6, 2}, true),
                arguments(new int[]{2, 1, 4, 1, 6, 2}, true ),
                arguments(new int[]{2, 1, 4, 1, 6}, false ),
                arguments(new int[]{1}, false ),
                arguments(new int[]{2, 1, 3}, false ),
                arguments(new int[]{2, 1, 3, 2}, true ),
                arguments(new int[]{2}, false ),
                arguments(new int[]{3, 2}, false ),
                arguments(new int[]{3, 1, 3, 2}, true ),
                arguments(new int[]{3, 5, 9}, false ),
                arguments(new int[]{3, 5, 1}, false ),
                arguments(new int[]{3, 2, 1}, false ),
                arguments(new int[]{1, 2}, true )

        );

    }

}
