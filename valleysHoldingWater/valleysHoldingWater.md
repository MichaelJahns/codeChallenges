# Problem Domain
Given an array of numbers, where every number corresponds to the elevation of a bar graph, return how much water can be stored across the whole bar graph.

### Notes
I did NOT complete this code challenge in the alloted 30 min, my interviewer was impressed with my flailing however, evidently I got farther than some. 
# Visual
Amount of water will be referred to as units, where 1x1 area on the graph is one unit of water

         __
        | 4|__
        |  | 3|   __    __
        |  |  |  |2 |  |2 |__
        |  |  |__|  |__|  | 1|
        [ 4, 3, 0, 2, 0, 2, 1 ]   

The above graph can hold a total of 4u of water. 2u can be stored between the 2 walls(index 2 and 4), and 2u can be stored between the 3 and 2 wall (index 1 and 3). 
Water needs a wall on either side to hold it. So the effective height of the walls is the height of the second highest wall.

The total possible amount of water that can be stored between two walls can be calculated mathematically by the expression xh, where x is the number of poistions between the two walls and h is the height of the second highest walls
## Usecase(s)
Below are some use cases  

            __    __                      
           |  |  |  |            
           |  |  |  |          
           |  |__|  |          
           [ 3, 0, 3]           
            xh = 1*3               
            xh = 3u       

The first is a no nonsense array with a single storage space. 
There is a single index between the walls so x = 1
The height of the walls are both 3 so h = 3
xh = 1*3, so 3 units of water

                             __                              
                            |  |
              __            |  |             
             |  |           |  |             
             |  |__ __ __ __|  |            
              [ 2, 0, 0, 0, 0, 4]            
               xh = 4*2                       
               xh = 8u  

The second is a demonstration that the height of the storage has to be dependant on the height of the second tallest wall. 
There are 4 index' between the walls so x = 4
If we set the height of the walls to the higher height h = 4, then xh = 16u of water are possible, but 8 of those units would not have a wall on their left and would leak out.
SO, instead we set h = 2, xh = 2*4 and we get 
xh = 8u of water possible              

             __
            |  |   __
            |  |  |  |   __
            |  |__|  |__|  |
            [ 4, 0, 2, 0, 1]
            xh = 1*2 and 1*1
            xh = 2u + 1u
            xh = 3u

The third here is a use case where we nee multiple instances of xh
There is as storable space between 4 and 2 (index 0 and 2) and a space between 2 and 1 (index 2 and 4)
Despite being the highest value, 4 cannot be the wall for rightmost space, our final equation will have to account for situations like this, where there is additional space after we check between the highest two values

         __
        | 4|__
        |  | 3|         __
        |  |  |        |2 |__
        |  |  |__ __ __|  | 1|
        [ 4, 3, 0, 0, 0, 2, 1 ]   

The idea I had to solve this one will iterate through the array one time, track the highest value met, and on every rise, record the filled values and fill them to the height of  h
                         
# Algorithm
* Define blocks capable of holding water
* Check the total water each of those blocks can hold with xh
* Minus from that total xh the value of each index in that space
* Increment return value with the remainder
* If hill >= h, then hills value is h
    * ie if hill is 3 and h is 2, the hill will only fill 2 values

## Sub Domain Problems
* While There is remaining space
* Find highest value without methods
* Find next/previous highest value without methods
* Find space between the above two 
* xh where x is the space between and h is the second highest height
* decrease xh with the sum total of the indexs in the space
* remove the index's between the blocks and start the process over until there is no more storable space
or
* Track highest encounter
* Check every index for a rise
    * If rise, xh all positions back to highest && sumOfI all positions back to highest
    * Transform all positions to h, where h is the height of the second highest wall
    * increment output by xh-sumOfI

# Psuedocode
* decl output int => 0
* decl highestValue int => 0
* decl highestValueIndex int => 0
* for var i in arr
* check for new highest value, store old highest in temp
* if highest on left
    * increment based on right
* if highest on right
    * increment based on left
* return output
## Research
