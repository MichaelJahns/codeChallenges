'use strict';
//Solution One
//============
// I was required in this problem to use objects, the below is the solution I put forward. Which was well recieved at the time, but actually coding it ran into many issues. //First order matters for the obj so {a:1, b;2} =/= {b:2, a:1}, so i had to rearrange my strings.
//Second Javascript doesnt have native object equality like other languages, so I imported the helper function 'isEquivalent' to do what otherlanguages can do native, source in the readMe.

function checkAnagram(str1, str2){
  if(str1.length !== str2.length){
    console.log('Strings are not the same length, terminating')
    return output
  }
  const sortedStr1 = str1.split('').sort().join('')
  const sortedStr2 = str2.split('').sort().join('')

  const obj1 = {}
  const obj2 = {}
  let output = false
  for(let i in sortedStr1){
    if(!obj1[sortedStr1[i]]){
      obj1[sortedStr1[i]] = 1
    }
  }
  for(let i in sortedStr2){
    if(!obj2[sortedStr2[i]]){
      obj2[sortedStr2[i]] = 1
    }
  }
  if(isEquivalent(obj1, obj2)){
    output = true
  }
  console.log('obj1', obj1)
  console.log('obj2', obj2)
  return output
}

// Positive Use Cases Solution One
// Anagrams without spaces:                     checkAnagram('farts', 'tarfs')

// Negative Use Cases Solution One
// Non-anagrams:                                checkAnagram('abc','def')
// Anagrams with an unequal number of spaces:   checkAnagram('Let my Lady Ring', 'LetmyLadyRing')

//Solution Two
//============
//Here is a solution I came to when investigating how to alphabetically sort my string for the above solution. While it doesnt use an Object like the challege asked I find it to be a much simpler and more effective solution in JS, where we cant compare objects directly

function checkAnagramNoObj(str1, str2){
  let output = false
  if(str1.split('').sort().join('') === str2.split('').sort().join('')){
    output = true
  }
  return output
}

// Positive Use Cases Solution Two
// Anagrams without spaces:                     checkAnagram('farts', 'tarfs')

// Negative Use Cases Solution Two
// Non-anagrams:                                checkAnagram('abc','def')
// Anagrams with an unequal number of spaces:   checkAnagram('Let my Lady Ring', 'LetmyLadyRing')

// Helper Function
// =-=-=-=-=-=-=-=
function isEquivalent(a, b) {
  var aProps = Object.getOwnPropertyNames(a);
  var bProps = Object.getOwnPropertyNames(b);
  if (aProps.length != bProps.length) {
    return false;
  }
  for (var i = 0; i < aProps.length; i++) {
    var propName = aProps[i];
    if (a[propName] !== b[propName]) {
      return false;
    }
  }
  return true;
}

