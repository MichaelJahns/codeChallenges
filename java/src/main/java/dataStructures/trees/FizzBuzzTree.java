package dataStructures.trees;

import java.util.List;

public class FizzBuzzTree {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        FizzBuzz(tree);
    }

    public static BinaryTree FizzBuzz(BinaryTree tree) {
        Node node = tree.root();
        List<String> output = null;
        BinaryTree FizzyTree = FizzBuzzRec(node, tree);
        return FizzyTree;

    }


    //https://codereview.stackexchange.com/questions/60145/which-fizzbuzz-is-better-and-why
    // I found this hyper optimization researching how I am supposed to have one object try and hold two different types of Objects
    private static BinaryTree FizzBuzzRec(Node node, BinaryTree tree) {
        if (node == null) {
            return null;
        }
        switch (node.value % 15) {
            case 0:
                node.value = "FizzBuzz";
                break;
            case 3:
            case 6:
            case 9:
            case 12:
                node.value = "Fizz";
                break;
            case 5:
            case 10:
                node.value = "Buzz";
                break;
            default:
        }

        FizzBuzzRec(node.left, tree);
        FizzBuzzRec(node.right, tree);

        //I need to return a tree.
        //  This is not a method of BinaryTree, so I cant use this to modify in place
        //  I could fucking pass in a Tree and just pass it around which is sort of lame. This looks better now that Im not passing around a list unnecessarily
        //  Do I need to output at a Tree in a return at all? Does directly modifying Node modify the associated tree? Is /that/ the utility of data structures I havent been able to see until just now?
        return tree;
    }
}
