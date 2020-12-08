package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ModThreeTest {

    @ParameterizedTest
    @MethodSource("modThreeTestDataStream")

    public void shouldReturnTrueIfTheArrayContainsEitherThreeEvenOrOddValuesAllNextTOEachOther(int[] nums, boolean expectedResult){

        ModThree modThree = new ModThree();

        assertEquals(expectedResult, modThree.modThree(nums));

    }

    static Stream<Arguments>modThreeTestDataStream(){

        return Stream.of(

                arguments(new int[]{2, 1, 3, 5}, true ),
                arguments(new int[]{2, 1, 2, 5}, false ),
                arguments(new int[]{2, 4, 2, 5}, true ),
                arguments(new int[]{1, 2, 1, 2, 1}, false ),
                arguments(new int[]{9, 9, 9}, true ),
                arguments(new int[]{1, 2, 1}, false ),
                arguments(new int[]{1, 2}, false ),
                arguments(new int[]{1}, false ),
                arguments(new int[]{}, false ),
                arguments(new int[]{9, 7, 2, 9}, false),
                arguments(new int[]{9, 7, 2, 9}, false ),
                arguments(new int[]{9, 7, 2, 9, 2, 2, 6}, true )

        );

    }

}
