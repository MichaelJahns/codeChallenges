package dataStructures.trees;

public class Node {
    public Node left;
    public Node right;
    public Object value;

    public Node() {
    }

    public Node(long value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node(long value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public long getValue() {
        return this.value;
    }

}
