package LinkedList;

import java.util.Arrays;

public class LinkedList {
    Node head;
    int listLength;

    public LinkedList() {
        this.head = null;
        this.listLength = 0;
    }

    public int getHead() {
        Node headNode = this.head;
        return headNode.getValue();
    }

    public Node addToStart(int value) {
        Node newNode = new Node(value, head);
        this.head = newNode;
        this.listLength++;
        return newNode;
    }

    public Node addToEnd(int value) {
        Node current = head;
        while (current.pointer != null) {
            current = current.next();
        }
        Node newNode = new Node(value, null);
        //is this line messing me up if I am adding it to the end of an empty linked list?
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

    public int positionsFromEnd(int k) throws Exception {
        if (k > getSize() || k < 0) {
            throw new Exception("Out of Bounds K Value");
        }
        Node current = head;
        for (int i = 0; i < getSize() - k - 1; i++) {
            current = current.next();
        }
        return current.value;
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


    //this solution is not 0(1) for space. I couldn't figure that one out. Here's my submission just to get submission
    public static LinkedList mergeLists(LinkedList list1, LinkedList list2) {
        Node leader = list1.head;
        Node laggard = list2.head;
        LinkedList output = new LinkedList();

        // I think my add to end has a hard time with empty LL, doing this is just to instantiate the LL before the loop
        // I addressed the above bug, the default Linked List constructor no longer instantiates with an empty node. Check
        // the tests, see if anything broke. This works great. But check anyway.
        output.addToStart(leader.value);
        output.addToEnd(laggard.value);

        int cycles = list1.getSize() > list2.getSize() ? list1.getSize() : list2.getSize();

        for (int i = 0; i < cycles; i++) {
            leader = leader.next();
            laggard = laggard.next();
            if (leader != null) {
                output.addToEnd(leader.value);
            }
            if (laggard != null) {
                output.addToEnd(laggard.value);
            }

        }
        return output;
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
}