## Bracket Validation

 Write a script to return a boolean on whether not an inputted String closes it brackets, brackets can be round, square, or flamboyant. 

### Visual

| Input | Output |
|-------|--------|
| "()"  | true   |
| "{}"  | true   |
| "[]"  | true   |
| "("   | false  |
| "{"   | false  |
| "["   | false  |

### Approach and Efficiency
 I decided to use a Hashset as my solution. As opposed to a nested for loop or filling an array with all the characters I've seen, both of which have a time of O(n)^2. A Hashset, is a direct look up and I'll only need to loop through the input string once, making my solution O(n). I believe this solution is O(1) space, as theoretically, the HashSets Maximum size is 3.  
 
 If my script encounters one of the opening characters, `(, [, or {` it will add it to the hash. If my script encounters a closing character, it will remove the associated front half from the Hash. Because the return is a boolean that means that a string `(` is just as wrong `(((((`, which is a consideration of my script. If the problem domain needed a count of unclosed brackets, another solution would be needed. 
 
 [Whiteboard](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/bracketValidation.jpg)