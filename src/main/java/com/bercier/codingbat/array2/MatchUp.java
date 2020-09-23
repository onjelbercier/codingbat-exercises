package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MatchUp {

    /*Given arrays nums1 and nums2 of the same length,
    for every element in nums1,
    consider the corresponding element in nums2 (at the same index).
    Return the count of the number of times that the two elements differ by 2 or less,
    but are not equal.*/

    public int matchUp(int[] nums1, int[] nums2) {

        List<Integer> nums1List = Arrays.stream(nums1).boxed().collect(Collectors.toList());

        List<Integer>nums2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        return Long.valueOf(IntStream.range(0, nums1List.size()).filter(index -> nums1List.get(index) != nums2List.get(index) && Math.abs(nums1List.get(index) - nums2List.get(index)) <= 2).count()).intValue();

    }//end method
}
