package testDataStructures.testTrees;

import dataStructures.trees.Node;
import dataStructures.trees.binaryTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static dataStructures.trees.binaryTree.randomNode;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class testBinaryTree {

    @Test
    public void testInstantiate() {
        binaryTree tree = new binaryTree();
        assertNull("Root was not null", tree.root());
    }

    @Test
    public void testInstantiateWithRoot() {
        binaryTree rootedTree = new binaryTree(1);
        assertEquals("Unexpected value at null", 1, rootedTree.root().value);
        assertNull("Left was not null", rootedTree.root().left);
        assertNull("Right was not null", rootedTree.root().right);
    }

    @Test
    public void testAddLeftRight() {
        binaryTree rootedTree = new binaryTree(1);
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
        binaryTree rootedTree = new binaryTree();
        Node root = randomNode();
        Node left = randomNode();
        Node right = randomNode();
        rootedTree.root(root);
        rootedTree.root().left = left;
        rootedTree.root().right = right;

        List<Long> expected = new ArrayList<>();
        expected.add(left.getValue());
        expected.add(root.getValue());
        expected.add(right.getValue());

        List<Long> output = new ArrayList<>();
        output = rootedTree.inOrder(output, rootedTree.root());

        assertEquals("Unexpected head", root, rootedTree.root());
        assertEquals("Unexpected left", left, rootedTree.root().left);
        assertEquals("Unexpected right", right, rootedTree.root().right);
        assertEquals("Unexpected print", expected, output);
    }

    @Test
    public void testPostOrder() {
        binaryTree rootedTree = new binaryTree();
        Node root = randomNode();
        Node left = randomNode();
        Node right = randomNode();
        rootedTree.root(root);
        rootedTree.root().left = left;
        rootedTree.root().right = right;

        List<Long> expected = new ArrayList<>();
        expected.add(left.getValue());
        expected.add(right.getValue());
        expected.add(root.getValue());

        List<Long> output = new ArrayList<>();
        output = rootedTree.postOrder(output, rootedTree.root());

        assertEquals("Unexpected head", root, rootedTree.root());
        assertEquals("Unexpected left", left, rootedTree.root().left);
        assertEquals("Unexpected right", right, rootedTree.root().right);
        assertEquals("Unexpected print", expected, output);
    }

    @Test
    public void testPreOrder() {
        binaryTree rootedTree = new binaryTree();
        Node root = randomNode();
        Node left = randomNode();
        Node right = randomNode();
        rootedTree.root(root);
        rootedTree.root().left = left;
        rootedTree.root().right = right;

        List<Long> expected = new ArrayList<>();
        expected.add(root.getValue());
        expected.add(left.getValue());
        expected.add(right.getValue());

        List<Long> output = new ArrayList<>();
        output = rootedTree.preOrder(output, rootedTree.root());

        assertEquals("Unexpected head", root, rootedTree.root());
        assertEquals("Unexpected left", left, rootedTree.root().left);
        assertEquals("Unexpected right", right, rootedTree.root().right);
        assertEquals("Unexpected print", expected, output);
    }
}
