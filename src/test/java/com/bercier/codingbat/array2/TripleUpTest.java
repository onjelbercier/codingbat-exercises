package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TripleUpTest {

    @ParameterizedTest
    @MethodSource("TripleUpTestDataStream")

    public void shouldReturnTrueIfTheArrayContainsThreeConsecutiveAdjacentNumbers(int[] nums, boolean expectedResult){

        TripleUp tripleUp = new TripleUp();

        assertEquals(expectedResult, tripleUp.tripleUp(nums));

    }

    static Stream<Arguments>TripleUpTestDataStream(){

        return Stream.of(

                arguments(new int[]{1, 4, 5, 6, 2}, true ),
                arguments(new int[]{1, 2, 3}, true ),
                arguments(new int[]{1, 2, 4}, false ),
                arguments(new int[]{1, 2, 4, 5, 7, 6, 5, 6, 7, 6}, true ),
                arguments(new int[]{1, 2, 4, 5, 7, 6, 5, 7, 7, 6}, false ),
                arguments(new int[]{1, 2}, false ),
                arguments(new int[]{1}, false ),
                arguments(new int[]{}, false ),
                arguments(new int[]{10, 9, 8, -100, -99, -98, 100}, true ),
                arguments(new int[]{10, 9, 8, -100, -99, 99, 100}, false ),
                arguments(new int[]{-100, -99, -99, 100, 101, 102}, true ),
                arguments(new int[]{2, 3, 5, 6, 8, 9, 2, 3}, false )

        );

    }

}
