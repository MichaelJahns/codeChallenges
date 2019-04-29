# Linked List
Used https://www.youtube.com/watch?v=ch1uQeu0PVY to get some clues on how to get two classes to interact with each other 

## Problem Domain
Implement your own linked list with associated utility functions
Implement your own Stack
Implement your own Queue


## Approach and Efficiency
| Node Methods                            | Functionality                                                                                                                        | Space | Time | 
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------|------|
| `getValue()`                            | returns the value of a Node                                                                                                          | O(1)  | O(1) |
| `setNextNode(Node N)`                   | sets Node to point at target node N                                                                                                  | O(1)  | O(1) |
| `next()`                                | returns the Node the current Node is pointing towards                                                                                | O(1)  | O(1) |

| Linked List Methods                     | Functionality                                                                                                                        | Space | Time |
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

| Stack Methods                           |                                                                                                                                      | Space | Time |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------|------|
| `peek()`                                | returns the Node at the stacks head                                                                                                  | O(1)  | O(1) |
| `printGuts()`                           | flips through a stack and makes a int[] to print to the console                                                                 | O(n)  | O(n) |
| `getSize()`                             | returns an int representing the number of nodes in the stack                                                                         | O(1)  | O(1) |
| `push(int value)`                       | creates a new node with a value of value, places the new node atop the stack, reassigns head to the new node                         | O(1)  | O(1) |
| `pop()`                                 | returns and removes from the stack the current head                                                                                  | O(1)  | O(1) |

| Queue Methods                           |                                                                                                                                      | Space | Time |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------|------|
| `peek()`                                | returns the Node at the queues front                                                                                                 | O(1)  | O(1) |
| `peer()`                                | returns the Node at the queues tail                                                                                                  | O(1)  | O(1) |
| `printGuts()`                           | flips through a queue and makes a int[] to print to the console                                                                      | O(n)  | O(n) |
| `getSize()`                             | returns an int representing the number of nodes in the queue                                                                         | O(1)  | O(1) |
| `enqueue(int value)`                    | creates a new Node with a value of value, and places that node as the the new tail in a queue                                        | O(1)  | O(1) |
| `dequeue()`                             | returns and removes from the queue the current front                                                                                 | O(1)  | O(1) |

## Whiteboard
Whiteboarded with Merry Cimakasky
[linkedListExtended Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListExtended.jpg)

Whiteboarded with Dana Vors
[linkedListKFromEnd Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListKFromEnd.jpg)

Whiteboarded with Nicole Kalbfelisch
[linkedListMergeLists](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/mergeLists.jpg)