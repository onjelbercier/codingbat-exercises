package com.bercier.codingbat.array1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
public class RotateLeft3Test {
    @ParameterizedTest
    @MethodSource("rotateLeftDataStream")
    public void shouldRotateElementsToTheLeft(int[] nums, List<Integer> expectedResult){
        RotateLeft3 rotateLeft3 = new RotateLeft3();
        assertEquals(expectedResult, rotateLeft3.rotateLeft3(nums));
    }
    static Stream<Arguments> rotateLeftDataStream(){
        return Stream.of(
                arguments(new int[]{1, 2, 3}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(3);
                        add(1);
                    }
                }),
                arguments(new int[]{5,11, 9}, new ArrayList<Integer>(){
                    {
                        add(11);
                        add(9);
                        add(5);
                    }
                }),
                arguments(new int[]{7, 0, 0}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(7);
                    }
                }),
                arguments(new int[]{1, 2, 1}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(1);
                        add(1);
                    }
                }),
                arguments(new int[]{0, 0, 1}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(1);
                        add(0);
                    }
                })
        );
    }
}