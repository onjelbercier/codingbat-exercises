package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SameEndsTest {

    @ParameterizedTest
    @MethodSource("sameEndsTestDataStream")
    public void shouldReturnTrueIfTheGroupOfNumbersAtTheStartAndEndOfTheArrayAreTheSame(int[] nums, int len, boolean expectedResult){

        SameEnds sameEnds = new SameEnds();

        assertEquals(expectedResult, sameEnds.sameEnds(nums, len));

    }

    static Stream<Arguments>sameEndsTestDataStream(){

        return Stream.of(

                arguments(new int[]{5, 6, 45, 99, 13, 5, 6}, 1, false),
                arguments(new int[]{5, 6, 45, 99, 13, 5, 6}, 2, true),
                arguments(new int[]{5, 6, 45, 99, 13, 5, 6}, 3, false),
                arguments(new int[]{1, 2, 5, 2, 1}, 1, true),
                arguments(new int[]{1, 2, 5, 2, 1}, 2, false),
                arguments(new int[]{1, 2, 5, 2, 1}, 0, true),
                arguments(new int[]{1, 2, 5, 2, 1}, 5, true),
                arguments(new int[]{1, 1, 1}, 0, true),
                arguments(new int[]{1, 1, 1}, 1, true),
                arguments(new int[]{1, 1, 1}, 2, true),
                arguments(new int[]{1, 1, 1}, 3, true),
                arguments(new int[]{1}, 1, true),
                arguments(new int[]{}, 0, true),
                arguments(new int[]{4, 2, 4, 5}, 1, false)


        );

    }
}
