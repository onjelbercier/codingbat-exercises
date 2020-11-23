package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Pre4Test {

    @ParameterizedTest
    @MethodSource("pre4TestDataStream")

    public void shouldReturnANewArrayContainingElementsFromTheOriginalThatComesBeforeTheFirstFourInTheOriginalArray(int[] nums, List<Integer> expectedResult){

        Pre4 pre4 = new Pre4();

        assertEquals(expectedResult, pre4.pre4(nums));

    }

    static Stream<Arguments>pre4TestDataStream(){

        return Stream.of(

                arguments(new int[] {1, 2, 4, 1}, List.of(1, 2)),
                arguments(new int[] {3, 1, 4}, List.of(3, 1)),
                arguments(new int[] {1, 4, 4}, List.of(1)),
                arguments(new int[] {1, 4, 4, 2}, List.of(1)),
                arguments(new int[] {1, 3, 4, 2, 4}, List.of(1, 3)),
                arguments(new int[] {4, 4}, List.of()),
                arguments(new int[] {3, 3, 4}, List.of(3, 3)),
                arguments(new int[] {1, 2, 1, 4}, List.of(1, 2, 1)),
                arguments(new int[] {2, 1, 4, 2}, List.of(2, 1)),
                arguments(new int[] {2, 1, 2, 1, 4, 2}, List.of(2, 1, 2, 1))


        );

    }


}
