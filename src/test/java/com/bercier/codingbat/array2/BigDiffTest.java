package com.bercier.codingbat.array2;

import com.bercier.codingbat.array2.BigDiff;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BigDiffTest {

    @ParameterizedTest
    @MethodSource("bigDiffDataStream")

    public void shouldReturnTheDifferencOfTheMaxAndMinOfTheArray(int[] nums, int expectedResult){

        BigDiff bigDiff = new BigDiff();

        assertEquals(expectedResult, bigDiff.bigDiff(nums));

    }

    static Stream<Arguments> bigDiffDataStream(){

        return Stream.of(

                arguments(new int[]{10, 3, 5,}, 7 ),
                arguments(new int[]{7, 2, 10, 9}, 8 ),
                arguments(new int[]{2, 10, 7, 2}, 8 ),
                arguments(new int[]{2, 10}, 8 ),
                arguments(new int[]{10, 2}, 8 ),
                arguments(new int[]{10, 0}, 10 ),
                arguments(new int[]{2, 3}, 1 ),
                arguments(new int[]{2, 2}, 0 ),
                arguments(new int[]{2}, 0 ),
                arguments(new int[]{5, 1, 6, 1, 9, 9}, 8 ),
                arguments(new int[]{7, 6, 8, 5}, 3 ),
                arguments(new int[]{7, 7, 6,8,  5, 5}, 3 )


        );

    }
}
