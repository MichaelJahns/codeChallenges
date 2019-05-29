package sorts;

public class MergeSort {
    public static void main(String[] args) {

    }

    public static int[] mergeSort(int[] array, int n) {
        //if the array cant be divided further, don't try.
        if (n < 2) {
            return null;
        }
        int middle = n / 2;
        //In odd number arrays second will end up having more with the way we have divided them
        int[] first = new int[middle];
        int[] second = new int[n - middle];
        // Fills the two new arrays with their corresponding values from array above
        for (int i = 0; i < middle; i++) {
            first[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            second[i - middle] = array[i];
        }
        //This function is recursive as it calls itself.
        mergeSort(first, middle);
        mergeSort(second, n - middle);

        // The below merge is actually what does the sorting and because of the above recursion, its actually only ever
        // sorts small, digestible  portions of the array.
        merge(array, first, second, middle, n - middle);
        return array;
    }

    public static void merge(int[] array, int[] first, int[] second, int firstEnd, int secondEnd) {
        int firstIndex = 0;
        int secondIndex = 0;
        int arrayIndex = 0;
        // Literally didnt even know you could increment and use a variable at the same time.
        while (firstIndex < firstEnd && secondIndex < secondEnd) {
            if (first[firstIndex] <= second[secondIndex]) {
                array[arrayIndex++] = first[firstIndex++];
            } else {
                array[arrayIndex++] = second[secondIndex++];
            }
        }
        // Because odd arrays will unevenly divide, these while loops will finish adding whatever is left
        // at the end of the sort. Either one or neither of these will be entered.
        // never both.
        while (firstIndex < firstEnd) {
            array[arrayIndex++] = first[firstIndex++];
        }
        while (secondIndex < secondEnd) {
            array[arrayIndex++] = second[secondIndex++];
        }
    }
}

