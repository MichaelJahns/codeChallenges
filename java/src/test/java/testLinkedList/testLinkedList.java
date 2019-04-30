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
        assertEquals("Linked list length <> expected", expected, actual);
    }

    @Test
    public void testAddtoStart() {
        LinkedList addToStart = new LinkedList();
        addToStart.addToStart(7);
        //True
        assertEquals("Node with with specified value not found", 7, addToStart.find(7).getValue());
        assertTrue("List has an unexpected number of items", 1 == addToStart.getSize());
        //False
        assertEquals("List has isn't returning null for items not present", null, addToStart.find(14));
        assertFalse("List has an unexpected number of items", 1 != addToStart.getSize());
    }

    @Test
    public void testAddtoEnd() {
        LinkedList addToEnd = new LinkedList();
        addToEnd.addToStart(7);
        addToEnd.addToStart(8);
        addToEnd.addToStart(9);
        addToEnd.addToEnd(0);

        int[] expected = {9, 8, 7, 0};
        //True
        assertEquals("List formatting different than expected", Arrays.toString(expected), Arrays.toString(addToEnd.printGuts()));
        assertTrue("List was an unexpected size", 4 == addToEnd.getSize());
    }

    @Test
    public void testAddBefore() {
        LinkedList addBefore = new LinkedList();
        addBefore.addToStart(7);
        addBefore.addToStart(8);
        addBefore.addToStart(9);
        addBefore.addBefore(10, 7);

        int[] expected = {9, 8, 10, 7};
        //True
        assertEquals("List formatting different than expected", Arrays.toString(expected), Arrays.toString(addBefore.printGuts()));
        assertTrue("List was an unexpected size", 4 == addBefore.getSize());
    }

    @Test
    public void testAddAfter() {
        LinkedList addAfter = new LinkedList();
        addAfter.addToStart(7);
        addAfter.addToStart(8);
        addAfter.addToStart(9);
        addAfter.addAfter(10, 8);

        int[] expected = {9, 8, 10, 7};
        //True
        assertEquals("List formatting was different than expected", Arrays.toString(expected), Arrays.toString(addAfter.printGuts()));
        assertTrue("List was an unexpected size", 4 == addAfter.getSize());
    }

    @Test
    public void testHead() {
        LinkedList header = new LinkedList();
        header.addToStart(1);
        header.addToStart(2);
        header.addToStart(3);
        header.addToStart(4);
        header.addToStart(5);

        assertEquals("The head node wasnt as expected", 5, header.getHead());
    }

    @Test
    public void testMultipleInsertions() {
        LinkedList multipleInsertions = new LinkedList();
        multipleInsertions.addToStart(35);
        multipleInsertions.addToStart(4);
        multipleInsertions.addToStart(7);
        multipleInsertions.addToStart(-12);
        multipleInsertions.addToStart(0);

        assertTrue("List was an unexpected size", 5 == multipleInsertions.getSize());
        assertFalse("List was an unexpected size", 5 != multipleInsertions.getSize());
    }

    @Test
    public void testFindValue() {
        LinkedList finder = new LinkedList();
        finder.addToStart(7);
        finder.addToStart(4);
        finder.addToStart(35);
        //True
        assertEquals("Couldnt find value", 7, finder.find(7).getValue());
        assertEquals("Couldnt find value", 4, finder.find(4).getValue());
        assertEquals("Couldnt find value", 35, finder.find(35).getValue());
        //False
        assertEquals("Unexpected value found", null, finder.find(104));
        assertEquals("Unexpected value found", null, finder.find(42));
        assertEquals("Unexpected value found", null, finder.find(-8));
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

        assertEquals("List was formatting wasn't as expected", Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testPositionsFromEnd() throws Exception {
        LinkedList testFromEnd = new LinkedList();
        testFromEnd.addToStart(5);
        testFromEnd.addToStart(4);
        testFromEnd.addToStart(3);
        testFromEnd.addToStart(2);
        testFromEnd.addToStart(1);
        testFromEnd.addToStart(0);


        //k = length of LinkedList
        int expected = 0;
        int actual = testFromEnd.positionsFromEnd(6);
        assertEquals("Return didnt match expected", expected, actual);

        //k <= length of LinkedList
        int expected2 = 1;
        int actual2 = testFromEnd.positionsFromEnd(4);
        assertEquals("Return didnt match expected", expected2, actual2);
    }

    @Test
    public void testPostitionsFromEndEdge() throws Exception {
        LinkedList exceptional = new LinkedList();
        exceptional.addToStart(10);

        //k > length of LinkedList expect exception
        //How do I assert an exception?
        // assertEquals(1, exceptional.positionsFromEnd(10));
        // fail();

        // Length of Linked List = 1
        assertEquals(10, exceptional.positionsFromEnd(0));

        //k != positive integer
        // How do I assert an exception?
//        assertEquals(1, exceptional.positionsFromEnd(-2));
//        fail();

    }
}