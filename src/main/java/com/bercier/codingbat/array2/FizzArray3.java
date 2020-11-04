package com.bercier.codingbat.array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzArray3 {

    /*Given start and end numbers,
    return a new array containing the sequence of integers from start up to but not including end,
    so start=5 and end=10 yields {5, 6, 7, 8, 9}.
    The end number will be greater or equal to the start number.
    Note that a length-0 array is valid. (See also: FizzBuzz Code)*/

    public List<Integer> fizzArray3(int start, int end) {

        return IntStream.range(start, end).map(i -> i).boxed().collect(Collectors.toList());

    }


}
