package dataStructures.animalShelter;

public class Animal {
    public String name;
    public String type;
    public Animal pointer;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        this.pointer = null;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public Animal next() {
        return this.pointer;
    }

    public void setNextNode(Animal a) {
        this.pointer = a;
    }

}
