package testHashTable;

import hashtable.HashTable;
import org.junit.Test;

import static org.junit.Assert.*;

public class testHashTable {

    @Test
    public void testDefaultConstructor() {
        HashTable<String, Integer> table = new HashTable<>();
        assertTrue("table was unexpectedly not empty", table.isEmpty());
        assertEquals("table was unexpectedly not empty", 0, table.size());
    }

    @Test
    public void testAddOne() {
        HashTable<String, Integer> table = new HashTable<>();
        table.add("Mane", 4);
        assertEquals("key/value was not added to the table", 1, table.size());
        assertFalse("table was unexpectedly empty", table.isEmpty());
    }

    @Test
    public void testCollision() {
        HashTable<String, Integer> table = new HashTable<>();
        table.add("mane", 2);
        table.add("name", 2);
        table.add("amen", 2);
        table.add("enam", 2);
        assertEquals("Collisions were not handled properly", 4, table.size());
        assertFalse("table was unexpectedly empty", table.isEmpty());
    }

    @Test
    public void testGet() {
        HashTable<String, Integer> table = new HashTable<>();
        table.add("Bezos", 4);
        table.add("quarm", 8);
        table.add("meaty", 2);
        table.add("Kwelm", 1);
        int kwelm = table.get("Kwelm");
        int quarm = table.get("quarm");
        int Bezos = table.get("Bezos");

        assertEquals(1, kwelm);
        assertEquals(8, quarm);
        assertEquals(4, Bezos);

    }

    @Test
    public void testRemoves() {
        HashTable<String, Integer> table = new HashTable<>();
        table.add("mane", 12);
        table.add("name", 2);
        int index = table.get("mane");
        assertEquals(2, table.size());
        table.remove("mane");
        assertEquals(1, table.size());
        table.get("mane");

    }

}
