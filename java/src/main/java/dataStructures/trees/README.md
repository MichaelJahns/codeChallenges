### Binary Tree

| Binary Tree Methods               | Functionality                                                                                                 |
|-----------------------------------|---------------------------------------------------------------------------------------------------------------|
| `inOrder(List<Long>, Node node)`  | Returns a `List<Long>` holding the value of all Nodes in the tree ordered Left Branches, root, Right Branches |  
| `preOrder(List<Long>, Node node)` | Returns a `List<Long>` holding the value of all Nodes in the tree ordered Node, Left Branches, Right Branches |
| `postOrder(List<Long>, Node node)`| Returns a `List<Long>` holding the value of all Nodes in the tree orderd Left Branches, Right Branches, Root  |
| `BFSOrder()`                      | Prints to the console every node in the tree following a left to right, breadth first approach                |
| `findMaxBTree()`                  | Returns an int value matching the highest value in the tree.                                                  | 

| Binary Search Tree Methods  | Functionality                                                                                                                 |
|-----------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| `add(int value)`            | Adds a node with value int as a leaf on the appropriate branches                                                              |
| `contains(int target)`      | Searchs the Binary Search Tree for a int value                                                                                |
| `generate()`                | Generates a Binary Search Tree with value 0-100. I made this just to reduce how much I had to manually fill a tree            | 
| `FizzBuzz(BinarySearchTree)`| Transforms a Binary Search Tree into a FizzBuzz Tree where factors of 3 are now Fizz, 5 are now Buzz, and 15 are now FizzBuzz |

### Research
https://codereview.stackexchange.com/questions/60145/which-fizzbuzz-is-better-and-why

Looking for how to get a Java Object to hold either a String or int, and still be able to compare it, I found the above resource which
has the super optimized switch case solution with a standard array based fizzbuzz

https://www.geeksforgeeks.org/level-order-tree-traversal/

I could not conceptualize how a BFS would work in my head, the above resource was very helpful in getting me into the realm of understanding
### Assets
[FizzBuzzTree Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/FizzBuzz.jpg)

[BreadthFirstTravesals Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/BreadthFirstTravesal.jpg)

[FindMaxValueBinaryTree Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/findMaxValueBTree.jpg)
