package dataStructures.trees;

public class BinarySearchTree extends BinaryTree {

    private Node add(Node node, int value) {
        if (node == null) {
            node = new Node(value);
        } else if (value < (int) node.getValue()) {
            node.left = add(node.left, value);
        } else if (value > (int) node.getValue()) {
            node.right = add(node.right, value);
        }

        return node;
    }

    private static boolean contains(Node node, int target, Boolean isPresent) {
        if (target == (int) node.value) {
            isPresent = true;
        }
        contains(node.left, target, isPresent);
        contains(node.right, target, isPresent);
        return isPresent;
    }

    public static BinarySearchTree generate() {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = new Node(50);
        bst.root(root);
        for (int i = 0; i < 100; i++) {
            bst.add(bst.root(), i);

        }
        return bst;
    }
}
