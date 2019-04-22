package testLinkedList;

import LinkedList.LinkedList;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class testLinkedList {

    @Test
    public void testInstantiate() {
        LinkedList empty = new LinkedList();
        int expected = 0;
        int actual = empty.getSize();
        assertEquals("Linked list length =/= expected", expected, actual);
    }

    @Test
    public void testInsertion() {
        LinkedList oneInsertion = new LinkedList();
        oneInsertion.addToStart(7);
        //True
        assertEquals(7, oneInsertion.find(7).getValue());
        assertTrue(1 == oneInsertion.getSize());
        //False
        assertEquals(null, oneInsertion.find(14));
        assertFalse(1 != oneInsertion.getSize());
    }

    @Test
    public void testHead() {
        LinkedList header = new LinkedList();
        header.addToStart(1);
        header.addToStart(2);
        header.addToStart(3);
        header.addToStart(4);
        header.addToStart(5);

        assertEquals(5, header.getHead());
    }

    @Test
    public void testMultipleInsertions() {
        LinkedList multipleInsertions = new LinkedList();
        multipleInsertions.addToStart(35);
        multipleInsertions.addToStart(4);
        multipleInsertions.addToStart(7);
        multipleInsertions.addToStart(-12);
        multipleInsertions.addToStart(0);

        assertTrue(5 == multipleInsertions.getSize());
        assertFalse(5 != multipleInsertions.getSize());
    }

    @Test
    public void testFindValue() {
        LinkedList finder = new LinkedList();
        finder.addToStart(7);
        finder.addToStart(4);
        finder.addToStart(35);
        //True
        assertEquals(7, finder.find(7).getValue());
        assertEquals(4, finder.find(4).getValue());
        assertEquals(35, finder.find(35).getValue());
        //False
        assertEquals(null, finder.find(104));
        assertEquals(null, finder.find(42));
        assertEquals(null, finder.find(-8));
    }

    @Test
    public void testPrintGuts() {
        LinkedList arrangedList = new LinkedList();
        arrangedList.addToStart(0);
        arrangedList.addToStart(1);
        arrangedList.addToStart(2);
        arrangedList.addToStart(3);
        arrangedList.addToStart(4);
        arrangedList.addToStart(5);
        arrangedList.addToStart(6);
        arrangedList.addToStart(7);
        arrangedList.addToStart(8);
        arrangedList.addToStart(9);
        arrangedList.addToStart(10);

        int[] expected = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] actual = arrangedList.printGuts();

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}