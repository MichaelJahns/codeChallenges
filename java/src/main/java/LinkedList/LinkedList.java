package LinkedList;

import java.util.Arrays;

public class LinkedList {
    Node head;
    int listLength;

    public LinkedList() {
        head = new Node();
        listLength = 0;
    }

    public int getHead() {
        Node headNode = this.head;
        return headNode.getValue();
    }

    public int[] printGuts() {
        Node current = this.head;
        int[] guts = new int[this.getSize()];

        for (int i = 0; i < this.getSize(); i++) {
            guts[i] = current.getValue();
            current = current.getNextNode();
        }
        System.out.println(Arrays.toString(guts));
        return guts;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addToStart(17);
        ll.addToStart(5);
        ll.addToStart(10);
        ll.addToStart(45);
        ll.addToStart(24);
        ll.addToStart(11);
        ll.getHead();
    }

    public Node addToStart(int value) {
        Node newNode = new Node(value, head);
        this.head = newNode;
        this.listLength++;
        return newNode;
    }

    public void setSize(int s) {
        this.listLength = s;
    }

    public int getSize() {
        return this.listLength;
    }

    public Node find(int value) {
        Node current = this.head;

        while (current != null) {
            if (current.getValue() == value) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public boolean remove(int data) {
        Node thisNode = this.head;
        Node prevNode = null;

        while (thisNode != null) {
            if (prevNode != null) {
                prevNode.setNextNode(thisNode.getNextNode());
            } else {
                this.head = null;
                this.setSize(this.getSize() - 1);
                return true;
            }
            prevNode = thisNode;
            thisNode = thisNode.getNextNode();
        }
        return false;
    }

    public class Node {
        private Node pointer;
        private int value;

        private Node() {
        }

        private Node(int val) {
            value = val;
        }

        private Node(int val, Node next) {
            value = val;
            pointer = next;
        }

        public int getValue() {
            return this.value;
        }

        private void setNextNode(Node n) {
            this.pointer = n;
        }

        private Node getNextNode() {
            return this.pointer;
        }
    }
}