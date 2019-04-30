package testDataStructures;

import dataStructures.Queue;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class testQueue {

    /*
Can successfully enqueue onto a queue
Can successfully enqueue multiple items into a queue
Can successfully dequeue off of a queue the expected value
Can successfully peek into a queue, seeing the expected value
Can successfully empty a queue after multiple dequeues
Can successfully instantiate an empty queue
*/
    @Test
    public void testInstantiateQueue() {
        Queue empty = new Queue();
        assertEquals("Front had an unexpected value", 0, empty.peek().value);
        assertEquals("Tail had an unexpected pointer", null, empty.peer().pointer);
        assertEquals("Queue had an unexpected size", 2, empty.getSize());
    }

    @Test
    public void testEnqueue() {
        Queue testEnqueue = new Queue();
        testEnqueue.enqueue(1);
        assertEquals("Front had an unexpected value", 0, testEnqueue.peek().value);
        assertEquals("Tail had an unexpected value", 1, testEnqueue.peer().value);
        assertEquals("Tail had an unexpected pointer", null, testEnqueue.peer().pointer);
        assertEquals("Queue had an unexpected size", 3, testEnqueue.getSize());
    }

    @Test
    public void testMultipleEnqueue() {
        Queue multipleEnqueues = new Queue();
        multipleEnqueues.enqueue(2);
        multipleEnqueues.enqueue(3);
        multipleEnqueues.enqueue(4);
        multipleEnqueues.enqueue(5);
        int[] expected = {0, 1, 2, 3, 4, 5};
        assertEquals("Front had an unexpected value", 0, multipleEnqueues.peek().value);
        assertEquals("Tail had an unexpected value", 5, multipleEnqueues.peer().value);
        assertEquals("Queue had an unexpected size", 6, multipleEnqueues.getSize());
        assertEquals("Queue had an unexpected print", Arrays.toString(expected), Arrays.toString(multipleEnqueues.printGuts()));
    }

    @Test
    public void testDequeue() {
        Queue testDequeue = new Queue();
        testDequeue.enqueue(2);
        testDequeue.enqueue(3);
        testDequeue.enqueue(4);
        testDequeue.enqueue(5);
        testDequeue.dequeue();
        int[] expected = {1, 2, 3, 4, 5};
        assertEquals("Front had an unexpected value", 1, testDequeue.peek().value);
        assertEquals("Tail had an unexpected value", 5, testDequeue.peer().value);
        assertEquals("Queue had an unexpected size", 5, testDequeue.getSize());
        assertEquals("Queue had an unexpected print", Arrays.toString(expected), Arrays.toString(testDequeue.printGuts()));

    }

    @Test
    public void testEmptyWithDequeue() {
        Queue emptyMe = new Queue();
        emptyMe.enqueue(5);
        emptyMe.enqueue(4);
        emptyMe.enqueue(3);
        emptyMe.enqueue(2);
        emptyMe.enqueue(1);
        emptyMe.dequeue();
        emptyMe.dequeue();
        int[] expectedArray1 = {5, 4, 3, 2, 1};
        assertEquals("Head had an unexpected value", 1, emptyMe.peer().value);
        assertEquals("Stack had an unexpected print", Arrays.toString(expectedArray1), Arrays.toString(emptyMe.printGuts()));
        emptyMe.dequeue();
        emptyMe.dequeue();
        emptyMe.dequeue();
        emptyMe.dequeue();
        try {
            emptyMe.dequeue();
            fail();
        } catch (AssertionError n) {
            System.out.println("Popping on an empty list successfully threw an error");
        }
    }

    @Test
    public void testPeek() {
        Queue peeker = new Queue();
        assertEquals("Front had an unexpected value", 0, peeker.peek().value);
        peeker.enqueue(1);
        assertEquals("Front had an unexpected value", 0, peeker.peek().value);
        peeker.enqueue(2);
        assertEquals("Front had an unexpected value", 0, peeker.peek().value);
        peeker.dequeue();
        assertEquals("Front had an unexpected value", 1, peeker.peek().value);
    }

    @Test
    public void testPeer() {
        Queue peeker = new Queue();
        peeker.enqueue(1);
        assertEquals("Tail had an unexpected value", 1, peeker.peer().value);
        assertEquals("Tail had an unexpected pointer", null, peeker.peer().pointer);
        peeker.enqueue(2);
        assertEquals("Tail had an unexpected value", 2, peeker.peer().value);
        peeker.dequeue();
        assertEquals("Tail had an unexpected value", 2, peeker.peer().value);
    }
}
