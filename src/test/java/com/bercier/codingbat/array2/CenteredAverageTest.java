package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CenteredAverageTest {

    @ParameterizedTest
    @MethodSource("centeredAverageDataStream")

    public void shouldReturnTheCenteredAverageOfTheArray(int[] nums, int expectedResult){

        CenteredAverage centeredAverage = new CenteredAverage();

        assertEquals(expectedResult, centeredAverage.centeredAverage(nums));

    }

    static Stream<Arguments> centeredAverageDataStream(){

        return Stream.of(

                arguments(new int[]{1, 3, 4, 100}, 3),
                arguments(new int[]{1, 1, 5, 5, 10, 8, 7}, 5),
                arguments(new int[]{-10, -4, -2, -4, -2, 0}, -3),
                arguments(new int[]{5, 3, 4, 6, 2}, 4),
                arguments(new int[]{5, 3, 4, 0, 100}, 4),
                arguments(new int[]{100, 0, 5, 3, 4}, 4),
                arguments(new int[]{4, 0, 100}, 4),
                arguments(new int[]{0, 2, 3, 4, 100}, 3),
                arguments(new int[]{1, 1, 100}, 1),
                arguments(new int[]{7, 7, 7}, 7),
                arguments(new int[]{1, 7, 8}, 7),
                arguments(new int[]{1, 1, 99, 99}, 50),
                arguments(new int[]{1000, 0, 1, 99}, 50),
                arguments(new int[]{4, 4, 4, 4, 5}, 4),
                arguments(new int[]{4, 4, 4, 1, 5}, 4),
                arguments(new int[]{6, 4, 8, 12, 3}, 6)

        );

    }

}
