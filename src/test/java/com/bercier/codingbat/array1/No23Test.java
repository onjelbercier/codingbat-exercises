package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class No23Test {

    @ParameterizedTest
    @MethodSource("no23DataStream")

    public void ShouldReturnTrueIfArrayContainsNoTwosOrThrees(int[] nums,boolean expectedResult){

        No23 no23 = new No23();

        assertEquals(expectedResult,no23.no23(nums));

    }

    static Stream<Arguments> no23DataStream(){

        return Stream.of(

                arguments(new int[]{4, 5}, true),
                arguments(new int[]{4, 2}, false),
                arguments(new int[]{3, 5}, false),
                arguments(new int[]{1, 9}, true),
                arguments(new int[]{2, 9}, false),
                arguments(new int[]{1, 3}, false),
                arguments(new int[]{1, 1}, true),
                arguments(new int[]{2, 2}, false),
                arguments(new int[]{3, 3}, false),
                arguments(new int[]{7, 8}, true),
                arguments(new int[]{8, 7}, true)
        );

    }

}
