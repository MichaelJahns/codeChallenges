package testSorts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static sorts.MergeSort.mergeSort;

public class testMergeSort {

    @Test
    public void testMergeSort() {
        int[] array = {3, 9, 0, 4, 6, 1, 7, 8, 2, 5};
        int[] actual = mergeSort(array, array.length);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertEquals("Sort had an unexpected size", expected.length, actual.length);
        assertArrayEquals("Sort had unexpected results", expected, actual);
    }

    @Test
    public void testMergeEdge() {
        int[] array = {0, 0, 0, 0, 0, 10, 10, 0, 0, 10};
        int[] actual = mergeSort(array, array.length);
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 10, 10, 10};

        assertEquals("Sort had an unexpected size", expected.length, actual.length);
        assertArrayEquals("Sort had unexpected results", expected, actual);
    }

    @Test
    public void testMergeNegative() {
        int[] array = {254, -66, 0};
        int[] actual = mergeSort(array, array.length);
        int[] expected = {-66, 0, 254};

        assertEquals("Sort had an unexpected size", expected.length, actual.length);
        assertArrayEquals("Sort had unexpected results", expected, actual);
    }
}
