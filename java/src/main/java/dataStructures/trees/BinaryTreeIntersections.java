package dataStructures.trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BinaryTreeIntersections {
    public static List driver(Node head1, Node head2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1 = recursion(head1, set1);
        set2 = recursion(head2, set2);
        List output = compareHashset(set1, set2);
        return output;
    }

    public static HashSet recursion(Node node, HashSet set) {
        if (node == null) {
            return null;
        }
        set.add(node.getValue());
        recursion(node.left, set);
        recursion(node.right, set);

        return set;
    }

    public static List compareHashset(HashSet<Integer> set1, HashSet<Integer> set2) {
        List output = new ArrayList();
        for (int value : set1) {
            if (set2.contains(value)) {
                output.add(value);
            }
        }
        return output;
    }
}
