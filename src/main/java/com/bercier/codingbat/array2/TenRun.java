package com.bercier.codingbat.array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TenRun {

    /*For each multiple of 10 in the given array,
    change all the values following it to be that multiple of 10,
    until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.*/

    public List tenRun(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> multipleOfTen = new ArrayList(1);
        multipleOfTen.add(-1);
        return IntStream.range(0,numsList.size()).map(index-> {
                    if(numsList.get(index) % 10 == 0){
                        multipleOfTen.set(0,numsList.get(index));
                    }
                    if (multipleOfTen.get(0) == -1)//if true then there is no multiple of Ten saved
                    {
                        return numsList.get(index);
                    }
                    else {
                        return multipleOfTen.get(0);
                    }
                    // return multipleOfTen;
                }
        ).boxed().collect(Collectors.toList());
    }
}
