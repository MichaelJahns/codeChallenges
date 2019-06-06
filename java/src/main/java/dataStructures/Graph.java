package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    private int Vertexes;

    private java.util.LinkedList<Integer>[] adjacency;

    public Graph(int vertexes) {
        this.Vertexes = vertexes;
        adjacency = new LinkedList[vertexes];
        // Populate every index with another LinkedList
        for (int i = 0; i < vertexes; i++) {
            adjacency[i] = new java.util.LinkedList<>();
        }
    }

    public void addEdge(int from, int to) {
        adjacency[from].add(to);
    }

    public List driver(int head) {
        boolean[] visited = new boolean[Vertexes];
        List output = new ArrayList<>();
        recurDFS(head, visited, output);
        return output;
    }

    public void recurDFS(int index, boolean[] visited, List output) {
        visited[index] = true;
        output.add(index);
        Iterator<Integer> iter = adjacency[index].listIterator();
        while (iter.hasNext()) {
            int next = iter.next();
            if (!visited[next]) recurDFS(next, visited, output);
        }
    }

}
