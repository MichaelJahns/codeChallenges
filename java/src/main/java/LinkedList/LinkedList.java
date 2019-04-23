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

    public Node addToEnd(int value) {
        Node current = head;
        while (current.pointer != null) {
            current = current.next();
        }
        Node newNode = new Node(value, null);
        current.setNextNode(newNode);
        this.listLength++;
        return newNode;
    }

    public Node addBefore(int value, int target) {
        Node current = head;
        while (current.next().getValue() != target) {
            current = current.next();
        }
        Node newNode = new Node(value, current.next());
        current.pointer = newNode;
        this.listLength++;
        return newNode;
    }

    public Node addAfter(int value, int target) {
        Node current = head;
        while (current.getValue() != target) {
            current = current.next();
        }
        Node newNode = new Node(value, current.pointer);
        current.pointer = newNode;
        this.listLength++;
        return newNode;
    }

    public int[] printGuts() {
        Node current = this.head;
        int[] guts = new int[this.getSize()];

        for (int i = 0; i < this.getSize(); i++) {
            guts[i] = current.getValue();
            current = current.next();
        }
        System.out.println(Arrays.toString(guts));
        return guts;
    }

    public static void main(String[] args) {
        LinkedList addToEnd = new LinkedList();
        addToEnd.addToStart(7);
        addToEnd.addToStart(8);
        addToEnd.addToStart(9);
        addToEnd.addBefore(10, 7);

        addToEnd.printGuts();
    }

    public Node addToStart(int value) {
        Node newNode = new Node(value, head);
        this.head = newNode;
        this.listLength++;
        return newNode;
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
            current = current.next();
        }
        return null;
    }

//    public boolean remove(int data) {
//        Node thisNode = this.head;
//        Node prevNode = null;
//
//        while (thisNode != null) {
//            if (prevNode != null) {
//                prevNode.setNextNode(thisNode.next());
//            } else {
//                this.head = null;
//                this.setSize(this.getSize() - 1);
//                return true;
//            }
//            prevNode = thisNode;
//            thisNode = thisNode.next();
//        }
//        return false;
//    }

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

        public Node next() {
            return this.pointer;
        }
    }
}