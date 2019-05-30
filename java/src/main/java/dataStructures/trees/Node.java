package dataStructures.trees;

public class Node {
    public Node left;
    public Node right;
    public Object value;

    public Node() {
    }

    public Node(Object value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node(Object value, Node left, Node right) {
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

    public Object getValue() {
        return this.value;
    }

}
