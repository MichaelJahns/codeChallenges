# Problem Domain
Given a string containing only, d's and u's, where d signifies a single step down, and u a single step up, count how many valleys exist across the whole array.

# Visual

        uuduuddddudduudu
            /\        
         /\/  \
        /______\________
                \/\  /\/
                   \/
        there are total of 
        3 valleys here

A valley seems to be definied by all of the negative space after a zero intersection to the next zero intersection

        du
        __ 
        \/   

The smallest unit considered valley

        dddduuududduuu
        ______________
        \            / 
         \    /\/\  /
          \  /    \/
           \/

Despite the three distinct troughs, there is only the two zero intersections, so this entire sequence would be classified as one valley

        ud   /\   zero intersection from mountain 
            ----
        du   \/   zero intersection from valley

There are two routes by which one can hit the zero intersection, from postivie space (ie mountain) or from negative space (ie valley). Given the problem domain we only care about the zero intersection from negative space, one method to do this is to only add the valley Counter increment to code blocks related to upward movement 

# Algorithm
* Give d's and u's a numerical value
* Track the rise and fall of the mountains and valleys
* If the sequence hits the zero intersection from negative space, record as one valley
* Return number of valleys

# Psuedocode
* decl arr <- str split
* decl int valley count
* decl int level tracker
* for i in arr
    * if d -- l level tracker
    * if u ++ 1 level tracker
        * if level tracker === 0, valley count +1
* return valley count         
## Research
