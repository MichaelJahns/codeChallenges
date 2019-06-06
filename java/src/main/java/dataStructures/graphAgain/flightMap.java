package dataStructures.graphAgain;

import java.util.LinkedList;

public class flightMap {
    static class Edge {
        int fromLocation;
        int toLocation;
        int weight;

        public Edge(int from, int to, int weight) {
            this.fromLocation = from;
            this.toLocation = to;
            this.weight = weight;
        }
    }

    public static class Graph {
        int airports;
        LinkedList<Edge>[] adjList;

        public Graph(int vertices) {
            this.airports = vertices;
            adjList = new LinkedList[vertices];

            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int from, int to, int weight) {
            Edge edge = new Edge(from, to, weight);
            adjList[from].addFirst(edge);
        }

        public String quickFlight(int[] itinerary, int start) {
            return "output";
        }

    }
}
