package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NotAloneTest {

    @ParameterizedTest
    @MethodSource("notAloneTestDataStream")

    public void shouldAnArrayWhereEveryInstanceOfTheGivenValueWhichIsAloneBecomeTheLargerValueToItsLeftOrRight(int[] nums, int val, List<Integer> expectedResult){

        NotAlone notAlone = new NotAlone();

        assertEquals(expectedResult, notAlone.notAlone(nums,val));

    }

    static Stream<Arguments>notAloneTestDataStream(){

        return Stream.of(

                arguments(new int[]{1, 2, 3}, 2, List.of(1, 3, 3)),
                arguments(new int[]{1, 2, 3, 2, 5, 2}, 2, List.of(1, 3, 3, 5, 5, 2)),
                arguments(new int[]{3, 4}, 3, List.of(3, 4)),
                arguments(new int[]{3, 3}, 3, List.of(3, 3)),
                arguments(new int[]{1, 3, 1, 2}, 1, List.of(1, 3, 3, 2)),
                arguments(new int[]{3}, 3, List.of(3)),
                arguments(new int[]{}, 3, List.of()),
                arguments(new int[]{7, 1, 6}, 1, List.of(7, 7, 6)),
                arguments(new int[]{1, 1, 1}, 1, List.of(1, 1, 1)),
                arguments(new int[]{1, 1, 1, 2}, 1, List.of(1, 1, 1, 2))

        );

    }

}
