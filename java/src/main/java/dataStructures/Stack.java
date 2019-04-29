package dataStructures;

public class Stack implements Datastructure {
    Node head;
    int stackHeight;

    public Stack() {
        this.head = null;
        this.stackHeight = 0;
    }

    public Node peek() {
        return this.head;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value, head);
        this.head = newNode;
        this.stackHeight++;
    }

    public Node pop() {
        if (this.peek() == null) {
            System.out.println("Cannot Pop off of an empty list");
            return null;
        }
        Node output = head;
        head = head.next();
        output.pointer = null;
        this.stackHeight--;
        return output;

    }

    @Override
    public int[] printGuts() {
        Node current = this.head;
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
        return this.stackHeight;
    }
}
