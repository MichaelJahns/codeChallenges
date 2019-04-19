package testFibonacciSequence;

import org.junit.Test;

import static fibonacciSequence.fibonacciSequence.fibonacciSequenceFinder;
import static junit.framework.TestCase.assertEquals;

public class testFibonacciSequence {
    @Test
    public void testFibonacciSequenceFinder() {
        long expected1 = 0;
        long expected2 = 3;
        long expected3 = 7778742049L;

        assertEquals(expected1, fibonacciSequenceFinder(1));
        assertEquals(expected2, fibonacciSequenceFinder(5));
        assertEquals(expected3, fibonacciSequenceFinder(50));
    }
}
