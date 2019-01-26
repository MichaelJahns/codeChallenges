# Problem Domain
Given a bike lock code of indeterminate length as a string, return the number of rotations needed to reach that code from 0
# Visual
Bike locks can be spun up and down, for characters great that 5 it is faster to spin down (from zero), for characters less that 5 it is fast to spin up (from zero)
## Usecase(s)
                                    -1  +4  +2  +0  
                              fxn    |   |   |   |
            0 ) 0 ) 0 ) 0 )   ===>   9 ) 4 ) 2 ) 0 )

            1 + 4 + 2 + 0 = 7 spins to reach the code of 9420 from 0000
# Algorithm
* iterate over every i of str
* transform str into i(?)
* count up if i > 5
* count down if i < 5
* add the differences and return

# Psuedocode
* reduce on every i in string, acc
* if i < 5 acc += i - 0;
* if i > 5 acc += 10 - i;
* return acc
## Research
