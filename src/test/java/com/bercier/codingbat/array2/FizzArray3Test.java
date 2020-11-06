package com.bercier.codingbat.array2;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FizzArray3Test {

    @ParameterizedTest
    @MethodSource("fizzArray3DataStream")
    public void shouldReturnANewArrayContainingTheSequenceOfIntegersFormStartToExclusiveEnd(int start, int end, List<Integer> expectedResult){

        FizzArray3 fizzArray3 = new FizzArray3();

        assertTrue(CollectionUtils.isEqualCollection(expectedResult, fizzArray3.fizzArray3(start, end)));


    }

    static Stream<Arguments>fizzArray3DataStream(){

        return Stream.of(

                arguments( 5, 10, List.of(5, 6, 7, 8, 9)),
                arguments( 11, 18, List.of(11, 12, 13, 14, 15, 16, 17)),
                arguments( 1, 3, List.of(1, 2)),
                arguments( 1, 2, List.of(1)),
                arguments( 1, 1, List.of()),
                arguments( 1000, 1005, List.of(1000, 1001, 1002, 1003, 1004))

        );

    }

}
