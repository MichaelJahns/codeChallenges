package sorts;

public class InsertionSort {

    public static void main(String args[]) {

    }

    public static int[] insertionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int lookBehind = i - 1;

            while (lookBehind >= 0 && array[lookBehind] > value) {
                array[lookBehind + 1] = array[lookBehind];
                lookBehind = lookBehind - 1;
            }
            array[lookBehind + 1] = value;
        }
        return array;
    }

    public static String print(int[] array) {
        String output = "";
        for (int i : array) {
            output += i + ", ";
        }
        return output;
    }
}
