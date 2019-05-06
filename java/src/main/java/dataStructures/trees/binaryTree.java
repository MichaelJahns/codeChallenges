package dataStructures.trees;

import java.util.List;

public class binaryTree {
    private Node root;

    public binaryTree() {
        this.root = null;
    }

    public binaryTree(int value) {
        this.root = new Node(value);
    }

    public List<Long> preOrder(List<Long> output, Node node) {
        if (node == null) {
            return null;
        }
        output.add(node.value);

        inOrder(output, node.left);
        inOrder(output, node.right);

        return output;
    }

    public List<Long> inOrder(List<Long> output, Node node) {
        if (node == null) {
            return null;
        }
        inOrder(output, node.left);
        output.add(node.value);
        inOrder(output, node.right);

        return output;
    }

    public List<Long> postOrder(List<Long> output, Node node) {
        if (node == null) {
            return null;
        }
        inOrder(output, node.left);
        inOrder(output, node.right);

        output.add(node.value);

        return output;
    }

    public Node root() {
        return root;
    }

    public void root(Node node) {
        this.root = node;
    }

    // I made this so I wouldn't scream while testing
    public static Node randomNode() {
        Node newNode = new Node((long) (Math.random() * 100));
        return newNode;
    }
}
