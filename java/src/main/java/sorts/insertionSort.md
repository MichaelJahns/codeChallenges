# Lecture Notes: Insertion Sort
A sorting algorithm with a time of O(n)^2. This sort works manually positioning each index as it goes across an array.
Its used often for smaller arrays, or mostly sorted arrays, scenerios where its low speed isnt a problem. 

## Learning Objectives
Insertion Sort

## Lecture Flow
Insertion Sort
*how?
*why? 

### Diagram

i= 0

array full unsorted

`[(i) 3 , 1 , 2  5 , 9 , 4 , 6 , 7 , 10 , 8 ]`


i=3

array partially sorted

`[1 , 2 , 3 (i) 5 , 9 , 4 , 6 , 7 , 10 , 8 ]`


finished

array full sorted      

`[1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 (i) ]`

`
### Algorithm
For the next unsorted element

Swap its position with elements in the sorted portion of the array until the element is it the correct position in the sorted portion of the array

Advance the marker to the next unsorted element

### Pseudocode

`FOR i = 1; i < array.length; i++
value = array @ i
lookBehind = i - 1

WHILE lookBehind >= 0 AND array[lookBehind] > value
array[lookBehind + 1] = array[lookBehind]
lookBehind--

array[lookBehind + 1] = value`


#### Readings and References
Videos
https://www.youtube.com/watch?v=OGzPmgsI-pQ
https://www.youtube.com/watch?v=pmDnM9gUxNc

Article
https://www.geeksforgeeks.org/insertion-sort/
