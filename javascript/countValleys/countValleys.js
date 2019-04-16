// Solution one
// ============
// Not the most elegant of solutions, it uses conditionals to check which direction the movement is in and increments valleyCounter if we hit zero from the negative direction. Javascript has native string navigation for arrays, a solution in another language would require transforming str into an array

function keepMeFromYou(str){
  let levelTracker = 0
  let valleyCounter = 0
  for(var i in str){
    if(str[i] === 'd'){
      levelTracker-= 1
    }
    if(str[i] === 'u'){
      levelTracker+= 1
      if(levelTracker === 0){
        valleyCounter+=1;
      }
    }
  }
  return valleyCounter
}

// Positive Use Cases Solution One
// Simple valleys:          keepMeFromYou('dududu')             //expect return of 3
// Complex valleys:         keepMeFromYou('uddduudududududud')  //expect return of 6
// Strings with no valleys: keepMeFromYou('uuuuuuuuuuuuuuuuu')  //expect return of 0

// Granted the input is as expected as d's and u's, I can think of no edgecasess

