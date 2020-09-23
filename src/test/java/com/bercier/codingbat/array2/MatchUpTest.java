package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MatchUpTest {

@ParameterizedTest
    @MethodSource("matchUpDataStream")

    public void shouldReturnTheCountOfHowManyTimesTheDifferenceBetweenIntFromNumsOneAndNumsTwoIsEqualToOrLessThan2(int[] nums1, int[] nums2, int expectedResult){

    MatchUp matchUp = new MatchUp();

    assertEquals(expectedResult, matchUp.matchUp(nums1, nums2));
}

    static Stream<Arguments>matchUpDataStream(){

    return Stream.of(

            arguments(new int[]{1, 2, 3}, new int[] {2, 3, 10}, 2 ),
            arguments(new int[]{1, 2, 3}, new int[] {2, 3, 5}, 3 ),
            arguments(new int[]{1, 2, 3}, new int[] {2, 3, 3}, 2 ),
            arguments(new int[]{5, 3}, new int[] {5, 5}, 1 ),
            arguments(new int[]{5, 3}, new int[] {4, 4}, 2 ),
            arguments(new int[]{5, 3}, new int[] {3, 3}, 1 ),
            arguments(new int[]{5, 3}, new int[] {2, 2}, 1 ),
            arguments(new int[]{5, 3}, new int[] {1, 1}, 1 ),
            arguments(new int[]{5, 3}, new int[] {0, 0}, 0 ),
            arguments(new int[]{4}, new int[] {4}, 0 ),
            arguments(new int[]{4}, new int[] {5}, 1 )

    );

    }

}
