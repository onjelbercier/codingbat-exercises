package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MakeLastTest {

    @ParameterizedTest
    @MethodSource("makeLastDataStream")

    public void shouldReturnAListDoubledInSize(int[] nums, List<Integer> expectedResult){

        MakeLast makeLast = new MakeLast();

        assertEquals(expectedResult, makeLast.makeLast(nums));

    }

    static Stream<Arguments>makeLastDataStream(){

        return Stream.of(

                arguments(new int[]{4, 5, 6}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(6);
                    }
                }),
                arguments(new int[]{1, 2}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(0);
                        add(2);
                    }
                }),
                arguments(new int[]{3}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(3);
                    }
                }),
                arguments(new int[]{0}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);

                    }
                }),
                arguments(new int[]{7, 7, 7}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(7);
                    }
                }),
                arguments(new int[]{3, 1, 4}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(4);
                    }
                }),arguments(new int[]{1, 2, 3, 4}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(4);

                    }
                }),arguments(new int[]{1, 2, 3, 0}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);
                        add(0);

                    }
                }),arguments(new int[]{2, 4}, new ArrayList<Integer>() {
                            {
                                add(0);
                                add(0);
                                add(0);
                                add(4);

                            }

                        }
                    ));

    }//end of makeLastDataStream
}
