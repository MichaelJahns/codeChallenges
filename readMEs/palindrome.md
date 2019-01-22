# Problem Domain
Create function that takes an input and returns a boolean indicating if that input was palindrome or not
# Visual
A palindrome is something that reads the same way forwards and backwards.
Like the word 'eye' or the year '2002'
My first idea to solve this problem was using JS string indexing to compare the first and last position of the input
until ive gone through the string, or encountered a situation where the index's did not hold the same value. 

## Positive Usecase
 first               =                last
   |                                   |
[ 'r' , 'a' , 'c' , 'e' , 'c' , 'a' , 'r' ]
In this case we can see that the letter in first position and the last are the same so we'd move onto the next

       second        =      second last
         |                       |
[ 'r' , 'a' , 'c' , 'e' , 'c' , 'a' , 'r' ]
We would continue checking until we completely navigate the input, at which point we would return true
## Negative Usecase
 first  =/=   last
   |           |
[ 'c' , 'a' , 't, ]
In this case we can see that the first position and the last are not the same so we would return false and end the script

# Algorithm
*Treat input like an array of characters regardless of input
*Count up array[i] in increments of one
*Count down array[-1] in increments of one
*If/else block to compare the two index positions

# Big O
O(n)

# Psuedocode
decl inputAsString <= input to String to Lowercase
decl countdown <= -1
for inputAsString length Do
    if inputAsString at i =/= inputAsString at countdown 
        return false
    else 
        countdown --
return true
