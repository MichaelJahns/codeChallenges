package binarySearch;

public class binarySearch {
    public static void main(String[] args) {
        binarySearch(4, new int[]{1, 2, 3, 4});
    }

    public static int binarySearch(int target, int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) {
                System.out.println(i);
                return i;
            }

        }
        return -1;
    }
}

