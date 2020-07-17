package com.bercier.codingbat.array1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BiggerTwoTest {

@ParameterizedTest
    @MethodSource("biggerTwoDataStream")

    public void shouldReturnTheLargerSumOfTwoArrays(int[] a, int[] b, List<Integer> expectResult){

    BiggerTwo biggerTwo = new BiggerTwo();

    assertEquals(expectResult, biggerTwo.biggerTwo(a, b));

}

    static Stream<Arguments> biggerTwoDataStream(){

    return Stream.of(

            arguments(new int[]{1, 2}, new int[]{3, 4}, new ArrayList<Integer>(){
                {
                    add(3);
                    add(4);

                }
            }),
            arguments(new int[]{3, 4}, new int[]{1, 2}, new ArrayList<Integer>(){
                {
                    add(3);
                    add(4);

                }
            }),
            arguments(new int[]{1, 1}, new int[]{1, 2}, new ArrayList<Integer>(){
                {
                    add(1);
                    add(2);
                }
            }),
            arguments(new int[]{2, 1}, new int[]{1, 1}, new ArrayList<Integer>(){
                {
                    add(2);
                    add(1);

                }
            }),
            arguments(new int[]{2, 2}, new int[]{1, 3}, new ArrayList<Integer>(){
                {
                    add(2);
                    add(2);

                }
            }),
            arguments(new int[]{1, 3}, new int[]{2, 2}, new ArrayList<Integer>(){
                {
                    add(1);
                    add(3);

                }
            }),arguments(new int[]{6, 7}, new int[]{3, 1}, new ArrayList<Integer>(){
                {
                    add(6);
                    add(7);


                }
            })

    );

    }

}
