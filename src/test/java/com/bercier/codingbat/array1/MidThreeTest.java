package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MidThreeTest {

    @ParameterizedTest
    @MethodSource("midThreeDataStream")

    public void shouldReturnAnArrayContainingTheMiddleThreeElementsOfTheOriginalArray(int[] nums, List<Integer> expectedResult){

        MidThree midThree = new MidThree();

        assertEquals(expectedResult, midThree.midThree(nums));

    }

      static Stream<Arguments> midThreeDataStream(){

        return Stream.of(

                arguments(new int[]{1, 2, 3, 4, 5}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(3);
                        add(4);


                    }
                }),
                arguments(new int[]{8, 6, 7, 5, 3, 0, 9}, new ArrayList<Integer>(){
                    {
                        add(7);
                        add(5);
                        add(3);

                    }
                }),
                arguments(new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                        add(3);

                    }
                })

        );

      }

}
