package com.bercier.codingbat.array1;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
public class MakePiTest {
    @Test
    public void shouldReturnNewArrayOfFirstThreePiValues(){
        MakePi makePi = new MakePi();
        final List<Integer> firstThreeOfPi = makePi.makePi();
        List<Integer> expectPiValues = Arrays.asList(3,1,4);
        assertNotNull(firstThreeOfPi);
        assertEquals(firstThreeOfPi.size(),3);
        assertTrue(firstThreeOfPi.containsAll(expectPiValues));
        assertTrue(CollectionUtils.isEqualCollection(expectPiValues, firstThreeOfPi));
    }
}