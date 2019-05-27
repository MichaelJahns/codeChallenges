# Hashtable

## Problem Domain
Implement a hash table without using built in methods. 

### Visual
A Hashtable is an array of Buckets

`[0 , 1 , 2 , 3 ..... 10 ] `

Each Bucket is a Linked List

`0 => {} -- > `

`1 => {key= "mane", value= 2} -- > {key="name", value= 4} -- > {key="enam", value=16} -- >`

`2 => {} -- >`

`3 => {key="quarm", value 7} -- >`
...

By hashing our string and using modulus we can treat any given string as an in an array index, giving us a 
look up time O(n) in the worst case scenario. The linked lists in the buckets give us a defense against collisions. 

### Approach
Space O(n)
Time O(n)
