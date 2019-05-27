package testDataStructures;

import dataStructures.Psuedoqueue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class testPsuedoQueue {
    @Test
    public void testEmptyPsuedoQueue() {
        Psuedoqueue empty = new Psuedoqueue();
        assertNull("Decode was not initialized as empty", empty.getDecode().peek());
        assertNull("Encode was not initialized as empty", empty.getEncode().peek());
    }

    @Test
    public void testPsuedoEnqueue() {
        Psuedoqueue testEnqueue = new Psuedoqueue();
        testEnqueue.psuedoEnqueue(10);
        assertEquals("Encode had an unexpected size", 1, testEnqueue.getEncode().getSize());
        assertEquals("Decode had an unexpected size", 0, testEnqueue.getDecode().getSize());
        assertEquals("Encode had an unexpected head", 10, testEnqueue.getEncode().peek().value);
        assertNull("Decode wasn't empty", testEnqueue.getDecode().peek());
    }

    @Test
    public void testMultipleEnqueue() {
        Psuedoqueue testManyEnqueue = new Psuedoqueue();
        testManyEnqueue.psuedoEnqueue(10);
        testManyEnqueue.psuedoEnqueue(11);
        testManyEnqueue.psuedoEnqueue(12);
        assertNull("Decode wasn't empty", testManyEnqueue.getDecode().peek());
        assertEquals("Encode had an unexpected head", 12, testManyEnqueue.getEncode().peek().value);
        assertEquals("Encode had an unexpected size", 3, testManyEnqueue.getEncode().getSize());


        testManyEnqueue.psuedoEnqueue(13);
        testManyEnqueue.psuedoEnqueue(14);
        testManyEnqueue.psuedoEnqueue(15);
        assertNull("Decode wasn't empty", testManyEnqueue.getDecode().peek());
        assertEquals("Encode had an unexpected head", 15, testManyEnqueue.getEncode().peek().value);
        assertEquals("Encode had an unexpected size", 6, testManyEnqueue.getEncode().getSize());
    }

    @Test
    public void testDequeue() {
        Psuedoqueue testDequeue = new Psuedoqueue();
        testDequeue.psuedoEnqueue(10);
        testDequeue.psuedoEnqueue(11);
        testDequeue.psuedoEnqueue(12);
        testDequeue.psuedoEnqueue(13);
        testDequeue.psuedoEnqueue(14);
        testDequeue.psuedoEnqueue(15);
        assertNull("Decode wasn't empty", testDequeue.getDecode().peek());
        assertEquals("Decode has an unexpected size", 0, testDequeue.getDecode().getSize());
        assertEquals("Encode had an unexpected head", 15, testDequeue.getEncode().peek().value);
        assertEquals("Encode had an unexpected size", 6, testDequeue.getEncode().getSize());

        testDequeue.psudeoDequeue();
        assertNull("Encode wasn't empty", testDequeue.getEncode().peek());
        assertEquals("Encode has an unexpected size", 0, testDequeue.getEncode().getSize());
        assertEquals("Decode had an unexpected head", 11, testDequeue.getDecode().peek().value);
        assertEquals("Decode had an unexpected size", 5, testDequeue.getDecode().getSize());

        testDequeue.psudeoDequeue();
        testDequeue.psudeoDequeue();
        testDequeue.psudeoDequeue();
        assertNull("Encode wasn't empty", testDequeue.getEncode().peek());
        assertEquals("Encode has an unexpected size", 0, testDequeue.getEncode().getSize());
        assertEquals("Decode had an unexpected head", 14, testDequeue.getDecode().peek().value);
        assertEquals("Decode had an unexpected size", 2, testDequeue.getDecode().getSize());

    }

    @Test
    public void testReverse() {
        Psuedoqueue testReverse = new Psuedoqueue();
        testReverse.psuedoEnqueue(5);
        testReverse.psuedoEnqueue(4);
        testReverse.psuedoEnqueue(3);
        testReverse.psuedoEnqueue(2);
        testReverse.psuedoEnqueue(1);
        //We expect that after every operation, one stack will be empty, and the other stack will be full.
        //Enqueues will have decode empty and encode filled
        //Dequeue will have encode empty and decode filled
        assertNull("Decode wasn't empty", testReverse.getDecode().peek());
        assertEquals("Decode has an unexpected size", 0, testReverse.getDecode().getSize());
        assertEquals("Encode had an unexpected head", 1, testReverse.getEncode().peek().value);
        assertEquals("Encode had an unexpected size", 5, testReverse.getEncode().getSize());

        testReverse.psudeoDequeue();
        assertNull("Encode wasn't empty", testReverse.getEncode().peek());
        assertEquals("Encode has an unexpected size", 0, testReverse.getEncode().getSize());
        assertEquals("Decode had an unexpected head", 4, testReverse.getDecode().peek().value);
        assertEquals("Decode had an unexpected size", 4, testReverse.getDecode().getSize());

        testReverse.psuedoEnqueue(1);
        assertNull("Decode wasn't empty", testReverse.getDecode().peek());
        assertEquals("Decode has an unexpected size", 0, testReverse.getDecode().getSize());
        assertEquals("Encode had an unexpected head", 1, testReverse.getEncode().peek().value);
        assertEquals("Encode had an unexpected size", 5, testReverse.getEncode().getSize());
    }
}
