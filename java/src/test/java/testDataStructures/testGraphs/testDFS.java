package testDataStructures.testGraphs;

import dataStructures.Graph;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class testDFS {

    @Test
    public void testBasic() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 4);
        graph.addEdge(0, 3);
        List actual = graph.driver(0);
        List<Integer> expected = Arrays.asList(0, 1, 2, 4, 3);
        assertEquals("Return was not as expected", expected, actual);
        assertEquals("Return size was not as expected", 5, actual.size());
    }

    @Test
    public void testCycle() {
        Graph graph = new Graph(5);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        List actual = graph.driver(1);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals("Return was not as expected", expected, actual);
        assertEquals("Return size was not as expected", 4, actual.size());
    }

    @Test
    public void testLong() {
        Graph graph = new Graph(6);
        graph.addEdge(0, 3);
        graph.addEdge(3, 5);
        graph.addEdge(5, 4);
        graph.addEdge(4, 1);
        graph.addEdge(1, 2);

        List actual = graph.driver(0);
        List<Integer> expected = Arrays.asList(0, 3, 5, 4, 1, 2);
        assertEquals("Return was not as expected", expected, actual);
        assertEquals("Return size was not as expected", 6, actual.size());
    }

    @Test
    public void testFragmented() {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.addEdge(4, 5);
        graph.addEdge(5, 6);

        List actual = graph.driver(0);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3);
        assertEquals("Return was not as expected", expected, actual);
        assertEquals("Return size was not as expected", 4, actual.size());
    }

    @Test
    public void testIsolated() {
        Graph graph = new Graph(1);
        graph.addEdge(0, 0);

        List actual = graph.driver(0);
        List<Integer> expected = Arrays.asList(0);
        assertEquals("Return was not as expected", expected, actual);
        assertEquals("Return size was not as expected", 1, actual.size());
    }

    @Test
    public void testEmpty() {
        Graph graph = new Graph(1);

        List actual = graph.driver(0);
        List<Integer> expected = Arrays.asList(0);
        // It seems I am still returning an array even with no edges
        assertEquals("Return was not as expected", expected, actual);
        assertEquals("Return size was not as expected", 1, actual.size());

    }

}
