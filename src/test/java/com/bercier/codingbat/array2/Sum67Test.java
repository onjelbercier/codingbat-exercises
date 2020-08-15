package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Sum67Test {

    @ParameterizedTest
    @MethodSource("sum67DataStream")

    public void shouldReturnSumOfElementsExceptFromASixToASeven(int[] nums, int expectedResult){

        Sum67 sum67 = new Sum67();

        assertEquals(expectedResult, sum67.sum67(nums));

    }

    static Stream<Arguments>sum67DataStream(){

        return Stream.of(

                arguments(new int[]{1, 2, 2}, 5 ),
                arguments(new int[]{1, 2, 2, 6, 99, 99, 7}, 5 ),
                arguments(new int[]{1, 1, 6, 7, 2}, 4 ),
                arguments(new int[]{1, 6, 2, 2, 7, 1, 6, 99, 99, 7}, 2 ),
                arguments(new int[]{1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}, 2 ),
                arguments(new int[]{2, 7, 6, 2, 6, 7, 2, 7}, 18 ),
                arguments(new int[]{2, 7, 6, 2, 6, 2, 7}, 9 ),
                arguments(new int[]{1, 6, 7, 7}, 8 ),
                arguments(new int[]{6, 7, 1, 6, 7, 7}, 8 ),
                arguments(new int[]{6, 8, 1, 6, 7}, 0 ),
                arguments(new int[]{}, 0 ),
                arguments(new int[]{6, 7, 11}, 11 ),
                arguments(new int[]{11, 6, 7, 11}, 22 ),
                arguments(new int[]{2, 2, 6, 7, 7}, 11 )

        );

    }

}
