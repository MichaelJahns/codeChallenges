# Graphs

#Problem Domain
Implement your own adjacency list Graph

Tested Functions

| function                              | return       | functionality                                                              |
|---------------------------------------|--------------|----------------------------------------------------------------------------|
| addVertex(String label)               | Vertex       | Adds a vertex with a label of label to the colleciton with no neighbors    |
| addEdge(String label1, String label2) | void         | Makes two Vertexs already in the collection become neighbors               |
| getNeighbors(String label)            | List<Vertex> | Returns a List filled with every neighbor of the vertex with label "label" |
| printGraph()                          | String       | Prints the collection in a more readable way                               |
| getSize()                             | int          | Returns the total number of vertex's in the collection                     |
| breadthFirstPrint()                   | String       | Doesnt properly assign and/or read that a vertex has previously been seen  |  


### Resources
After code review it became obvious that I had researched and used a comparitively complicated solution, resolving its complexity with todays additional requirements has proven very problematic, I ran out of time today trying to figure out breadthFirstPrint()'s odd behavior.

[baeldung graphs](https://www.baeldung.com/java-graphs)

I really struggled with this one, I was constantly having problems where Id be following one tutorial or guide trying to understand, and unfaillingly there would
be one aspect where the tutorial was painfully unclear, that piece would not only be essential but also all other tutorials, because they took a different approach,
wouldn't provide any clarity. 

I ended up basically just rewriting this entire codebase trying to understand
[eugenp github](https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java/src/main/java/com/baeldung/graph)

[whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/graphBreadthFirst.jpg)


