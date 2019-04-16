# Reverse an Array

## Problem Domain
Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order

## Visual
input = [ 1, 2, 3, 4, 5]

### Solution One
| i  |      output[i] |
|----|--------------- |
| 0  | [5, 0, 0, 0, 0]|
| 1  | [5, 4, 0, 0, 0]|
| 2  | [5, 4, 3, 0, 0]|
| 1  | [5, 4, 3, 2, 0]|
| 0  | [5, 4, 3, 2, 1]|

### Solution Two

[ 5 , 4 , 3 , 2, 1 ]
  ^   ^       ^  ^
  |   |_swap_ |  |
  |______________|
        swap

## Approach and Efficiency
### Solutions found
1. Populating a new array in reverse
2. Shuffles an Array

### Efficiency
O(n)

## Solution
[arrayReverse Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/assets/arraryReverse.jpg)
