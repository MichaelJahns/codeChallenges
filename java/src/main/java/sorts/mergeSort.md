# Lecture Notes: Merge Sort
Merge sort is fairly fast sort that has a Log of N speed no matter how wonky the array is. It is expensive space wise but relatively cheap speed wise. 
There are literally like 10 pointers in the implementation.

## Learning Objectives
Merge Sort
*how?
*why?

## Lecture Flow
Why Mergesort?
- pros
- cons
How it works and usecases. 
Q/A

### Diagram

`[ 3 , 7 , 4 , 2 , 0 , 1 , 9 , 6 , 8 , 5 ]`
Unsorted Array

`[ 0 , 2 , 3 , 4 , 7]``[ 1 , 5 , 6 , 8 , 9 ]`
Two sorted halves

`[ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ]`
Sorted  halves combined and sorted

#### Algorithm
Mergesort the left half of the array,
mergesort the right half of the array, 
mergesort the two halves together. 

O(n log n) = time
O(n) = space

##### Readings and References
[Baeldung](https://www.baeldung.com/java-merge-sort)
[Geeks for Geeks](https://www.geeksforgeeks.org/merge-sort/)

[Hacker Ranker](https://www.youtube.com/watch?v=KF2j-9iSf4Q)