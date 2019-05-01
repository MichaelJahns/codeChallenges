package testDataStructures.testAnimalShelter;

import dataStructures.animalShelter.Animal;
import dataStructures.animalShelter.AnimalShelter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class testAnimalShelter {

    @Test
    public void testInstantiateAnimalShelter() {
        AnimalShelter shelter = new AnimalShelter();
        assertNull("Front was not null", shelter.peek());
        assertNull("Tail was not null", shelter.peer());
        assertEquals("Shelter was not empty", 0, shelter.getSize());
    }

    @Test
    public void testOneEnqueue() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("Lacy", "dog");

        assertEquals("Front and Tail should be the same", shelter.peek(), shelter.peer());
        assertEquals("Shelter has an unexpected size", 1, shelter.getSize());
        assertEquals("Animal Node had an unexpected name", "Lacy", shelter.peer().getName());
        assertEquals("Animal Node had an unexpected type", "dog", shelter.peer().getType());
    }

    @Test
    public void testPeekAndPeer() {
        AnimalShelter shelter = new AnimalShelter();
        assertNull("Front had an unexpected pointer", shelter.peek());
        assertNull("Tail had an unexpected pointer", shelter.peer());

        shelter.enqueue("Lacy", "dog");
        assertEquals("Front and Tail should be the same", shelter.peek(), shelter.peer());

        shelter.enqueue("Whisk", "cat");
        assertEquals("Front had an unexpected Animal", "Lacy", shelter.peek().getName());
        assertEquals("Tail had an unexpected Animal", "Whisk", shelter.peer().getName());

        shelter.dequeue();
        assertEquals("Front and Tail should be the same", shelter.peek(), shelter.peer());
    }

    @Test
    public void testMultiplEnqueues() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("Lacy", "dog");
        shelter.enqueue("Whisk", "cat");
        assertEquals("Front had an unexpected Animal", "Lacy", shelter.peek().getName());
        assertEquals("Tail had an unexpected Animal", "Whisk", shelter.peer().getName());

        shelter.enqueue("Butch", "dog");
        shelter.enqueue("Midnight", "cat");
        shelter.enqueue("Isis", "cat");
        assertEquals("Front had an unexpected Animal", "Lacy", shelter.peek().getName());
        assertEquals("Tail had an unexpected Animal", "Isis", shelter.peer().getName());
    }

    @Test
    public void testDefaultDequeue() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("Lacy", "dog");
        shelter.enqueue("Whisk", "cat");
        shelter.dequeue();
        assertEquals("Front had an unexpected Animal", "Whisk", shelter.peer().getName());

        shelter.enqueue("Butch", "dog");
        shelter.enqueue("Midnight", "cat");
        shelter.enqueue("Isis", "cat");
        shelter.dequeue();
        assertEquals("Front had an unexpected Animal", "Butch", shelter.peek().getName());
        assertEquals("Tail had an unexpected Animal", "Isis", shelter.peer().getName());
    }

    @Test
    public void testPrefDequeue() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("Lacy", "dog");
        shelter.enqueue("Whisk", "cat");
        Animal adoptedCat1 = shelter.dequeue("cat");
        assertEquals("Preference was not properly adhered to", "Whisk", adoptedCat1.getName());
        assertEquals("Front had an unexpected Animal", "Lacy", shelter.peek().getName());
        assertEquals("Tail had an unexpected Animal", "Lacy", shelter.peer().getName());

        shelter.enqueue("Isis", "cat");
        shelter.enqueue("Midnight", "cat");
        shelter.enqueue("Stardew", "cat");
        shelter.enqueue("Butch", "dog");
        Animal adoptedDog1 = shelter.dequeue("dog");
        assertEquals("Preference was not properly adhered to", "Lacy", adoptedDog1.getName());
        assertEquals("Front had an unexpected Animal", "Isis", shelter.peek().getName());
        assertEquals("Tail had an unexpected Animal", "Butch", shelter.peer().getName());

        Animal adoptedDog2 = shelter.dequeue("dog");
        assertEquals("Preference was not properly adhered to", "Butch", adoptedDog2.getName());
        assertEquals("Front had an unexpected Animal", "Isis", shelter.peek().getName());
        assertEquals("Tail had an unexpected Animal", "Stardew", shelter.peer().getName());


    }

    @Test
    public void testEmptyWithDequeue() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("Lacy", "dog");
        shelter.enqueue("Whisk", "cat");
        shelter.dequeue();
        assertEquals("Front had an unexpected Animal", "Whisk", shelter.peek().getName());
        shelter.dequeue();
        assertNull("Front unexpectedly had an Animal", shelter.peek());
        shelter.dequeue();
        shelter.dequeue();
        assertNull("Front unexpectedly had an Animal", shelter.peek());
        shelter.enqueue("Butch", "dog");
        assertEquals("Front had an unexpected Animal", "Butch", shelter.peek().getName());
    }
}
