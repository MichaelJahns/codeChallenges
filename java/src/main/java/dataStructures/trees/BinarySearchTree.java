package dataStructures.trees;

public class BinarySearchTree extends BinaryTree {
    private Node add(Node node, int value) {
        if (node == null) {
            node = new Node(value);
        } else if (value < node.getValue()) {
            node.left = add(node.left, value);
        } else if (value > node.getValue()) {
            node.right = add(node.right, value);
        }

        return node;
    }

    private static boolean contains(Node node, int target, Boolean isPresent) {
        if (node.value == target) {
            isPresent = true;
        }
        contains(node.left, target, isPresent);
        contains(node.right, target, isPresent);
        return isPresent;
    }
}
