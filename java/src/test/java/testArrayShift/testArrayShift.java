/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testArrayShift;

import org.junit.Test;

import static arrayShift.arrayShift.insertShiftArray;
import static org.junit.Assert.assertArrayEquals;

public class testArrayShift {
    @Test
    public void testArrayShift() {
        int[] input1 = {1, 2, 4, 5};
        int[] input2 = {0, 0, 0, 0, 0};
        int[] input3 = {};

        int[] expectedOutput1 = {1, 2, 3, 4, 5};
        int[] expectedOutput2 = {0, 0, 0, 1, 0, 0};
        ;
        int[] expectedOutput3 = {-60};

        assertArrayEquals(expectedOutput1, insertShiftArray(3, input1));
        assertArrayEquals(expectedOutput2, insertShiftArray(1, input2));
        assertArrayEquals(expectedOutput3, insertShiftArray(-60, input3));
    }
}
