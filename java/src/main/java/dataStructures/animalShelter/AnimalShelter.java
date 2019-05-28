package dataStructures.animalShelter;

public class AnimalShelter {
    Animal front;
    Animal tail;
    int queueLength;

    public AnimalShelter() {
        this.front = null;
        this.tail = null;
        this.queueLength = 0;
    }

    public Animal peek() {
        return this.front;
    }

    public Animal peer() {
        return this.tail;
    }

    public void enqueue(String name, String type) {
        Animal animal = new Animal(name, type);
        // I think this if statement is a better work around for filling empty Queues than my last solution
        if (front == null && tail == null) {
            front = animal;
            tail = animal;
        }
        tail.pointer = animal;
        tail = animal;
        queueLength++;
    }

    public Animal dequeue() {
        if (this.peek() == null) {
            return null;
        }
        Animal adopted = front;
        front = front.next();
        adopted.pointer = null;
        queueLength--;
        if (this.peek() == null) {
            tail = null;
        }
        return adopted;
    }

    //This will return the
    public Animal dequeue(String pref) {
        Animal current = front;
        if (current.getType() == pref) {
            Animal output = front;
            front = front.next();
            output.pointer = null;
            queueLength--;
            return output;
        } else {
            while (current.next() != null) {
                if (current.next().getType() == pref) {
                    Animal output = current.next();
                    current.pointer = output.pointer;
                    output.pointer = null;
                    if (front.pointer == null) {
                        tail = front;
                    }
                    queueLength--;
                    return output;
                }
                current = current.next();
            }
        }
        return null;

    }

    public String[] printGuts() {
        Animal current = this.front;
        String[] guts = new String[this.getSize()];

        for (int i = 0; i < this.getSize(); i++) {
            guts[i] = current.getName();
            current = current.next();
        }
//        System.out.println(Arrays.toString(guts));
        return guts;
    }

    public int getSize() {
        return this.queueLength;
    }
}

