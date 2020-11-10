package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShiftLeftTest {

    @ParameterizedTest
    @MethodSource("ShiftLeftTestDataStream")

    public void shouldReturnAnArrayThatIsLeftShiftedByOne(int[] nums, List<Integer> expectedResult){

        ShiftLeft shiftLeft = new ShiftLeft();

        assertEquals(expectedResult, shiftLeft.shiftLeft(nums));

    }

    static Stream<Arguments>ShiftLeftTestDataStream(){

        return Stream.of(

                arguments(new int[] {6, 2, 5, 3}, List.of(2, 5, 3, 6)),
                arguments(new int[] {1, 2}, List.of(2, 1)),
                arguments(new int[] {1}, List.of(1)),
                arguments(new int[] {}, List.of()),
                arguments(new int[] {1, 1, 2, 2, 4}, List.of(1, 2, 2, 4, 1)),
                arguments(new int[] {1, 1, 1}, List.of(1, 1, 1)),
                arguments(new int[] {1, 2, 3}, List.of(2, 3, 1))

        );

    }

}
