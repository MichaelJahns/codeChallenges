package testDataStructures.testGraphs;

import dataStructures.graphs.Graph;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class testGraph {

    @Test
    public void testAddNode() {
        Graph graph = new Graph();
        assertEquals("Graph did not have the expected size", 0, graph.getSize());

        graph.addVertex("A");
        assertEquals("Graph did not have the expected size", 1, graph.getSize());

        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        assertEquals("Graph did not have the expected size", 4, graph.getSize());
    }

    @Test
    public void testAddEdge() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B");
        List<Graph.Vertex> actual1 = graph.getNeighbors("A");
        assertEquals("List had an unexpected size", 1, actual1.size());

        graph.addVertex("C");
        graph.addVertex("D");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "D");

        List<Graph.Vertex> actual2 = graph.getNeighbors("A");
        assertEquals("List had an unexpected size", 3, actual2.size());

        List<Graph.Vertex> actual3 = graph.getNeighbors("D");
        assertEquals("List had an unexpected size", 2, actual3.size());
    }

    @Test
    public void testGetCollection() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        Map collection = graph.getCollection();
        assertEquals("Collection was not expected size", 4, collection.size());
        assertFalse("Collection was unexpectedly empty", collection.isEmpty());
    }

    @Test
    public void testGetNeighbors() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

        List neighborsA = graph.getNeighbors("A");
        List neighborsB = graph.getNeighbors("B");
        List neighborsC = graph.getNeighbors("C");

        assertEquals("Neighbor List had an unexpected size", 2, neighborsA.size());
        assertEquals("Neighbor List had an unexpected size", 1, neighborsB.size());
        assertEquals("Neighbor List had an unexpected size", 1, neighborsC.size());
    }

    @Test
    public void testNeighborsHaveWeight() {

    }

    @Test
    public void testGetSize() {
        Graph graph = new Graph();
        int size1 = graph.getSize();
        assertEquals("Graph had an unexpected size", 0, size1);

        graph.addVertex("A");
        int size2 = graph.getSize();
        assertEquals("Graph had an unexpected size", 1, size2);


        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        int size3 = graph.getSize();
        assertEquals("Graph had an unexpected size", 4, size3);
    }

    @Test
    public void testPrintCollection() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "D");

        String expected = "A:[B, C, D]  B:[A, D]  C:[A]  D:[A, B]  ";
        String print = graph.printGraph();

        assertEquals("Graph had an unexpected size", 4, graph.getSize());
        assertEquals("Graph had an unexpected print", expected, print);
    }

    @Test
    public void testOneNodeOneEdge() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addEdge("A", "A");

        int size = graph.getSize();
        List neighborsA = graph.getNeighbors("A");

        assertEquals("Graph had an unexpected size", 1, size);
        assertEquals("Neighbor Array had an unexpected size", 2, neighborsA.size());
    }

    @Test
    public void testEmptyGraph() {
        Graph graph = new Graph();
        Map expected = new HashMap();
        assertEquals("Graph collection was not as expected", expected, graph.getCollection());
        assertEquals("Collection size was not as expected", 0, graph.getSize());
    }


}
