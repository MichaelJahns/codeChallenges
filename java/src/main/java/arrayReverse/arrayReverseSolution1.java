package arrayReverse;

import java.util.Arrays;

public class arrayReverseSolution1 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(reverseArray(input)));
    }

    public static int[] reverseArray(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[input.length - 1 - i];
        }
        return output;
    }
}