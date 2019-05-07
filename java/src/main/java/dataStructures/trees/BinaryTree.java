package dataStructures.trees;

import java.util.List;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Object value) {
        this.root = new Node(value);
    }

    public List<Object> preOrder(List<Object> output, Node node) {
        if (node == null) {
            return null;
        }
        output.add(node.value);

        preOrder(output, node.left);
        preOrder(output, node.right);

        return output;
    }

    public List<Object> inOrder(List<Object> output, Node node) {
        if (node == null) {
            return null;
        }
        inOrder(output, node.left);
        output.add(node.value);
        inOrder(output, node.right);

        return output;
    }

    public List<Object> postOrder(List<Object> output, Node node) {
        if (node == null) {
            return null;
        }
        postOrder(output, node.left);
        postOrder(output, node.right);

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
