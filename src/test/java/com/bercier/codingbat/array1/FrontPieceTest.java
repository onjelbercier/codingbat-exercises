package com.bercier.codingbat.array1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FrontPieceTest {

    @ParameterizedTest
    @MethodSource("frontPieceDataStream")

    public void shouldReturnAnArrrayContainingTheFirstTwoElementsOfTheOriginal(int[] nums, List<Integer> expectedResult){

        FrontPiece frontPiece = new FrontPiece();

        assertEquals(expectedResult, frontPiece.frontPiece(nums));

    }

    static Stream<Arguments> frontPieceDataStream(){

        return Stream.of(

                arguments(new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);


                    }
                }),
                arguments(new int[]{1, 2}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);

                    }
                }),
                arguments(new int[]{1}, new ArrayList<Integer>(){
                    {
                        add(1);

                    }
                }),
                arguments(new int[]{}, new ArrayList<Integer>()),
                arguments(new int[]{6, 5, 0}, new ArrayList<Integer>(){
                    {
                        add(6);
                        add(5);

                    }
                }),
                arguments(new int[]{6, 5}, new ArrayList<Integer>(){
                    {
                        add(6);
                        add(5);

                    }
                }),

                arguments(new int[]{3, 1, 4, 1, 5}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(1);

                    }
                }),

                arguments(new int[]{6}, new ArrayList<Integer>(){
                    {
                        add(6);

                    }
                })
        );

    }

}
