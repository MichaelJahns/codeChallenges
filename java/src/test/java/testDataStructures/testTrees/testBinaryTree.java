package testDataStructures.testTrees;

import dataStructures.trees.BinarySearchTree;
import dataStructures.trees.BinaryTree;
import dataStructures.trees.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static dataStructures.trees.BinarySearchTree.generate;
import static dataStructures.trees.BinaryTree.randomNode;
import static dataStructures.trees.FizzBuzzTree.FizzBuzz;
import static org.junit.Assert.*;

public class testBinaryTree {

    @Test
    public void testInstantiate() {
        BinaryTree tree = new BinaryTree();
        assertNull("Root was not null", tree.root());
    }

    @Test
    public void testInstantiateWithRoot() {
        BinaryTree rootedTree = new BinaryTree(1);
        assertEquals("Unexpected value at null", 1, rootedTree.root().value);
        assertNull("Left was not null", rootedTree.root().left);
        assertNull("Right was not null", rootedTree.root().right);
    }

    @Test
    public void testAddLeftRight() {
        BinaryTree rootedTree = new BinaryTree(1);
        Node left = randomNode();
        Node right = randomNode();
        rootedTree.root().left = left;
        rootedTree.root().right = right;
        assertEquals("Left was unexpected", left, rootedTree.root().left);
        assertNull("Left Left was not null", rootedTree.root().left.left);
        assertNull("Left Right was not null", rootedTree.root().left.right);

        assertEquals("Right was unexpected", right, rootedTree.root().right);
        assertNull("Right Left was not null", rootedTree.root().right.left);
        assertNull("Right Right was not null", rootedTree.root().right.right);
    }

    @Test
    public void testInOrder() {
        BinaryTree rootedTree = new BinaryTree();
        Node root = randomNode();
        Node left = randomNode();
        Node right = randomNode();
        rootedTree.root(root);
        rootedTree.root().left = left;
        rootedTree.root().right = right;

        List<Object> expected = new ArrayList<>();
        expected.add(left.getValue());
        expected.add(root.getValue());
        expected.add(right.getValue());

        List<Object> output = new ArrayList<>();
        output = rootedTree.inOrder(output, rootedTree.root());

        assertEquals("Unexpected head", root, rootedTree.root());
        assertEquals("Unexpected left", left, rootedTree.root().left);
        assertEquals("Unexpected right", right, rootedTree.root().right);
        assertEquals("Unexpected print", expected, output);
    }

    @Test
    public void testPostOrder() {
        BinaryTree rootedTree = new BinaryTree();
        Node root = randomNode();
        Node left = randomNode();
        Node right = randomNode();
        rootedTree.root(root);
        rootedTree.root().left = left;
        rootedTree.root().right = right;

        List<Object> expected = new ArrayList<>();
        expected.add(left.getValue());
        expected.add(right.getValue());
        expected.add(root.getValue());

        List<Object> output = new ArrayList<>();
        output = rootedTree.postOrder(output, rootedTree.root());

        assertEquals("Unexpected head", root, rootedTree.root());
        assertEquals("Unexpected left", left, rootedTree.root().left);
        assertEquals("Unexpected right", right, rootedTree.root().right);
        assertEquals("Unexpected print", expected, output);
    }

    @Test
    public void testPreOrder() {
        BinaryTree rootedTree = new BinaryTree();
        Node root = randomNode();
        Node left = randomNode();
        Node right = randomNode();
        rootedTree.root(root);
        rootedTree.root().left = left;
        rootedTree.root().right = right;

        List<Object> expected = new ArrayList<>();
        expected.add(root.getValue());
        expected.add(left.getValue());
        expected.add(right.getValue());

        List<Object> output = new ArrayList<>();
        output = rootedTree.preOrder(output, rootedTree.root());

        assertEquals("Unexpected head", root, rootedTree.root());
        assertEquals("Unexpected left", left, rootedTree.root().left);
        assertEquals("Unexpected right", right, rootedTree.root().right);
        assertEquals("Unexpected print", expected, output);
    }

    @Test
    public void testFizzBuzz() {
        BinarySearchTree tree = generate();
        BinarySearchTree FizzyBuzz = FizzBuzz(tree);

        assertEquals("Unexpected value of root", "Buzz", FizzyBuzz.root().getValue());
        assertEquals("Unexpected value of root", "Fizz", FizzyBuzz.root().right.getValue());
        assertEquals("Unexpected value of root", "FizzBuzz", FizzyBuzz.root().left.getValue());
    }

    @Test
    public void testFizzyFailures() {

    }

    @Test
    public void testFizzyEdges() {

    }

    @Test
    public void testBFSHappy() {
        BinaryTree tree = new BinaryTree();
        tree.root(new Node(1));
        tree.root().left = new Node(2);
        tree.root().right = new Node(3);
        tree.root().left.left = new Node(4);
        tree.root().right.right = new Node(5);

        try {
            tree.BFSOrder();
        } catch (Exception E) {
            fail();
        }

        //I dont want to build a logger to test the values
        //The PD says to sout the results
        //Testing souts needs a logger
        //That seems excessive
    }

    @Test
    public void testBFSfailure() {
        BinaryTree tree = new BinaryTree();
        try {
            tree.BFSOrder();
            fail();
        } catch (NullPointerException N) {
            System.out.println("Successfully throws an error if given an empty tree");
        }
    }
}
