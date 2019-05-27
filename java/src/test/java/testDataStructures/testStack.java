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
        testPush.push(1);
        assertEquals("Head had an unexpected value", 1, testPush.peek().value);
        assertEquals("Head had an unexpected pointer", null, testPush.peek().pointer);
        testPush.push(2);
        assertEquals("Head had an unexpected value", 2, testPush.peek().value);
    }

    @Test
    public void testMultiplePush() {
        Stack testMulitplePush = new Stack();
        testMulitplePush.push(10);
        testMulitplePush.push(9);
        testMulitplePush.push(8);

        int[] expectedArray1 = {8, 9, 10};
        assertEquals("Head had an unexpected value", 8, testMulitplePush.peek().value);
        assertEquals("Stack had an unexpected print", Arrays.toString(expectedArray1), Arrays.toString(testMulitplePush.printGuts()));

        testMulitplePush.push(7);
        testMulitplePush.push(6);
        testMulitplePush.push(5);
        testMulitplePush.push(4);
        testMulitplePush.push(3);
        testMulitplePush.push(2);
        testMulitplePush.push(1);
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
        emptyMe.push(5);
        emptyMe.push(4);
        emptyMe.push(3);
        emptyMe.push(2);
        emptyMe.push(1);
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
        peeker.push(1);
        assertEquals("Head had an unexpected value", 1, peeker.peek().value);
        assertEquals("Head had an unexpected pointer", null, peeker.peek().pointer);
        peeker.push(2);
        assertEquals("Head had an unexpected value", 2, peeker.peek().value);
        peeker.push(3);
        assertEquals("Head had an unexpected value", 3, peeker.peek().value);
    }
}
