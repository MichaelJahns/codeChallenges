//Solution one
//============
//Check if value at index is already in output, push if it isnt

function removeDuplicates(input){
  let stringAsArray = input.toLowerCase().split('');
  let output = [];

  for(let i = 0; i < stringAsArray.length; i++){
    if(!output.includes(stringAsArray[i])){
      output.push(stringAsArray[i])
    }
  }
  return output.join('')
}

// Solution One is O(n)^2

// Positive Use Cases Solution One
// Standard String:              removeDuplicates('ABCB')
// Another Standard String       removeDuplicates'Coffee')
// String with Multiple Caps:    removeDuplicates('Without Hope')
// String with Mulitple Spaces:  removeDuplicates('That happy dog')

// Solution One Doesn't work as intended with
// Array:                        removeDuplicates(['A','B','C','B'])
// Integers:                     removeDuplicates(1232)
// Preserving the last value     removeDuplicates('ABCB') //When the desired answer is ('ACB')

//Solution Two
//============
//Check if value at index is already in an object, push into output if it isnt, major benefit of this route is that it achieves a Big O of O(n) instead of O(n)^2

function removeDuplicatesObject(input){
  let output = []
  let object = {}

  for(let i = 0; i < input.length; i++){
    if(!object[input[i]]){
      // console.log(input[i])
      object[input[i]] = 1;
      output.push(input[i])
    }
  }
  return output.join('')
}

// Solution Three O(n)

// Positive Use Cases Solution Two
// Array:                        removeDuplicatesObject(['A','B','C','B'])
// Standard String:              removeDuplicatesObject('ABCB')
// Another Standard String       removeDuplicatesObject('Coffee')
// String with Multiple Caps:    removeDuplicatesObject('Without Hope')
// String with Mulitple Spaces:  removeDuplicatesObject('That happy dog')

// Solution Two Doesn't work as intended with
// Integers:                     removeDuplicatesObject(1232)
// Preserving the last value     removeDuplicatesObject('ABCB') //When the desired answer is ('ACB')

//Solution Three
//============
//Uses Regex to find and remove duplicates, the benefit to regex is the ease at which we can target the first instance for removal

function removeDuplicatesRegex(input){
  let regex = /(.)(?=.*\1)/g
  return input.replace(regex, '')
}

// Solution Three is O(n)

// Positive Use Cases Solution Three
// Standard String:              removeDuplicatesRegex('ABCB')
// Another Standard String       removeDuplicatesRegex('Coffee')
// String with Multiple Caps:    removeDuplicatesRegex('Without Hope')
// String with Mulitple Spaces:  removeDuplicatesRegex('That happy dog')

// Solution Three Doesn't work as intended with
// Integers:                     removeDuplicatesRegex(1232)
// An Array:                     removeDuplicatesRegex(['A','B','C','B'])
// Preserving the first value    removeDuplicatesRegex('ABCB') //When the desired answer is ('ABC')


// Researched Solution
// ===================
//I wasnt satisfied with my answers so I researched other answers to the problem domain where I found the below, link to the stackoverflow in the readme
//This solution uses the filter method and indexOf to greatly codense the code necessary
//indexOf finds the first instance of a value and filter is a for each that allows a function to be ran against every value

function removeDuplicatesResearched(input){
  let output = input.split('').filter(function(val, index, array){
    return array.indexOf(val) === index
  }).join('');
  return output
}
  
// Researched Solution is O(n)

// Positive Use Cases Solution Research
// Standard String:              removeDuplicatesResearched('ABCB')
// Another Standard String       removeDuplicatesResearched('Coffee')
// String with Mulitple Spaces:  removeDuplicatesResearched('That happy dog')

// Solution Doesn't work as intended with
// Integers:                     removeDuplicatesResearched(1232)
// String with Multiple Caps:    removeDuplicatesResearched('Without Hope')
// Array:                        removeDuplicatesResearched(['A','B','C','B'])
// Preserving the last value     removeDuplicatesResearched('ABCB') //When the desired answer is ('ACB')

