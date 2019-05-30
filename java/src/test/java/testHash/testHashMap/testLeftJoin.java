package testHash.testHashMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static hash.hashmap.LeftJoin.simpleLeftJoin;
import static java.util.Objects.deepEquals;
import static org.junit.Assert.assertEquals;

public class testLeftJoin {

    @Test
    public void testHappy() {
        HashMap<String, String> left = new HashMap<>();
        left.put("Marcus", "Hammer");
        left.put("Demetri", "Martin");
        left.put("Fornacus", "Pastri");
        left.put("Michael", "Jay");

        HashMap<String, String> right = new HashMap<>();
        right.put("Marcus", "Ballard");
        right.put("Demetri", "Wyoming");
        right.put("Michael", "Fremont");
        right.put("Yen", "e-ifarir");

        List results = simpleLeftJoin(left, right);
        List expected = new ArrayList();
        String[] row1 = {"Marcus", "Hammer", "Ballard"};
        String[] row2 = {"Demetri", "Martin", "Wyoming"};
        String[] row3 = {"Fornacus", "Pastri", null};
        String[] row4 = {"Michael", "Jay", "Fremont"};
        expected.add(row1);
        expected.add(row2);
        expected.add(row3);
        expected.add(row4);

        // A type of assert i found when researching how to compare matrix(s)
        deepEquals(expected, results);
        assertEquals("Matrix had an unexpected size", expected.size(), results.size());
    }

    @Test
    public void empty() {
        HashMap<String, String> left = new HashMap<>();
        HashMap<String, String> right = new HashMap<>();
        List results = simpleLeftJoin(left, right);
        List expected = new ArrayList();
        deepEquals(results, expected);
        assertEquals("Matrix had an unexpected size", expected.size(), results.size());


    }

}
