# Problem Domain
Given a bike lock code of indeterminate length as a string, return the number of rotations needed to reach that code from 0
# Visual
Bike locks can be spun up and down, for characters great that 5 it is faster to spin down (from zero), for characters less that 5 it is fast to spin up (from zero)
## Usecase(s)
Below is how the problem domain can be visualized
                                    -1  +4  +2  +0  
                              fxn    |   |   |   |
            0 ) 0 ) 0 ) 0 )   ===>   9 ) 4 ) 2 ) 0 )

            1 + 4 + 2 + 0 = 7 spins to reach the code of 9420 from 0000

Counting Jumps forwards
                                +4
             /   \ /   \ /   \ /   \ 
            0     1     2     3     4     5     6     7     8     9
            |_____|_____|_____|_____|_____|_____|_____|_____|_____|

Counting Jumps backwards
                                                        -3
           \                                           /  \  /  \  /
            0     1     2     3     4     5     6     7     8     9
            |_____|_____|_____|_____|_____|_____|_____|_____|_____|

Every position labeled by number of jumps
               
                 +1    +2    +3    +4    +/-5  -4    -3    -2    -1     

            0     1     2     3     4     5     6     7     8     9
            |_____|_____|_____|_____|_____|_____|_____|_____|_____|

Viewed this was we can see a pattern emerge and form our algorithm

            -4   -3    -2    -1          +1    +2    +3    +4     +5 
 
            6     7     8     9     0     1     2     3     4     5     
            |_____|_____|_____|_____|_____|_____|_____|_____|_____|

# Algorithm
* iterate over every i of str
* count up if i > 5
* count down if i < 5
* add the differences and return

# Psuedocode
* reduce on every i in string, acc
* if i < 5 acc += i - 0;
* if i > 5 acc += 10 - i;
* return acc
## Research
