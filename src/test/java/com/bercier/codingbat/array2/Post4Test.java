package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Post4Test {

    @ParameterizedTest
    @MethodSource("post4TestDataStream")

    public void shouldReturnANewArrayContainingTheElementsFromTheOriginalArrayThatComeAfterTheLastFourInTheOriginalArray(int[] nums, int[] expectedResult){

        Post4 post4 = new Post4();

        assertEquals(expectedResult, post4.post4(nums));

    }

    static Stream<Arguments>post4TestDataStream(){

        return Stream.of(

                arguments()

        );

    }

}
