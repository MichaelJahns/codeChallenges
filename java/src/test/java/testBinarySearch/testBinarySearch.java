package testBinarySearch;

import org.junit.Test;

import static binarySearch.binarySearch.binarySearch;
import static org.junit.Assert.assertEquals;

public class testBinarySearch {
    @Test
    public void testBinarySearch() {
        int[] testArray1 = {1, 2, 3, 4, 5};
        int[] testArray2 = {10, -30, 44, 0};
        //expected
        assertEquals(2, binarySearch(3, testArray1));
        assertEquals(1, binarySearch(-30, testArray2));
        //failures
        int[] failArray = {1, 2, 3, 4, 5};
        assertEquals(-1, binarySearch(30, failArray));
        //edge
        int[] edgeArray = {0, 0, 0, 0, 14};
        assertEquals(0, binarySearch(0, edgeArray));
    }

    @Test
    public void benchMarkBinarySearch() {
        int[] benchMark100 = new int[100];
        int[] benchMark10000 = new int[10_000];
        int[] benchMark100000 = new int[100_000];

        for (int i = 0; i < 100; i++) {
            benchMark100[i] = i;
        }
        for (int i = 0; i < 10_000; i++) {
            benchMark10000[i] = i + 1;
        }
        for (int i = 0; i < 100_000; i++) {
            benchMark100000[i] = i + 1;
        }
        assertEquals(99, binarySearch(99, benchMark100));
        assertEquals(9999, binarySearch(10000, benchMark10000));
        assertEquals(99999, binarySearch(100000, benchMark100000));

    }
}
