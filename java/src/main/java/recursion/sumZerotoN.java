package recursion;

public class sumZerotoN {
    // Driver code
    public static void main(String[] args) {
        WhatIsNBeforeWeAreInLongTerritory();
        // N only has to be 257 to need the output to be a long
        driver();
    }

    public static void WhatIsNBeforeWeAreInLongTerritory() {
        int n = 0;
        long counter = 0;
        while (counter < 2147483647) {
            counter = counter + n;
            n++;
        }
        System.out.println(n);
    }

    public static long driver() {
        int n = 256;
        long output = recurSum(n);
        System.out.println(output);
        return output;
    }

    public static int recurSum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + recurSum(n - 1);
    }
}

