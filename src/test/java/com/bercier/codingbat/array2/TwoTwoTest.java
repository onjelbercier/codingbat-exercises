package com.bercier.codingbat.array2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
public class TwoTwoTest {
    @ParameterizedTest
    @MethodSource("twoTwoDataStream")
    public void shouldReturnTrueIfTwoIsNextToTwo(int[] nums, boolean expectedResult){
        TwoTwo twoTwo = new TwoTwo();
        assertEquals(expectedResult, twoTwo.twoTwo(nums));
    }
    static Stream<Arguments> twoTwoDataStream(){
        return Stream.of(
                arguments(new int[]{4,2,2,3}, true),
                arguments(new int[]{2,2,4}, true),
                arguments(new int[]{2,2,4,2}, false),
                arguments(new int[]{1,3,4}, true),
                arguments(new int[]{1,2,2,3,4}, true),
                arguments(new int[]{1,2,4,4}, false),
                arguments(new int[]{2,2}, true),
                arguments(new int[]{2,2,7}, true),
                arguments(new int[]{2,2,7,2,1}, false),
                arguments(new int[]{4,2,2,2}, true),
                arguments(new int[]{1,2}, false),
                arguments(new int[]{2}, false),
                arguments(new int[]{1}, true),
                arguments(new int[]{}, true),
                arguments(new int[]{5,2,2,3}, true),
                arguments(new int[]{2,2,5,2}, false)
        );
    }
}