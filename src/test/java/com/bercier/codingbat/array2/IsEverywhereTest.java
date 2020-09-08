package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IsEverywhereTest {

    @ParameterizedTest
    @MethodSource("isEverwhereDataStream")

    public void shouldReturnTrueIfAnIntegerIsEverywhereInTheArray(int[] nums, int val, boolean expectedResult){

        IsEverywhere isEverywhere = new IsEverywhere();

        assertEquals(expectedResult, isEverywhere.isEverywhere(nums,val));

    }

    static Stream<Arguments>isEverwhereDataStream(){

        return Stream.of(

                arguments(new int[]{1, 2, 1, 3}, 1, true ),
                arguments(new int[]{1, 2, 1, 3}, 2, false ),
                arguments(new int[]{1, 2, 1, 3, 4}, 1, false ),
                arguments(new int[]{2, 1, 2, 1}, 1, true ),
                arguments(new int[]{2, 1, 2, 1}, 2, true ),
                arguments(new int[]{2, 1, 2, 3, 1}, 2, false ),
                arguments(new int[]{3, 1}, 3, true ),
                arguments(new int[]{3, 1}, 2, false ),
                arguments(new int[]{3}, 1, true ),
                arguments(new int[]{}, 1, true ),
                arguments(new int[]{1, 2, 1, 2, 3, 2, 5}, 2, true),
                arguments(new int[]{1, 2, 1, 1, 1, 2}, 2, false),
                arguments(new int[]{2, 1, 2, 1, 1, 2}, 2, false ),
                arguments(new int[]{2, 1, 2, 2, 2, 1, 1, 2}, 2, false ),
                arguments(new int[]{2, 1, 2, 2, 2, 1, 2, 1}, 2, true ),
                arguments(new int[]{2, 1, 2, 1, 2}, 2, true)


        );

    }

}
