# Problem Domain
Given a bike lock code of indeterminate length as a string, return the number of rotations needed to reach that code from 0
# Visual
Because the bike lock can spin up or down there are two routes to every digit, rotating up and rotating down.

                                +4
             /   \ /   \ /   \ /   \ 
            0     1     2     3     4     5     6     7     8     9
            |_____|_____|_____|_____|_____|_____|_____|_____|_____|
            
Counting number of jumps to 4 spinning up

                                        -6                
           \                          /  \  /  \  /  \  /  \  /   \ /
            0     1     2     3     4     5     6     7     8     9
            |_____|_____|_____|_____|_____|_____|_____|_____|_____|


Counting number of jumps to 4 spinning down

                                  (spins and direction)
                                    -1  +4  +2  +0  
                              fxn    |   |   |   |
            0 ) 0 ) 0 ) 0 )   ===>   9 ) 4 ) 2 ) 0 )
             start from 0               (input)
                 
            1 + 4 + 2 + 0 = 7 spins (output)
            
Below is how the problem domain can be visualized, we must develop an algorithm that spins down if a value is closer down, and spins up if it is closer up, sums and return the total number of spins

                 +1    +2    +3    +4   +/-5  -4    -3    -2    -1     

            0     1     2     3     4     5     6     7     8     9
            |_____|_____|_____|_____|_____|_____|_____|_____|_____|
         
Every position labeled by number of jumps

            -4   -3    -2    -1          +1    +2    +3    +4     +5 
 
            6     7     8     9     0     1     2     3     4     5     
            |_____|_____|_____|_____|_____|_____|_____|_____|_____|
            
We can rearrange the numberline to be displayed with 0 in the middle. Viewed this way we can see a pattern emerge and form our algorithm, for values greater 5 it is more expediant to count down, for values less than 6 it is more expediant to count up.

# Algorithm
* iterate over every i of str
* count up if i >= 5
* count down if i <= 6
* add the differences and return

# Psuedocode
* reduce on every i in string, acc
* if i < 5 acc += i - 0;
* if i > 5 acc += 10 - i;
* return acc
## Research
