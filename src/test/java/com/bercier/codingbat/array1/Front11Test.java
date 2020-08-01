package com.bercier.codingbat.array1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
public class Front11Test {
    @ParameterizedTest
    @MethodSource("front11DataStream")
    public void shouldReturnNewListOfFirstTwoElements(int[] a, int[] b, List expectedResult){
        Front11 front11 = new Front11();
        assertEquals(expectedResult, front11.front11(a,b));
    }
    static Stream<Arguments> front11DataStream(){
        return Stream.of(
                arguments(new int[]{1,2,3}, new int[]{7,9,8}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(7);
                    }
                }),
                arguments(new int[]{1}, new int[]{2}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                    }
                }),
                arguments(new int[]{1,7}, new int[]{}, new ArrayList<Integer>(){
                    {
                        add(1);
                    }
                }),
                arguments(new int[]{}, new int[]{2,8}, new ArrayList<Integer>(){
                    {
                        add(2);
                    }
                }),
                arguments(new int[]{}, new int[]{}, new ArrayList<Integer>(){
                    {
                    }
                }),
                arguments(new int[]{1,2,3}, new int[]{7,9,8}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(7);
                    }
                }),
                arguments(new int[]{3}, new int[]{1,2,1,9}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(1);
                    }
                }),
                arguments(new int[]{1,4,1,9}, new int[]{}, new ArrayList<Integer>(){
                    {
                        add(1);
                    }
                })
        );
    }
}