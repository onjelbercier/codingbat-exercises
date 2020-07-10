package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Fix23Test {

@ParameterizedTest
    @MethodSource("fix23DataStream")

    public void shouldReturnANewArrayWithEveryThreeFollowingATwoAsZero(int[] nums, List<Integer> expectedResult){

    Fix23 fix23 = new Fix23();

    assertEquals(expectedResult, fix23.fix23(nums));

}

    static Stream<Arguments> fix23DataStream(){

    return Stream.of(

            arguments(new int[]{1, 2, 3}, new ArrayList<Integer>(){
                {
                    add(1);
                    add(2);
                    add(0);

                }
            }),
            arguments(new int[]{2, 3, 5}, new ArrayList<Integer>(){
                {
                    add(2);
                    add(0);
                    add(5);

                }
            }),
            arguments(new int[]{1, 2, 1}, new ArrayList<Integer>(){
                {
                    add(1);
                    add(2);
                    add(1);
                }
            }),
            arguments(new int[]{3, 2, 1}, new ArrayList<Integer>(){
                {
                    add(3);
                    add(2);
                    add(1);

                }
            }),
            arguments(new int[]{2, 2, 3}, new ArrayList<Integer>(){
                {
                    add(2);
                    add(2);
                    add(0);

                }
            }),
            arguments(new int[]{2, 3, 3}, new ArrayList<Integer>(){
                {
                    add(2);
                    add(0);
                    add(3);

                }
            })

    );

    }

}
