# Linked List
Adds  linked list and node classes. 
Available methods Linked List
getHead(), printGuts(), getSize(), find(int), addToStart(int value), addToEnd(int value), addBefore(int value, int target), addAfter(int value, int target)

Availble methods for Nodes
three constructors, getValue(), setNextNode(), getNextNodes()

Used https://www.youtube.com/watch?v=ch1uQeu0PVY to get some clues on how to get two classes to interact with each other 

## Problem Domain
Write a three methods called addToEnd(), addBefore(), and addAfter(), which creates a new Node in the linked list in various different spaces and orientations.

## Notes
This solution will break at the first index where target = input[i], so for cases where the target is present multiple times only the first index will be returned
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
    
## Approach and Efficiency
### Solutions found
1. Check every index for match

### Efficiency
O(n)

## Whiteboard
Whiteboarded with Merry Cimakasky
[linkedListExtended Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListExtended.jpg)
Whiteboarded with Dana Vors
[linkedListKFromEnd Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/linkedListKFromEnd.jpg)
