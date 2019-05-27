package testSorts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static sorts.InsertionSort.insertionSort;
import static sorts.InsertionSort.print;

public class testInsertionSort {

    @Test
    public void testHappy() {
        int[] arr = {15, 12, 5, 1, 3};
        int[] actual = insertionSort(arr);
        int[] expected = {1, 3, 5, 12, 15};
        assertEquals(expected.length, actual.length);
        assertEquals("Array was not organized as expected", print(expected), print(actual));
        assertArrayEquals("Array was not sorted as expected", expected, actual);
    }

    @Test
    public void testEdgy() {
        int[] arr = {0, 0, -60, 121, 7};
        int[] actual = insertionSort(arr);
        int[] expected = {-60, 0, 0, 7, 121};
        assertEquals(expected.length, actual.length);
        assertEquals("Array was not organized as expected", print(expected), print(actual));
        assertArrayEquals("Array was not sorted as expected", expected, actual);
    }

    @Test
    public void testEmpty() {
        int[] arr = {};
        int[] actual = insertionSort(arr);
        int[] expected = {};
        assertEquals(expected.length, actual.length);
        assertEquals("Array was not organized as expected", print(expected), print(actual));
        assertArrayEquals("Array was not sorted as expected", expected, actual);
    }

    @Test
    public void testPreSorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] actual = insertionSort(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertEquals(expected.length, actual.length);
        assertEquals("Array was not organized as expected", print(expected), print(actual));
        assertArrayEquals("Array was not sorted as expected", expected, actual);
    }
}
