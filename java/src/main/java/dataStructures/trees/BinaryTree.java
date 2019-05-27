package dataStructures.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Object value) {
        this.root = new Node(value);
    }

    public static int findMax(BinaryTree tree) {
        Node node = tree.root();
        int output = findMaxRecursive(node);
        return output;
    }

    public static int findMaxRecursive(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int current = (int) node.getValue();
        int left = findMaxRecursive(node.left);
        int right = findMaxRecursive(node.right);

        //If the return from left of right nodes is larger than the current
        //Overwrite current with the value of left or right, as appropriate.
        current = current < left ? left : current;
        current = current < right ? right : current;
        return current;
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

    public void BFSOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.getValue());
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
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
