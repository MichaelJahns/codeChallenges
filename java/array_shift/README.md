# Insert a new value in the middle of an array

## Problem Domain
Write a function called insertShiftArray which takes in an int and an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with the int in the middle of the array.

## Notes
## Visual

  [1, 2, 3, 4, 5] insert (-60) --> [1, 2, 3, -60, 4, 5]
  
insert the first half of input into output[i] using i < (input.length-input.length/2) as the testing condition
this will grab half of inputs values rounded up
  
| i | input[i] | output       |
|---|----------|--------------|
| 0 | 1        | [1,0,0,0,0,0]|
| 1 | 2        | [1,2,0,0,0,0]| 
| 2 | 3        | [1,2,3,0,0,0]|

insert the int @ output[input.length-(input.length/2)] to target the middle most position

| int | input.length-(input.length/2) | output        |
|-----|-------------------------------|---------------|
| -60 |               3               |[1,2,3,-60,0,0]|

and populate the second half of output @ output[output.length-1-i] using input[input-1-i], use i <  input.length/2 as the testing condition
  
| i | input[input-1-i] | output.length-1-i   |   output       |
|---|------------------|---------------------|----------------|
| 0 | 4                |           4         | [1,2,3,-60,4,0]|
| 1 | 5                |           5         | [1,2,3,-60,4,5]| 



### Solution One
Intialize a new array with length of old array + 1

Populate the first half from input[i]
Insert new value
Populate the second half from input[


### Solution Two
    
## Approach and Efficiency
### Solutions found
1. Populating the new array with the first half first, then the int, then the second half
2. 

### Efficiency
O(n)

## Solution
Whiteboarded with Dana Voros
[arrayShift Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/assets/arrayShift.jpg)
