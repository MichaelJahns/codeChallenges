## Problem Domain
Given a lengthy string return the first repeated word, 
`findFirstRepeat(String input)`

## Visual

| Input                                                         | Output             |
|---------------------------------------------------------------|--------------------|
| "It was the best of times it was the worst of times"          | "it"               |
| "All that he has ever known is that he has never known enough"| "that"             |
| "An incredibly squat building of only 32 stories"             | "All unique words" |

### Approach
Time O(n)
Space O(n)

### Known Edge Cases

Our regex works off of white space to seperate words, it does not ignore symbols as it probably should,
"fart," and "fart" are getting saved to the hashset as seperate and distinct words, which is where the
false negative comes from.

| Input         | Expected output | Actual output     |
|---------------|-----------------|-------------------|
| "fart, fart"  | "fart"          | "All unique words"|
