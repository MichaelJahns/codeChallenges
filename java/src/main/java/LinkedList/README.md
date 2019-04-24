# Linked List
Adds  linked list and node classes. 
Available methods Linked List
getHead(), printGuts(), getSize(), find(int), addToStart(int value), addToEnd(int value), addBefore(int value, int target), addAfter(int value, int target), positionFromEnd(int)

Availble methods for Nodes
three constructors, getValue(), setNextNode(), getNextNodes()

Used https://www.youtube.com/watch?v=ch1uQeu0PVY to get some clues on how to get two classes to interact with each other 

## Problem Domain
Write a three methods called addToEnd(), addBefore(), and addAfter(), which creates a new Node in the linked list in various different spaces and orientations.
Write a method called kFromEnd, which returns the value of the Node that is k from the end of the linked list.

## Notes
This solution will break at the first index where target = input[i], so for cases where the target is present multiple times only the first index will be returned
Because my linked knows who to activate and not who activated it, traveling backwards can be difficult, luckily k turns from the end can be expressed as size-k-1 from the start which allows us the same functionality. 
## Visual

### Solution addToEnd
    input value
    find node where node.point == null
    newNode(value)
    this.pointer <- newNode
    newNode.pointer <- null

### Solution addBefore
    input value and target
    find node.pointer == target
    newNode(value)
    this.pointer <- newNode
    newNode.pointer <- target

### Solution addAfter
    input value, target
    find node == target
    newNode(value)
    newNode.pointer <- this.pointer
    this.point <- newNode
    
### Solution KFromEnd
    input k
    find LL size
    Travel down linkedlist size-k-1 times
    return that nodes value
    
## Approach and Efficiency
O(n)

## Whiteboard
Whiteboarded with Merry Cimakasky
[linkedListExtended Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListExtended.jpg)

Whiteboarded with Dana Vors
[linkedListKFromEnd Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListKFromEnd.jpg)
