package testDataStructures;

import dataStructures.LinkedList;
import org.junit.Test;

import java.util.Arrays;

import static dataStructures.LinkedList.mergeLists;
import static junit.framework.TestCase.*;

public class testLinkedList {

    @Test
    public void testInstantiate() {
        LinkedList empty = new LinkedList();
        try {
            empty.getHead();
            fail();
        } catch (NullPointerException n) {
            System.out.println("Successfully threw an error when getting the head of an empty LL");
        }
        assertEquals("Linked list length <> expected", 0, empty.getSize());

        int[] expectedPrint = {};
        assertEquals("Unexpected Print", Arrays.toString(expectedPrint), Arrays.toString(empty.printGuts()));

    }

    @Test
    public void testAddtoStart() {
        LinkedList addToStart = new LinkedList();
        addToStart.addToStart(7);
        //True
        assertEquals("Vertex with with specified value not found", 7, addToStart.find(7).getValue());
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
        assertEquals("Head wasn't as expected", 9, addToEnd.getHead());
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
        assertEquals("Head wasn't as expected", 9, addBefore.getHead());
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
        assertEquals("Head wasn't as expected", 9, addAfter.getHead());
        assertEquals("List formatting was different than expected", Arrays.toString(expected), Arrays.toString(addAfter.printGuts()));
        assertTrue("List was an unexpected size", 4 == addAfter.getSize());
    }

    @Test
    public void testHead() {
        LinkedList header = new LinkedList();
        header.addToStart(1);
        assertEquals("The head node wasn't as expected", 1, header.getHead());

        header.addToStart(2);
        header.addToStart(3);
        assertEquals("The head node wasn't as expected", 3, header.getHead());

        header.addToStart(4);
        header.addToStart(5);
        assertEquals("The head node wasnt as expected", 5, header.getHead());
    }

    @Test
    public void testMultipleInsertions() {
        LinkedList multipleInsertions = new LinkedList();
        assertTrue("List was an unexpected size", 0 == multipleInsertions.getSize());
        assertFalse("List was an unexpected size", 0 != multipleInsertions.getSize());

        multipleInsertions.addToStart(35);
        multipleInsertions.addToStart(4);
        assertTrue("List was an unexpected size", 2 == multipleInsertions.getSize());
        assertFalse("List was an unexpected size", 2 != multipleInsertions.getSize());

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
        int[] expected1 = {};
        int[] actual1 = arrangedList.printGuts();
        assertEquals("List was formatting wasn't as expected", Arrays.toString(expected1), Arrays.toString(actual1));

        arrangedList.addToStart(0);
        arrangedList.addToStart(1);
        arrangedList.addToStart(2);
        arrangedList.addToStart(3);
        arrangedList.addToStart(4);
        arrangedList.addToStart(5);
        int[] expected2 = {5, 4, 3, 2, 1, 0};
        int[] actual2 = arrangedList.printGuts();
        assertEquals("List was formatting wasn't as expected", Arrays.toString(expected2), Arrays.toString(actual2));

        arrangedList.addToStart(6);
        arrangedList.addToStart(7);
        arrangedList.addToStart(8);
        arrangedList.addToStart(9);
        arrangedList.addToStart(10);
        int[] expected3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] actual3 = arrangedList.printGuts();
        assertEquals("List was formatting wasn't as expected", Arrays.toString(expected3), Arrays.toString(actual3));
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

        // K > Length of Linked List
        try {
            testFromEnd.positionsFromEnd(10);
            fail();
        } catch (Exception e) {
            String expected = "Out of Bounds K Value";
            assertEquals("Unexpected Exception", expected, e.getMessage());
        }
        //K && Linked List Length = 1
        try {
            int expected = 5;
            int actual = testFromEnd.positionsFromEnd(0);
            assertEquals("Unexepted someting", expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //K != Positive Integer
        try {
            testFromEnd.positionsFromEnd(10);
            fail();
        } catch (Exception e) {
            String expected = "Out of Bounds K Value";
            assertEquals("Unexpected Exception", expected, e.getMessage());
        }
        //k = length of dataStructures
        int expected = 0;
        int actual = testFromEnd.positionsFromEnd(6);
        assertEquals("Return didnt match expected", expected, actual);

        //k <= length of dataStructures
        int expected2 = 1;
        int actual2 = testFromEnd.positionsFromEnd(4);
        assertEquals("Return didnt match expected", expected2, actual2);
    }

    @Test
    public void testMergeLists() {
        LinkedList one = new LinkedList();
        one.addToStart(9);
        one.addToStart(7);
        one.addToStart(5);
        one.addToStart(3);
        one.addToStart(1);

        LinkedList two = new LinkedList();
        two.addToStart(10);
        two.addToStart(8);
        two.addToStart(6);
        two.addToStart(4);
        two.addToStart(2);

        LinkedList expected = new LinkedList();
        expected.addToStart(1);
        expected.addToEnd(2);
        expected.addToEnd(3);
        expected.addToEnd(4);
        expected.addToEnd(5);
        expected.addToEnd(6);
        expected.addToEnd(7);
        expected.addToEnd(8);
        expected.addToEnd(9);
        expected.addToEnd(10);
        LinkedList actual = mergeLists(one, two);

        assertEquals("Lists did not merge as expected", Arrays.toString(expected.printGuts()), Arrays.toString(actual.printGuts()));
        assertTrue("Merged List does not have expected length", actual.getSize() == 10);
        assertFalse("Merged List does not have expected length", actual.getSize() != 10);
    }
}