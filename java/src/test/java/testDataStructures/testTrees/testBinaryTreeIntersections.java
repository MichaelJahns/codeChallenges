package testDataStructures.testTrees;

import dataStructures.trees.BinaryTree;
import dataStructures.trees.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static dataStructures.trees.BinaryTreeIntersections.driver;
import static org.junit.Assert.*;

public class testBinaryTreeIntersections {
    @Test
    public void testHappy() {
        BinaryTree factorsOfEight = new BinaryTree();
        Node node1 = new Node(8);
        factorsOfEight.root(node1);
        factorsOfEight.root().left = new Node(4);
        factorsOfEight.root().right = new Node(2);
        factorsOfEight.root().left.left = new Node(2);
        factorsOfEight.root().right.right = new Node(2);

        BinaryTree factorsOfSixtyfour = new BinaryTree();
        Node node2 = new Node(64);
        factorsOfSixtyfour.root(node2);
        factorsOfSixtyfour.root().left = new Node(32);
        factorsOfSixtyfour.root().right = new Node(2);
        factorsOfSixtyfour.root().left.left = new Node(16);
        factorsOfSixtyfour.root().right.right = new Node(2);
        factorsOfSixtyfour.root().left.left.left = new Node(8);
        factorsOfSixtyfour.root().left.left.right = new Node(2);
        factorsOfSixtyfour.root().left.left.left.left = new Node(4);
        factorsOfSixtyfour.root().left.left.left.right = new Node(2);
        factorsOfSixtyfour.root().left.left.left.left.left = new Node(2);
        factorsOfSixtyfour.root().left.left.left.left.right = new Node(2);

        List actual = driver(node1, node2);
        List expected = new ArrayList();
        expected.add(2);
        expected.add(4);
        expected.add(8);

        assertNotNull(actual);
        assertEquals("Intersections had an unexpected size", expected.size(), actual.size());
        assertEquals("Intersections were not listed as expected", expected.toString(), actual.toString());
    }

    @Test
    public void testEdge() {
        BinaryTree factorsOfEight = new BinaryTree();
        Node node1 = new Node(8);
        factorsOfEight.root(node1);
        factorsOfEight.root().left = new Node(4);
        factorsOfEight.root().right = new Node(2);
        factorsOfEight.root().left.left = new Node(2);
        factorsOfEight.root().right.right = new Node(2);

        BinaryTree factorsOfSixtyfour = new BinaryTree();
        Node node2 = new Node(64);
        factorsOfSixtyfour.root(node2);
        factorsOfSixtyfour.root().left = new Node(32);
        factorsOfSixtyfour.root().right = new Node(2);
        factorsOfSixtyfour.root().left.left = new Node(16);
        factorsOfSixtyfour.root().right.right = new Node(2);
        factorsOfSixtyfour.root().left.left.left = new Node(8);
        factorsOfSixtyfour.root().left.left.right = new Node(2);
        factorsOfSixtyfour.root().left.left.left.left = new Node(4);
        factorsOfSixtyfour.root().left.left.left.right = new Node(2);
        factorsOfSixtyfour.root().left.left.left.left.left = new Node(2);
        factorsOfSixtyfour.root().left.left.left.left.right = new Node(2);

        //Because we are using hashsets as our data structure repeats are lost, so that if
        // you wanted a data structure that has this as expected, where duplicates are counted
        // another approach would be needed
        List actual = driver(node1, node2);
        List expected = new ArrayList();
        expected.add(2);
        expected.add(2);
        expected.add(2);
        expected.add(4);
        expected.add(8);

        assertNotNull(actual);
        assertNotEquals("Intersections had an unexpected size", expected.size(), actual.size());
        assertNotEquals("Intersections were not listed as expected", expected.toString(), actual.toString());
    }

    @Test
    public void testNoIntersections() {
        //Cant actually
        BinaryTree notEmpty = new BinaryTree();
        Node node1 = new Node(8);
        notEmpty.root(node1);
        notEmpty.root().left = new Node(4);
        notEmpty.root().right = new Node(2);
        notEmpty.root().left.left = new Node(2);
        notEmpty.root().right.right = new Node(2);

        Node empty = new Node(64);
        List actual = driver(node1, empty);
        List expected = new ArrayList();

        assertNotNull(actual);
        assertEquals("Intersections had an unexpected size", expected.size(), actual.size());
        assertEquals("Intersections were not listed as expected", expected.toString(), actual.toString());
    }
}
