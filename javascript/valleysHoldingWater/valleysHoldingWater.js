// Solution One
// ============
// This solution actually came to me while I was sleeping. Does it work? Yes. Is it great? No.

function fillTheValleys(arr){
  let output = 0
  let highestValue=0
  let highestValueIndex=0
  for(var i in arr){
    // console.log(arr, i)
    if(arr[i] >= highestValue){
      var temp = highestValue
      var tempIndex = highestValueIndex
      highestValue = arr[i]
      highestValueIndex = i
    }
    if(arr[i] > arr[i-1]){
      // console.log('rise detected')
      //Block one
      //If new index is greater than or equal to our recorded highest value
      if(arr[i] >= highestValue){
        // console.log('entered block one')
        let sumOfI = 0
        let xh = 0

        for(var j in arr){
          if(j < highestValueIndex && j > tempIndex){
            sumOfI+= arr[j]
            arr[j]=temp
          }
        }
        for(var k in arr){
          if(parseInt(k) < highestValueIndex && parseInt(k) > tempIndex){
            xh+= arr[k]
          }
        }
        // console.log('sum of i', sumOfI)
        // console.log('xh', xh)
        if(xh > sumOfI){
          output+= xh-sumOfI
        }
      }
      //If new index is not greater than our old highest value
      if(arr[i] <= highestValue){
        // console.log('entered block two')
        let sumOfI = 0
        let xh = 0
        for(var j in arr){
          if(j > highestValueIndex && j < i){
            sumOfI+= arr[j]
            arr[j]=arr[i]
          }
        }
        for(var k in arr){
          if(k > highestValueIndex && k < i){
            xh+= arr[i]
          }
        }
        // console.log('sum of i', sumOfI)
        // console.log('xh', xh)
        output+= xh-sumOfI
      }
    }

    // console.log(`output is ${output}`)
    // console.log(`highestValue is ${highestValue}`)
    // console.log(`highestValueIndex is ${highestValueIndex}`)
  }
  console.log(`output is ${output}`)
}
// Solution One has a Big O of O(n)^2

//Positive Use Cases Solution One
//Simple Valley:            fillTheValleys([3,0,2]) //expect 2
//Back Heavy Valleys:       fillTheValleys([2,,1,0,8]) //expect 3
//No Valleys:               fillTheValleys([8,6,4,3,1]) //expect 0
//Huge valleys:             fillTheValleys([32, 17, 50])  //expect 15
//Many Valleys:             fillTheValleys([5,4,5,4,5,4,5,4,5]) //expect 4
