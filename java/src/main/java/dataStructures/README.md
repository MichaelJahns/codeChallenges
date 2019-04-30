# Data Structures
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

### Stack

A stack will add/remove Nodes to/from the head. This can be rephrased saying it follows a LIFO and FILO concept. The first Node added to the stack will be the last to be resolved, and the last
Node added to the stack will be the first resolved. A real world example of this would be the call stack in our IDE's.

| Stack Methods                           | Functionality                                                                                                                        | Space | Time |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------|------|
| `peek()`                                | returns the Node at the stacks head                                                                                                  | O(1)  | O(1) |
| `printGuts()`                           | flips through a stack and makes a int[] to print to the console                                                                 | O(n)  | O(n) |
| `getSize()`                             | returns an int representing the number of nodes in the stack                                                                         | O(1)  | O(1) |
| `push(int value)`                       | creates a new node with a value of value, places the new node atop the stack, reassigns head to the new node                         | O(1)  | O(1) |
| `pop()`                                 | returns and removes from the stack the current head                                                                                  | O(1)  | O(1) |

### Queue

A Queue will add Nodes to the tail, and remove Nodes from the front. This can be rephrased saying it follows a LILO concept, where the last Node added to Queue is the last to be resolved, and 
and a FIFO concept where the first Node added to the Queue will be the first to be resolved. A real world example of this would be a line at a store. 

| Queue Methods                           |         Functionality                                                                                                                | Space | Time |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------|------|
| `peek()`                                | returns the Node at the queues front                                                                                                 | O(1)  | O(1) |
| `peer()`                                | returns the Node at the queues tail                                                                                                  | O(1)  | O(1) |
| `printGuts()`                           | flips through a queue and makes a int[] to print to the console                                                                      | O(n)  | O(n) |
| `getSize()`                             | returns an int representing the number of nodes in the queue                                                                         | O(1)  | O(1) |
| `enqueue(int value)`                    | creates a new Node with a value of value, and places that node as the the new tail in a queue                                        | O(1)  | O(1) |
| `dequeue()`                             | returns and removes from the queue the current front                                                                                 | O(1)  | O(1) | 

### Psuedoqueue

A Psuedoqueue is two stacks, named Encode and Decode, that emmulate a Queue. Meaning that instead LIFO and FILO concepts, follows LILO and FIFO concepts.
This is possible due to a private method `reverse()` that will move and flip the Nodes from one stack to another as need be. 
Reverse will move the Nodes to Decode when a Dequeue is ordered. Nodes in the Decode Stack are arranged oldest to newest with the first Node added at the head, this means that a `pop()` will remove the first Nodes added. 
Reverse will move the Nodes to Encode when a Enqueue is ordered. Nodes in the Encode Stack are arranged newest to oldest with the last Node added at the head, this means that a `push(int value)` will add a Node keeping the order of the Stack. 


| Psuedoqueue Methods                     | Functinality                                                                                                                         | Space | Time |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------|------|
| `psuedoEnqueue(int value)`              | If decodes head is not null, will start by running reverse(decode) before pushing a New Node on top of Encode                        | O(1)  | O(n) |
| `psuedoDequeue()   `                    | If encodes head is not null, will start by running reverse(encode) before poping a Node off of Decode                                | O(1)  | O(n) |

## Resources 
[Linked Lists Explained](https://www.youtube.com/watch?v=ch1uQeu0PVY) video made by Joe James, I used this resource to get some context on how to get two classes to interact with each other 

## Whiteboard
Whiteboarded with Merry Cimakasky
[linkedListExtended Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListExtended.jpg)

Whiteboarded with Dana Vors
[linkedListKFromEnd Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListKFromEnd.jpg)

Whiteboarded with Nicole Kalbfelisch
[linkedListMergeLists](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/mergeLists.jpg)

Whiteboarded with Jessica Zuchowski
[Psuedoqueue](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/psuedoQueue.jpg)
