package dataStructures;

public class Queue implements Datastructure {
    Node front;
    Node tail;
    int queueLength;

    public Queue() {
        Node tail = new Node(1, null);
        Node head = new Node(0, tail);
        this.front = head;
        this.tail = tail;
        this.queueLength = 2;
    }

    public Node peek() {
        return this.front;
    }

    public Node peer() {
        return this.tail;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value, null);
        tail.pointer = newNode;
        tail = newNode;
        queueLength++;
    }

    public Node dequeue() {
        if (this.peek() == null) {
            System.out.println("Cannot Pop off of an empty list");
            return null;
        }
        Node output = front;
        front = front.next();
        output.pointer = null;
        this.queueLength--;
        //Tails value wouldn't have gotten updated without the following if
        if (front == null) {
            tail = null;
        }
        return output;
    }

    @Override
    public int[] printGuts() {
        Node current = this.front;
        int[] guts = new int[this.getSize()];

        for (int i = 0; i < this.getSize(); i++) {
            guts[i] = current.getValue();
            current = current.next();
        }
//        System.out.println(Arrays.toString(guts));
        return guts;
    }

    @Override
    public int getSize() {
        return this.queueLength;
    }
}
