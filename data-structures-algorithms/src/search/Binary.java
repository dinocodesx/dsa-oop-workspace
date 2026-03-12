package search;

public class Binary {
    public static void binary_search(int[] arr, int key ) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] == key) {
                System.out.println("Found at index " + (mid+1));
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
    }
}
