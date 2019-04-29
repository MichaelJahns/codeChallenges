package testDataStructures;

import dataStructures.Stack;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class testStack {
    @Test
    public void testInstantiateEmptyStack() {
        Stack empty = new Stack();
        int expectedHeight = 0;
        assertEquals("Stack didn't instantiate with size of 0", expectedHeight, empty.getSize());
        assertNull("Peek returned an unexpected Node", empty.peek());
        try {
            empty.pop();
            fail();
        } catch (AssertionError n) {
            System.out.println("Popping an empty list successfully threw error");
        }
    }

    @Test
    public void testPush() {
        Stack testPush = new Stack();
        testPush.enqueue(1);
        assertEquals("Head had an unexpected value", 1, testPush.peek().value);
        assertEquals("Head had an unexpected pointer", null, testPush.peek().pointer);
        testPush.enqueue(2);
        assertEquals("Head had an unexpected value", 2, testPush.peek().value);
    }

    @Test
    public void testMultiplePush() {
        Stack testMulitplePush = new Stack();
        testMulitplePush.enqueue(10);
        testMulitplePush.enqueue(9);
        testMulitplePush.enqueue(8);

        int[] expectedArray1 = {8, 9, 10};
        assertEquals("Head had an unexpected value", 8, testMulitplePush.peek().value);
        assertEquals("Stack had an unexpected print", Arrays.toString(expectedArray1), Arrays.toString(testMulitplePush.printGuts()));

        testMulitplePush.enqueue(7);
        testMulitplePush.enqueue(6);
        testMulitplePush.enqueue(5);
        testMulitplePush.enqueue(4);
        testMulitplePush.enqueue(3);
        testMulitplePush.enqueue(2);
        testMulitplePush.enqueue(1);
        int[] expectedArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals("Head had an unexpected value", 1, testMulitplePush.peek().value);
        assertEquals("Stack had an unexpected print", Arrays.toString(expectedArray2), Arrays.toString(testMulitplePush.printGuts()));
    }

    @Test
    public void testEmptyWithPops() {
        Stack emptyMe = new Stack();
        try {
            emptyMe.pop();
            fail();
        } catch (AssertionError n) {
            System.out.println("Popping on an empty list successfully threw an error");
        }
        emptyMe.enqueue(5);
        emptyMe.enqueue(4);
        emptyMe.enqueue(3);
        emptyMe.enqueue(2);
        emptyMe.enqueue(1);
        emptyMe.pop();
        emptyMe.pop();
        int[] expectedArray1 = {3, 4, 5};
        assertEquals("Head had an unexpected value", 3, emptyMe.peek().value);
        assertEquals("Stack had an unexpected print", Arrays.toString(expectedArray1), Arrays.toString(emptyMe.printGuts()));
        emptyMe.pop();
        emptyMe.pop();
        emptyMe.pop();
        assertNull("Head unexpectedly had a value", emptyMe.peek());
        try {
            emptyMe.pop();
            fail();
        } catch (AssertionError n) {
            System.out.println("Popping on an empty list successfully threw an error");
        }
    }

    @Test
    public void testPeek() {
        Stack peeker = new Stack();
        assertNull("Stack had an unexpected value", peeker.peek());
        peeker.enqueue(1);
        assertEquals("Head had an unexpected value", 1, peeker.peek().value);
        assertEquals("Head had an unexpected pointer", null, peeker.peek().pointer);
        peeker.enqueue(2);
        assertEquals("Head had an unexpected value", 2, peeker.peek().value);
        peeker.enqueue(3);
        assertEquals("Head had an unexpected value", 3, peeker.peek().value);
    }
}
