package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public Node pointer;
    public int value;

    public Node() {
    }

    public Node(int val) {
        value = val;
    }

    public Node(int val, Node next) {
        value = val;
        pointer = next;
    }

    public int getValue() {
        return this.value;
    }

    public void setNextNode(Node n) {
        this.pointer = n;
    }

    public Node next() {
        return this.pointer;
    }

    public List<Integer> followThread() {
        Node current = this;
        List<Integer> output = new ArrayList();
        while (current != null) {
            output.add(current.getValue());
            current = current.next();
        }
        for (Integer i : output) {
            System.out.println(i);
        }
        return output;
    }

}
