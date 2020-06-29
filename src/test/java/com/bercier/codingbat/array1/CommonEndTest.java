package com.bercier.codingbat.array1;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CommonEndTest {

@ParameterizedTest
@MethodSource("commonEndsDataStream")
    public void shouldReturnTrueIfSameEnds(int[]a, int[]b, boolean expectedResult){

    CommonEnd commonEnd = new CommonEnd();

    assertEquals(expectedResult, commonEnd.commonEnd(a, b));
}

static Stream<Arguments>commonEndsDataStream(){

    return Stream.of(
            arguments(new int[]{1, 2, 3}, new int[] {7, 3},true),
            arguments(new int[]{1, 2, 3}, new int[] {7, 3,2},false),
            arguments(new int[]{1, 2, 3}, new int[] {1, 3},true),
            arguments(new int[]{1, 2, 3}, new int[] {1},true),
            arguments(new int[]{1, 2, 3}, new int[] {2},false)

    );


}

}
