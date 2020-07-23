package com.bercier.codingbat.array1;

import com.bercier.codingbat.array1.MakeMiddle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MakeMiddleTest {

    @ParameterizedTest
    @MethodSource("makeMiddleDataSource")

    public void shouldReturnANewArrayContainingMiddleTwo(int[] nums, List<Integer> expectedResult){

        MakeMiddle makeMiddle = new MakeMiddle();

        assertEquals(expectedResult, makeMiddle.makeMiddle(nums));

    }

    static Stream<Arguments> makeMiddleDataSource(){

        return Stream.of(arguments(new int[]{1, 2, 3,4}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(3);


                    }
                }),
                arguments(new int[]{7, 1, 2, 3, 4, 9}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(3);

                    }
                }),
                arguments(new int[]{1, 2}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);

                    }
                }),
                arguments(new int[]{5, 2, 4, 7}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(4);

                    }
                }),
                arguments(new int[]{9, 0, 4, 3, 9, 1}, new ArrayList<Integer>(){
                    {
                        add(4);
                        add(3);

                    }
                })

        );


    }

}
