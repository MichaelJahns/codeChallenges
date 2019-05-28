package hashtable;

import java.util.ArrayList;

public class HashTable<Key, Value> {
    private ArrayList<HashNode<Key, Value>> bucketArray;
    private int numBuckets;
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;
        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private int getBucketIndex(Key key) {
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        return index;
    }

    public Value remove(Key key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<Key, Value> head = bucketArray.get(bucketIndex);

        HashNode<Key, Value> prev = null;
        while (head != null) {
            if (head.key.equals(key)) break;
            prev = head;
            head = head.next;
        }
        if (head == null) return null;
        size--;
        if (prev != null) prev.next = head.next;
        else bucketArray.set(bucketIndex, head.next);
        return head.value;
    }

    public Value get(Key key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<Key, Value> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null;
    }

    public void add(Key key, Value value) {
        int bucketIndex = getBucketIndex(key);
        HashNode<Key, Value> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<Key, Value> newNode = new HashNode<Key, Value>(key, value);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        //This will increase the size of the hash table if we go beyond
        // a threshold. I dont know how necessary this code is.
        // it seems like it doubles the number of buckets if capacity goes over like 70%?
        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<Key, Value>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++) {
                bucketArray.add(null);
            }
            for (HashNode<Key, Value> node : temp) {
                while (node != null) {
                    add(node.key, node.value);
                    node = node.next;
                }
            }
        }
    }
}
