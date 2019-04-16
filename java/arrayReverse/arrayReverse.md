# Reverse an Array

## Problem Domain
Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order

## Notes
I am using a built in method for both of my solutions, i have imported java.util.Arrays so that I can print my input and output using 'Arrays.toString(Object)'. I believe there should be a way to make the return visible, but my first day with the language im not familiar with it enough yet. 
## Visual
input = [ 1, 2, 3, 4, 5]

desired output = [ 5, 4, 3, 2, 1]

### Solution One
Create an output array with length equal to inputs.length, iterate over output and fill every position i with 'input[input.length-i-1]'

| i  | input[i]  |output[i] |      output |
|----|-----------|----------|------------ |
| 0  | 1 | 5 | [5, 0, 0, 0, 0]|
| 1  | 2 | 4 | [5, 4, 0, 0, 0]|
| 2  | 3 | 3 | [5, 4, 3, 0, 0]|
| 1  | 4 | 2 | [5, 4, 3, 2, 0]|
| 0  | 5 | 1 | [5, 4, 3, 2, 1]|

### Solution Two
Iterate over the given array 'input.length/2' times (attempting to do it 'input.length' times will create palindromes), store input[i] in temp, overwrite input[i] with input[length-1-i], and save temp to its old position

Works with odd array lengths because the middlemost position doesnt change

      [ 1 , 2 , 3 , 4 , 5 ]  ----->  [ 5 , 4 , 3 , 2 , 1 ]
        ^   ^       ^   ^
        |   |_swap_ |   |
        |______________ |
              swap
              
Works with even array lengths because every position has a partner and swaps

      [ 1 , 2 , 3 , 4 , 5 , 6 ]  ----->  [ 6 , 5 , 4 , 3 , 2 , 1 ]
        ^   ^   ^___^   ^   ^
        |   |____swap___|   |
        |___________________|
                 swap
              
             
              
  
     
## Approach and Efficiency
### Solutions found
1. Populating a new array in reverse
2. Shuffles an Array

### Efficiency
O(n)

## Solution
[arrayReverse Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/assets/arraryReverse.jpg)
