package com.bercier.codingbat.array1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
public class FirstLast6Test {
    @ParameterizedTest
    //@CsvFileSource(resources = "/first-last-six-data.csv")
    @MethodSource("firstLast6DataStream")
    public void shouldReturnTrueIfSixIsFirstOrLastElement(int[] nums, boolean expectedResult ){
        FirstLast6 firstLast6 = new FirstLast6();
        assertEquals(expectedResult, firstLast6.firstLast6(nums));
    }
    static Stream<Arguments> firstLast6DataStream() {
        return Stream.of(
                arguments(new int[]{1, 2, 6}, true),
                arguments(new int[]{6, 1, 2, 3}, true),
                arguments(new int[]{13, 6, 1, 2, 3}, false),
                arguments(new int[]{13, 6, 1, 2, 6}, true),
                arguments(new int[]{3, 2, 1}, false),
                arguments(new int[]{3, 6, 1}, false),
                arguments(new int[]{6}, true),
                arguments(new int[]{3}, false),
                arguments(new int[]{5,6}, true),
                arguments(new int[]{5,5}, false),
                arguments(new int[]{1, 2, 3, 4, 6}, true),
                arguments(new int[]{1, 2, 3, 4}, false)
        );
    }
}