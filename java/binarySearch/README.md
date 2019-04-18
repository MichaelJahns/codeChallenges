# Find the index of a value in an array

## Problem Domain
Write a function called binarySearch that takes in a target and an array as a paramter. Without utilizing any of the built-in methods available to your language, return the index in that array where the target can be found.

## Notes
This solution will break at the first index where target = input[i], so for cases where the target is present multiple times only the first index will be returned
## Visual

     [1, 2, 3, 4, 5] target(3) --> [1, 2, (3),i=2
                                       
Iterate over the array, and when the value of input[i] == target, return i

target = 3

| i | input[i] | target = input[i] |
|---|----------|-------------------|
| 0 | 1        | false             |
| 1 | 2        | false             | 
| 2 | 3        | true              |

  return i
  
  If the target cannot be found in the array, returns -1

| i | input[i] | target = input[i]|
|---|----------|-------|
| 0 | 1        | false |
| 1 | 2        | false | 
| 2 | 3        | false |
| 3 | 4        | false |
| 4 | 5        | false | 

    return -1

### Solution One
Iterate over input
check if input[i] == target
when true return i
else return -1


### Solution Two
    
## Approach and Efficiency
### Solutions found
1. Check every index for match
2. 

### Efficiency
O(n)

## Solution
Whiteboarded with Trey Herndon
[arrayReverse Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/assets/binaryShift.jpg)
