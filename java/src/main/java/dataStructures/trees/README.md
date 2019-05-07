### Binary Tree

| Binary Tree Methods               | Functionality                                                                                                 |
|-----------------------------------|---------------------------------------------------------------------------------------------------------------|
| `inOrder(List<Long>, Node node)`  | Returns a `List<Long>` holding the value of all Nodes in the tree ordered Left Branches, root, Right Branches |       |
| `preOrder(List<Long>, Node node)` | Returns a `List<Long>` holding the value of all Nodes in the tree ordered Node, Left Branches, Right Branches |
| `postOrder(List<Long>, Node node)`| Returns a `List<Long>` holding the value of all Nodes in the tree orderd Left Branches, Right Branches, Root  |


| Binary Search Tree Methods | Functionality                                                                                                      |
|----------------------------|--------------------------------------------------------------------------------------------------------------------|
| `add(int value)`           | Adds a node with value int as a leaf on the appropriate branches                                                   |
| `contains(int target)`     | Searchs the Binary Search Tree for a int value                                                                     |
| `generate()`               | Generates a Binary Search Tree with value 0-100. I made this just to reduce how much I had to manually fill a tree | 


### Research
https://codereview.stackexchange.com/questions/60145/which-fizzbuzz-is-better-and-why
I found this link with an optimized Switch case solution to a standard array based fizz buzz.
I found this accidentally looking for how in Java you can have an object hold a String or int, and still be able to compare it 
