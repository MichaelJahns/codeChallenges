# Problem Domain
Create function that takes in two strings and checks if they are anagrams of each other, return a boolean, spaces count, must use an Object
# Visual
An anagram is a pair of strings that contain all of the same characters but not necessarily in the same order
## Usecase(s)
         str1  /  str2     fxn
        "farts"  "tarfs"   ==>  true

         str1  /  str2     fxn
        "abcd"   "efgh"    ==>  false

# Algorithm
* decl, two objs
* fxn, accepts two string
* invalidate if the two strings are of non equal length
* iterate over the strings, and update both objs with values equal to the number of times that value appeared
* compare the objects and return boolean

# Psuedocode
* fxn(str1, str2)
* decl obj1 and obj2 for reference
* Iterate over str1 and update obj1
* Iterate over str2 and update obj2
* Compare both objects

## Research
How to compare Objects in JS
https://stackoverflow.com/questions/1068834/object-comparison-in-javascript
