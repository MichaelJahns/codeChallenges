package hash.hashtable;

public class HashNode<Key, Value> {
    Key key;
    Value value;

    HashNode<Key, Value> next;

    public HashNode(Key key, Value value) {
        this.key = key;
        this.value = value;
    }
}
