package sorts;

public class QuickSort {

    public static int partition(int[] array, int low, int high) {
        // This quick sort sets the first pivot as the last element in the array
        int pivot = array[high];
        // We have to assign i programmatically for it to work recursively
        int lowerIndex = low - 1;
        for (int upperIndex = low; upperIndex < high; upperIndex++) {
            //If current element is smaller than pivot, we swap it with the lower index
            if (array[upperIndex] <= pivot) {
                lowerIndex++;
                int temp = array[lowerIndex];
                array[lowerIndex] = array[upperIndex];
                array[upperIndex] = temp;
            }
        }
        // Swap pivot and the last position we were in when we left the for loop
        int temp = array[lowerIndex + 1];
        array[lowerIndex + 1] = array[high];
        array[high] = temp;

        return lowerIndex + 1;
    }

    public int[] sort(int[] array, int low, int high) {
        // Wont happen if our pointers are referencing the same element
        if (low < high) {
            int pivot = partition(array, low, high);

            //Call this recursively for the array left and right of pivots final position
            //left
            sort(array, low, pivot - 1);
            //right
            sort(array, pivot + 1, high);
        }
        return array;
    }
}
