package com.bercier.codingbat.array2;

import com.bercier.codingbat.array2.CountEvens;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountEvensTest {

    @ParameterizedTest

    @MethodSource("countEvensDataStream")

    public void shouldReturnTheNumberOfEvensInArray(int[] nums, int expectedResult){

        CountEvens countEvens = new CountEvens();

        assertEquals(expectedResult, countEvens.countEvens(nums));

    }

    static Stream<Arguments> countEvensDataStream(){

        return Stream.of(

                arguments(new int[]{2, 1, 2, 3, 4}, 3 ),
                arguments(new int[]{2, 2, 0}, 3 ),
                arguments(new int[]{1, 3, 5}, 0 ),
                arguments(new int[]{}, 0 ),
                arguments(new int[]{11, 9, 0, 1}, 1 ),
                arguments(new int[]{2, 11, 9, 0}, 2 ),
                arguments(new int[]{2}, 1 ),
                arguments(new int[]{2, 5, 12}, 2 )

        );

    }
}
