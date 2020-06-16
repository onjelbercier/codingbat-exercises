package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SameFirstLastTest {
    @ParameterizedTest

    @MethodSource("sameFirstLastDataStream")
    public void shouldReturnTrueIfArrLengthIsOneAndFirstAndLastElementsAreEqual(int[] nums, boolean expectedResult) {
        SameFirstLast sameFirstLast = new SameFirstLast();
        assertEquals(expectedResult, sameFirstLast.sameFirstLast(nums));

    }
    static Stream<Arguments> sameFirstLastDataStream() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, false),
                arguments(new int[]{1, 2, 3, 1}, true),
                arguments(new int[]{1, 2, 1}, true),
                arguments(new int[]{7}, true),
                arguments(new int[]{}, false),
                arguments(new int[]{1, 2, 3, 4, 5, 1}, true),
                arguments(new int[]{1, 2, 3, 4, 5, 13}, false),
                arguments(new int[]{13, 2, 3, 4, 5, 13}, true),
                arguments(new int[]{7, 7}, true),
                arguments(new int[]{5, 5}, true)

        );
    }
}