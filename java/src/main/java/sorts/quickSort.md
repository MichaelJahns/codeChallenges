# Lecture Notes: Quick Sort
Quick sort is a recursive, divide and conquer sort. In the worst case it is O(n)^2, but on average quick sort manages to be O(n log n). Because it works with ever smaller chunk sizes, quick sort does very well for large data sets.

## Learning Objectives
Quick Sort
*how?
*why?

## Lecture Flow
Why Quick sort?
- pros
- cons
How it works and usecases. 
Q/A

### Diagram

Before, Unsorted array

`[ 3 , 1 , 4 , 2 , 0 ]`

Pivot on zero; 0 and 3 trade positions

`[ 0 , 1 , 4 , 2 , 3 ]`

Pivot on 3; 4 and 2 change position

`[ 0 , 1 , 2 , 4 , 3 ]`

Pivot on 3; 4 and 3 change position

`[ 0 , 1 , 2 , 3 , 4 ]`

Sorted Array

#### Algorithm
Quick sort works by assigning a pivot and getting other elements to arrange themselves correctly just around one pivot at a time. 

Quick sort the array, pivot gets placed somewhere in the middle of the array, dividing it into first half and second half.
Quick sort left, Quick sort right until every element is properly placed 

O(n log n) = time
O(n) = space

##### Readings and References
[Geeks for Geeks](https://www.geeksforgeeks.org/quick-sort/)
[Joe James](https://www.youtube.com/watch?v=Fiot5yuwPAg)