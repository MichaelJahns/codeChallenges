package dataStructures.graphs;

import java.util.*;

public class Graph {
    private Map<Vertex, List<Vertex>> collection;

    public Graph() {
        this.collection = new HashMap<>();
    }

    public Map<Vertex, List<Vertex>> getCollection() {
        return this.collection;
    }

    public Vertex addVertex(String label) {
        Vertex newVertex = new Vertex(label);
        collection.putIfAbsent(newVertex, new ArrayList<>());
        return newVertex;
    }

    public void removeVertex(String label) {
        Vertex vertex = new Vertex(label);
        collection.values().stream().forEach(e -> e.remove(vertex));
        collection.remove(new Vertex(label));
    }

    public void addEdge(String label1, String label2) {
        Vertex one = new Vertex(label1);
        Vertex two = new Vertex(label2);
        collection.get(one).add(two);
        collection.get(two).add(one);
    }

    public void removeEdge(String label1, String label2) {
        Vertex one = new Vertex(label1);
        Vertex two = new Vertex(label2);
        List<Vertex> connectionsOne = collection.get(one);
        List<Vertex> connectionsTwo = collection.get(two);
        if (connectionsOne != null) connectionsOne.remove(two);
        if (connectionsTwo != null) connectionsTwo.remove(one);
    }

    public List<Vertex> getNeighbors(String label) {
        return collection.get(new Vertex(label));
    }

    public String printGraph() {
        StringBuffer sb = new StringBuffer();
        for (Vertex v : collection.keySet()) {
            sb.append(v);
            sb.append(":");
            sb.append(collection.get(v));
            sb.append("  ");
        }
        return sb.toString();
    }

    public int getSize() {
        return collection.size();
    }

    public String breadthFirstPrint(Vertex head) {
        LinkedList<Vertex> queue = new LinkedList<>();

        List<Vertex> current = collection.get(head);
        collection.
                queue.add(current);

        String output = "";
        while (queue.size() != 0) {
            current = queue.poll();
            output += current.toString() + ", ";

            Iterator<Vertex> iterator = collection.get(current).listIterator();
            while (iterator.hasNext()) {
                Vertex next = iterator.next();
                if (next.isSeen() == false) {
                    next.setSeen(true);
                    queue.add(next);
                }
            }
        }
        return output;
    }
}