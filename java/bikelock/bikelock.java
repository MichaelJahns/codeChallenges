//Solution One
//============
//Iterate over the array, assuming every dial turns 0-9, 
// increment turns upward based on if counting up or if going
// down through zero would be easier.

class Main {
  public static void main(String[] args) {
    int bikelock[] = {1,1};
    int turns = 0;
    String start = "";
    for(int i = 0; i < bikelock.length; i ++){
      start += "0";
      if(bikelock[i]>= 5){
        turns += 10 - bikelock[i];
      }
      if(bikelock[i] < 5){
        turns += bikelock[i]-0;
      }
    };

     System.out.println(turns + " rotations are needed to reach unlock pattern from starting position of " + start);
  }
}

// Solution O(n)

//Notes to self
//=============
// * If void means my method has no return, could I have printed that line in a dryer fashion if this wasnt a void statement
// * My method has <String[] args> as a parameter. Necessary? repl.it wont run without it. What is it, how do i interact with it, and are there alternatives?
// * It is a working solution, but I made it and tested in repl.it, I still have no idea how to this file all by itself. 
// * the start position concatetation thing is cute, but is it necessary?
// * 