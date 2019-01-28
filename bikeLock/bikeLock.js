//Solution one
//============
//Check to see if the current value is closer spinning up or down, and add to accumulator accordingly. Because JS can compare numbers as a str against numbers as int, we dont need to use parseInt(), this is a strength of JS, working with another language the type of the data may have to be transformed before we can start comparing it.


function countBikeLockTurns(str){
  const arr = str.split('')
  console.log(arr)
  const output = arr.reduce((accumulator, currentValue) => {
    if(currentValue < 6 ){
      return accumulator += currentValue - 0
    }
    if(currentValue >= 6){
      return accumulator += 10 - currentValue
    }
  }, 0);
  return output
}

// Solution is O(n)

// Positive Use Cases Solution One
// All digits below 5:          countBikeLockTurns('1111') //expect 4
// All digits above 5:          countBikeLockTurns('9999') //expect 4
// Digits on either side of 5:  countBikeLockTurns('2468') //expect 12

// Solution One doesn't work with
// Input as array:              countBikeLockTurns(['2','4','6','8']) //expect 12
// Input as string:             countBikeLockTurns(2345) // expect 14

