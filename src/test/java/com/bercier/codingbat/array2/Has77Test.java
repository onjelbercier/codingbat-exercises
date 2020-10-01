package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Has77Test {

    @ParameterizedTest
    @MethodSource("has77DataStream")

    public  void  shouldReturnTrueIfArrayContainsDoubleSevensOrTwoSevenSeparatedByOneElement(int[] nums, boolean expectedResult){

        Has77 has77 = new Has77();
        assertEquals(expectedResult, has77.has77(nums));

    }

    static Stream<Arguments> has77DataStream(){

        return  Stream.of(

                arguments(new int[]{1, 7, 7}, true ),
                arguments(new int[]{1, 7, 1, 7}, true ),
                arguments(new int[]{1, 7, 1, 1, 7}, false ),
                arguments(new int[]{7, 7, 1, 1, 7}, true ),
                arguments(new int[]{2, 7, 2, 2, 7, 2}, false ),
                arguments(new int[]{2, 7, 2, 2, 7, 7}, true ),
                arguments(new int[]{7, 2, 7, 2, 2, 7}, true ),
                arguments(new int[]{7, 2, 6, 2, 2, 7}, false ),
                arguments(new int[]{7, 7, 7}, true ),
                arguments(new int[]{7, 1, 7}, true),
                arguments(new int[]{7, 1, 1}, false ),
                arguments(new int[]{1, 2}, false ),
                arguments(new int[]{1, 7}, false ),
                arguments(new int[]{7}, false )

        );

    }

}
