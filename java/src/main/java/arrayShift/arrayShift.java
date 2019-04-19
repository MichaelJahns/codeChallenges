package arrayShift;

public class arrayShift {
    public static void main(String[] args) {
    }

    public static int[] insertShiftArray(int insert, int[] input) {
        int[] output = new int[input.length + 1];

        for (int i = 0; i < input.length - (input.length / 2); i++) {
            output[i] = input[i];
        }
        output[input.length - input.length / 2] = insert;
        for (int i = 0; i < input.length / 2; i++) {
            output[output.length - 1 - i] = input[input.length - 1 - i];
        }
        return output;
    }
}
