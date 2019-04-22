package LinkedList;

public class LinkedList {
    Node head;
    int listLength;

    public LinkedList() {
        head = new Node();
        listLength = 0;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println("Linked List " + ll.getSize());

        System.out.println(ll.getSize());
        ll.add(17);
        ll.add(5);
        System.out.println("19   " + ll.find(35));
        System.out.println("20   " + ll.find(5).getValue());
//        ll.add(10);
//        System.out.println(ll.find(17).getData());
//        ll.remove(5);
//        System.out.println(ll.getSize());
//        System.out.println(ll.find(17));
    }

    public Node add(int value) {
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
        Node thisNode = this.head;

        while (thisNode != null) {
            if (thisNode.getValue() == value)
                return thisNode;
            thisNode = thisNode.getNextNode();
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
        private Node nextNode;
        private int value;

        private Node() {
        }

        private Node(int val) {
            value = val;
        }

        private Node(int val, Node next) {
            value = val;
            nextNode = next;
        }

        public int getValue() {
            return this.value;
        }

        private void setNextNode(Node n) {
            this.nextNode = n;
        }

        private Node getNextNode() {
            return this.nextNode;
        }

    }
}