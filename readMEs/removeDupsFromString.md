# Problem Domain
Given a string, delete repeat values, return string otherwise unmutated

# Visual
Input             =>   Output
* 'ABCB'            =>  'ABC' / 'ACB'
* 'Without hope'    =>  'Withou pe' / 'wiut hope'
* 'That happy dog'  =>  'Tha pydog' / 'thapy dog'

The difference in outputs is whether or not you choose to remove the first instance of that value or the last

My first solution has an output array and checks if that value is present already in that array, and only adds that value is it is unique. It is a solution that removes the last instance, rather, if given the string 'ABCB' it would return 'ABC'

## Usecase

    i = 0            output = []
      |
      Coffee
    
The output array does not have a value of "C" within, so we push 'C' into output

    i = 1             output = ['C']
      |
     Coffee
     
The output array does not have a value of "o" within, so we push 'o' into output

    i = 2           output = ['C', 'o']
      |
    Coffee
    
The output array does not have a value of "f" within, so we push 'f' into output

     i = 3           output = ['C', 'o', 'f']
       |
    Coffee
 
The output array DOES already have a value of "f" within, so we do nothing 

       i = 4         output = ['C', 'o', 'f' ]
         |
     Coffee
     
The output array does not have a value of "e" within, so we push 'e' into output

       i = 5         output = ['C', 'o', 'f', 'e']
         |
    Coffee
    
The output array DOES already have a value of "e" within, so we do nothing

Return Output.join() // 'Cofe'

# Algorithm
* Accept input as string, invalidate or transform anything else
* Check if value is already in output, if not push it
* return output

# Psuedocode 
* decl stringAsArray <= input into array to lowercase
* decl output <= empty array

* for stringAsArray length Do
  * if output =/= include i {push i into output}
* return output joined back into string

### Research Done
Regexless solution found here
https://stackoverflow.com/questions/19301806/regex-remove-repeated-characters-from-a-string-by-javascript
