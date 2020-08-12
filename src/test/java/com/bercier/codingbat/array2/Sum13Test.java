package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Sum13Test {

@ParameterizedTest
    @MethodSource("sum13DataStream")

    public void shouldReturnTheSumOfAllNumbersInTheArrayExceptThirteenAndThoseThatImmediatelyFollowIt(int[]nums, int expectedResult){

    Sum13 sum13 = new Sum13();

    assertEquals(expectedResult, sum13.sum13(nums));

}

    static Stream<Arguments> sum13DataStream(){

    return Stream.of(


            arguments(new int[]{1, 2, 2, 1}, 6 ),
            arguments(new int[]{1, 1}, 2 ),
            arguments(new int[]{1, 2, 2, 1, 13}, 6 ),
            arguments(new int[]{1, 2, 13, 2, 1, 13}, 4 ),
            arguments(new int[]{13, 1, 2, 13, 2, 1, 13}, 3 ),
            arguments(new int[]{}, 0 ),
            arguments(new int[]{13}, 0 ),
            arguments(new int[]{13, 13}, 0 ),
            arguments(new int[]{13, 0, 13}, 0 ),
            arguments(new int[]{13, 1, 13}, 0 ),
            arguments(new int[]{5, 7, 2}, 14 ),
            arguments(new int[]{5, 13, 2}, 5 ),
            arguments(new int[]{0}, 0 ),
            arguments(new int[]{13, 0}, 0 )


    );

    }

}
