package dataStructures.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public class Vertex {
        private String label;

        public Vertex(String label) {
            this.label = label;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + ((label == null) ? 0 : label.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Vertex other = (Vertex) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (label == null) {
                if (other.label != null)
                    return false;
            } else if (!label.equals(other.label))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return label;
        }


        private Graph getOuterType() {
            return Graph.this;
        }
    }
}