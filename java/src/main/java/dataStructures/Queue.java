package dataStructures;

public class Queue implements Datastructure {
    Node front;
    Node tail;
    int queueLength;

    public Queue() {
        this.front = null;
        this.tail = null;
        this.queueLength = 0;
    }

    @Override
    public int[] printGuts() {
        Node current = this.tail;
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
