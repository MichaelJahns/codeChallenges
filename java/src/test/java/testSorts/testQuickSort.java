package testSorts;

import org.junit.Test;
import sorts.QuickSort;

import static org.junit.Assert.assertArrayEquals;


public class testQuickSort {

    @Test
    public void testQuickHappy() {
        int[] array = {9, 4, 5, 2, 0, 7, 1, 3, 6, 0};
        // This isnt normally necessary to call a foreign method, but I couldnt figure out why I couldnt import sort
        QuickSort ob = new QuickSort();
        int[] actual = ob.sort(array, 0, array.length - 1);

        int[] expected = {0, 0, 1, 2, 3, 4, 5, 6, 7, 9};

        assertArrayEquals("Array was not sorted as expected", expected, actual);
    }

    @Test
    public void testQuickEdge() {
        int[] array = {-14, 69, 86, 0, 0, 1, 4};
        QuickSort ob = new QuickSort();
        int[] expected = {-14, 0, 0, 1, 4, 69, 86};
        int[] actual = ob.sort(array, 0, array.length - 1);

        assertArrayEquals("Array was not sorted as expected", expected, actual);
    }

    @Test
    public void testQuickEmpty() {
        int[] array = {};
        QuickSort ob = new QuickSort();
        int[] expected = {};
        int[] actual = ob.sort(array, 0, array.length - 1);

        assertArrayEquals("Array was not sorted as expected", expected, actual);
    }
}
