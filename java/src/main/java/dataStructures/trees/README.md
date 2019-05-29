# Binary Tree Challenges

## Binary Tree 
#### Problem Domain
Given two binary trees, return an array that contains their intersections, values that appear on both trees.

Making any kind of visual will be awful.

###

| Function & Inputs      | Outputs       | functionality                                                                                                               |
|------------------------|---------------|-----------------------------------------------------------------------------------------------------------------------------|
| driver(node 1, node2)  | List<Integers>| Calls both other associated functions, and provides declaration space for the Hashsets in order to get the correct results  |
| recursion(node, set)   | Hashset       | Will completley crawl a Binary Tree and add every value to a Hashset, preorder Depthfirst, but i dont think that matters    |
| compareHash(set1, set2)| List<Integers>| Compares every value in set1 against set2, adds intersections to output list                                                | 

#### Approach
I choose not to use arrays because of the weirdness in java about declaring their size, I had no idea how many intersections wed have and so I elected to use a Hashset approach.
The major downside of which, is that repeat intersections are not counted twice. 

Space `O(n)^2`
Time `O(n)^2`
