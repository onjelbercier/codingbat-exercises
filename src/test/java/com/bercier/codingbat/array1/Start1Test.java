package com.bercier.codingbat.array1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Start1Test {

@ParameterizedTest

    @MethodSource("start1DataStream")

    public void shouldReturnTheCountOfArraysWithFirstElementAsOne(int[] a, int[] b, long expectedResult){

    Start1 start1 = new Start1();

    assertEquals(expectedResult, start1.start1(a, b));

}

    static Stream<Arguments> start1DataStream(){

    return Stream.of(

            arguments(new int[]{1, 2, 3}, new int[]{1, 3}, 2),
            arguments(new int[]{7, 2, 3}, new int[]{1}, 1),
            arguments(new int[]{1, 2}, new int[]{}, 1),
            arguments(new int[]{}, new int[]{1, 2}, 1),
            arguments(new int[]{7}, new int[]{}, 0),
            arguments(new int[]{7}, new int[]{1}, 1),
            arguments(new int[]{1}, new int[]{1}, 2),
            arguments(new int[]{7}, new int[]{8}, 0),
            arguments(new int[]{}, new int[]{}, 0),
            arguments(new int[]{1, 3}, new int[]{1}, 2)

    );

    }

}
