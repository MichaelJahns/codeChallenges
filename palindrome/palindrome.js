//Solution one
//============
//Compare the first and lest letter in string, if they aren't the same return false, else return true
function comparePositions(input){
  let test = input.toString().toLowerCase()
  let countdown = test.length - 1;
  for(let i = 0; i < test.length; i++){
    console.log(test[i], test[countdown])
    if(test[i] !== test[countdown]){
      return false
    } countdown--
  }
  return true
}

// Positive Use Cases Solution One
// Palindromic Integers:               comparePositions(12321)
// Palindromic Standard strings:       comparePositions('racecar')
// Palindromic Strings with capitals:  comparePositions('RaceAr)

// Negative Use Cases Solution One
// Non-palindromic strings:            comparePositions('cat')
// Non-palindromic integers:           comparePositions(1234)

// Solution One Doesnt not work as intended with
// Palindromes with punctuation:       comparePositions('Aha!')
// Palindromes with irregular spaces:  comparePositions('Was It A Rat I Saw')

//Solution Two
//============
//Turns the string into an array and reverses it

function reverseAndCompare(input){
  let temporaryArr = []
  let test = input.toString().toLowerCase().split('')

  for(let i = 0; i < test.length; i++){
    temporaryArr.unshift(test[i])
  }
  return test.join() === temporaryArr.join()
}

// Positive Use Cases Solution Two
// Palindromic Integers:               reverseAndCompare(12321)
// Palindromic Standard strings:       reverseAndCompare('racecar')
// Palindromic Strings with capitals:  reverseAndCompare('RaceAr)

// Negative Use Cases Solution Two  
// Non-palindromic strings:            reverseAndCompare('cat')
// Non-palindromic integers:           reverseAndCompare(1234)

// Solution Two Doesnt not work as intended with
// Palindromes with punctuation:       reverseAndCompare('Aha!')
// Palindromes with irregular spaces:  reverseAndCompare('Was It A Rat I Saw')


//Solution Three
//==============
//Regex to remove spacing and punctuation, then compare strings like in solution one

function regexPalindrome(input){
  let regex = /[\W_]/g
  let string = input.toString().toLowerCase().replace(regex, '')
  console.log(string)
  let backwardsString = string.split('').reverse().join('')
  console.log(backwardsString)

  return string === backwardsString
}

// Positive Use Cases Solution Three
// Palindromic Integers:               regexPalindrome(12321)
// Palindromes with punctuation:       regexPalindrome('Aha!')
// Palindromic Standard strings:       regexPalindrome('racecar')
// Palindromic Strings with capitals:  regexPalindrome('RaceAr)
// Palindromes with irregular spaces:  regexPalindrome('Was It A Rat I Saw')

// Negative Use Cases Solution Three
// Non-palindromic strings:            regexPalindrome('cat')
// Non-palindromic integers:           regexPalindrome(1234)
