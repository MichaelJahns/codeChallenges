package dataStructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class VertexSimple {
    String name;
    private List<EdgeSimple> edges;

    public VertexSimple(String name) {
        this.name = name;
        edges = new ArrayList<>();
    }

    public void addEdge(String to, int toID, int weight) {
        EdgeSimple newEdge = new EdgeSimple(to, toID, weight);
        edges.add(newEdge);
    }

    public List<EdgeSimple> getEdges() {
        return this.edges;
    }


}
