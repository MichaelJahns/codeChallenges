# Linked List
Used https://www.youtube.com/watch?v=ch1uQeu0PVY to get some clues on how to get two classes to interact with each other 

## Problem Domain
Implement your own linked list with associated utility functions


## Approach and Efficiency
| Linked List Methods                     | Functionality                                                                                                                       | Space | Time |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------|------|
| `addToStart(int value)`                 | creates a new Node with a value of value, places the new node at the front of the Linked List and points it at the previous head     | O(1)  | O(n) |
| `addToEnd(int value)`                   | creates a new Node with a value of value, points the last node in the Linked List at the new node                                    | O(1)  | O(n) |
| `addBefore(int value, int target) `     | creates a new Node with a value of value, and points the node before the target at the new node                                      | O(1)  | O(n) |
| `addAfter(int value, int target)`       | creates a new Node with a value of value, and points the node at target at the new Node                                              | O(1)  | O(n) |
| `positionsFromEnd(int k)`               | returns the value of the Node that is k Nodes from the end of the Linked List                                                        | O(1)  | O(n) |
| `mergeLists(LinkedList 1, LinkedList 2` | returns a new Linked List which is a zippered compliation of two Linked List                                                         | O(n)  | O(n) |
| `printGuts()`                           | flips through a linked list and makes a int[] to print to the console                                                                | O(n)  | O(n) |
| `getSize()`                             | returns an int representing the number of nodes in a Linked List                                                                     | O(1)  | O(1) |
| `getHead()`                             | returns the Node that is at the head of a Linked List                                                                                | O(1)  | O(1) |
| `find(int target) `                     | returns the Node with value of target                                                                                                | O(1)  | O(n) | 

| Node Methods                            | Functionality                                                                                                                         | Space | Time | 
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------|------|
| `getValue()`                            | returns the value of a Node                                                                                                          | O(1)  | O(1) |
| `setNextNode(Node N)`                   | sets Node to point at target node N                                                                                                  | O(1)  | O(1) |
| `next()`                                | returns the Node the current Node is pointing towards                                                                                | O(1)  | O(1) |


## Whiteboard
Whiteboarded with Merry Cimakasky
[linkedListExtended Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListExtended.jpg)

Whiteboarded with Dana Vors
[linkedListKFromEnd Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListKFromEnd.jpg)

Whiteboarded with Nicole Kalbfelisch
[linkedListMergeLists](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/mergeLists.jpg)
