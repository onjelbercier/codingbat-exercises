package com.bercier.codingbat.array1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaxEnd3Test {

    @ParameterizedTest
    @MethodSource("maxEnd3DataStream")

  public void shouldReturnArrayOfLargestInt(int[] nums, List<Integer> expectedResult){

        MaxEnd3 maxEnd3 = new MaxEnd3();
        assertEquals(expectedResult, maxEnd3.maxEnd3(nums));
    }
static Stream<Arguments> maxEnd3DataStream(){
    return Stream.of(
            arguments(new int[]{1, 2, 3}, new ArrayList<Integer>(){
                {
                    add(3);
                    add(3);
                    add(3);
                }
            }),
            arguments(new int[]{11,5, 9}, new ArrayList<Integer>(){
                {
                    add(11);
                    add(11);
                    add(11);
                }
            }),
            arguments(new int[]{2,11, 3}, new ArrayList<Integer>(){
                {
                    add(3);
                    add(3);
                    add(3);
                }
            }),
            arguments(new int[]{11, 3, 3}, new ArrayList<Integer>(){
                {
                    add(11);
                    add(11);
                    add(11);
                }
            }),
            arguments(new int[]{3, 11, 11}, new ArrayList<Integer>(){
                {
                    add(11);
                    add(11);
                    add(11);
                }
            }),
            arguments(new int[]{2, 2, 2}, new ArrayList<Integer>(){
                {
                    add(2);
                    add(2);
                    add(2);
                }
            }),arguments(new int[]{0, 0, 1}, new ArrayList<Integer>(){
                {
                    add(1);
                    add(1);
                    add(1);
                }
            })
    );
}


}
