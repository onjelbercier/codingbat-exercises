package com.bercier.codingbat.array2;

import com.bercier.codingbat.array2.Has22;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Has22Test {

    @ParameterizedTest
    @MethodSource("has22DataStream")

    public void shouldReturnTrueIfArrayContainsATwoNextToATwo(int[]nums, boolean expectedResult){

        Has22 has22 = new Has22();

        assertEquals(expectedResult, has22.has22(nums));

    }

    static Stream<Arguments> has22DataStream(){

        return Stream.of(

                arguments(new int[]{1, 2, 2}, true ),
                arguments(new int[]{1, 2, 1, 2}, false ),
                arguments(new int[]{2, 1, 2}, false ),
                arguments(new int[]{2, 2, 1, 2}, true ),
                arguments(new int[]{1, 3, 2}, false ),
                arguments(new int[]{1, 3, 2, 2}, true ),
                arguments(new int[]{2, 3, 2, 2}, true ),
                arguments(new int[]{4, 2, 4, 2, 2, 5}, true ),
                arguments(new int[]{1, 2}, false ),
                arguments(new int[]{2, 2}, true),
                arguments(new int[]{2}, false ),
                arguments(new int[]{}, false ),
                arguments(new int[]{3, 3, 2, 2}, true ),
                arguments(new int[]{5, 2, 5, 2}, false )


        );

    }

}
