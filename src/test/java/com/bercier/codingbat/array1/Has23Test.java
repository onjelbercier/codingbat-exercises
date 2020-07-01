package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Has23Test {

    @ParameterizedTest
    @MethodSource("has23DataStream")

    public void has23Test(int[]nums, boolean expectedResult){

        Has23 has23 = new Has23();

        assertEquals(expectedResult, has23.has23(nums));

    }

    static Stream<Arguments> has23DataStream(){

        return Stream.of(

                arguments(new int[]{2, 5}, true),
                arguments(new int[]{4, 3}, true),
                arguments(new int[]{4, 5}, false),
                arguments(new int[]{2, 2}, true),
                arguments(new int[]{3, 2}, true),
                arguments(new int[]{3, 3}, true),
                arguments(new int[]{7, 7}, false),
                arguments(new int[]{3, 9}, true),
                arguments(new int[]{9, 5}, false)

        );

    }

}
