# Hash Maps

## Left Join

### Problem Domain
Given two hashmaps do a simple LEFT JOIN with a matrix as the return

If a user would instead like to do a right JOIN, simply reverse the order of the inputs
Left

| key | value |
|-----|-------|
| Jeff| Newman|
| Jimo| Forna |
| Jeri| Deram |

+
Right

|key  | value |
|-----|-------|
| Jeff| Okay  |
| Jeri| Great |

=

[
["Jeff", "Newman" , "Okay"],
["Jimo", "Forna", null],
["Jeri", "Deram", "Great"]
]

#### Approach
This problem would have tested my coachability rather than my inate skill/mastery. Hashmaps as a data structure isnt something I have a lot of experience working with. 
Space O(n)
Time O(n)

[Whiteborad](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/LeftJoin.jpg)
