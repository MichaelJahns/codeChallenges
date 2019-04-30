package dataStructures;

public class App {
    public static void main(String[] args) {
        Psuedoqueue psuedoqueue = new Psuedoqueue();
        psuedoqueue.psuedoEnqueue(1);
        psuedoqueue.psuedoEnqueue(2);
        psuedoqueue.psuedoEnqueue(3);
        psuedoqueue.psuedoEnqueue(4);
        psuedoqueue.psuedoEnqueue(5);
        psuedoqueue.psuedoEnqueue(6);
        psuedoqueue.psudeoDequeue();
        Object inspection = psuedoqueue.print();
        psuedoqueue.psudeoDequeue();
        psuedoqueue.psudeoDequeue();
        psuedoqueue.psudeoDequeue();
        psuedoqueue.psudeoDequeue();
        psuedoqueue.psudeoDequeue();
        Object inspection2 = psuedoqueue.print();
        System.out.println("wait");
        psuedoqueue.psuedoEnqueue(10);
        psuedoqueue.psuedoEnqueue(11);
        psuedoqueue.psuedoEnqueue(12);
        psuedoqueue.psuedoEnqueue(13);
        psuedoqueue.psuedoEnqueue(14);
        Object inspection3 = psuedoqueue.print();
        psuedoqueue.psudeoDequeue();
        Object inspection4 = psuedoqueue.print();
    }

}
