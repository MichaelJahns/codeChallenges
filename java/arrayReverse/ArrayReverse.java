//Solution One
// for loop, creating new array

// import java.util.Arrays;

// public class ArrayReverse{
//   public static void main(String[] args){
//   int[] input = new int[]{1,2,3,4,5,6,7,8,9};

//   System.out.println(Arrays.toString(input));
//   System.out.println(Arrays.toString(reverseArray(input)));
//   }

//   public static int[] reverseArray(int[] input){    
//     int[] output = new int[input.length];
//     for(int i = 0 ; i < input.length; i++){
//       output[i] = input[input.length-1-i];
//     }
//     return output;
//    }
//   }

//Solution Two
// for loop, shuffling positions characters around
import java.util.Arrays;

public class ArrayReverse{
    public static void main(String[] args){
        int[] test1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] test2 = new int[]{0, 0, 0, 0, 0, 5};
        int[] test3 = new int[]{200, 400, 300 , 500};

        reverseArray(test1);
        reverseArray(test2);
        reverseArray(test3);
    }
    public static int[] reverseArray(int[] input){
        int[] output = input;
        for(int i = 0; i < output.length/2; i++){
            int temp = output[i];
            output[i] = output[output.length-1-i];
            output[output.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}
  