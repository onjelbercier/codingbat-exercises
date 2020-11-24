package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Post4Test {

    @ParameterizedTest
    @MethodSource("post4TestDataStream")

    public void shouldReturnANewArrayContainingTheElementsFromTheOriginalArrayThatComeAfterTheLastFourInTheOriginalArray(int[] nums, List<Integer> expectedResult){

        Post4 post4 = new Post4();

        assertEquals(expectedResult, post4.post4(nums));

    }

    static Stream<Arguments>post4TestDataStream(){

        return Stream.of(

                arguments(new int[]{2, 4, 1, 2}, List.of(1, 2)),
                arguments(new int[]{4, 1, 4, 2}, List.of(2)),
                arguments(new int[]{4, 4, 1, 2, 3}, List.of(1, 2, 3)),
                arguments(new int[]{4, 2}, List.of(2)),
                arguments(new int[]{4, 4, 3}, List.of(3)),
                arguments(new int[]{4, 4}, List.of()),
                arguments(new int[]{4}, List.of()),
                arguments(new int[]{2, 4, 1, 4, 3, 2}, List.of(3, 2)),
                arguments(new int[]{4, 1, 4, 2, 2, 2}, List.of(2, 2, 2)),
                arguments(new int[]{3, 4, 3, 2}, List.of(3, 2))
        );

    }

}
