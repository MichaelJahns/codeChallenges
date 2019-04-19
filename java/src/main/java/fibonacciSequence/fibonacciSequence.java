package fibonacciSequence;

public class fibonacciSequence {
    public static void main(String[] args) {
    }

    public static long fibonacciSequenceFinder(int n) {
        long[] output = new long[n > 2 ? n : 2];
        output[0] = 0;
        output[1] = 1;
        for (int i = 2; i < n; i++) {
            output[i] = output[i - 1] + output[i - 2];
        }
        return output[n - 1];
    }
}
