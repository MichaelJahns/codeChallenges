package dataStructures.graphs;

public class EdgeSimple {
    private String destination;
    private int destinationID;
    private int weight;

    public EdgeSimple(String to, int toID, int weight) {
        this.destination = to;
        this.destinationID = toID;
        this.weight = weight;
    }

    public int getDestinationID() {
        return destinationID;
    }

    public int getWeight() {
        return weight;
    }

    public String getDestination() {
        return destination;
    }
}
