package search;

public class Searching {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        linear_search(new int[]{1, 2, 3, 4, 5}, 3);

        System.out.println("Binary Search");
        binary_search(new int[]{1, 2, 3, 4, 5}, 3);
    }

    static void linear_search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + (i+1));
                return;
            }
        }
    }

    static void binary_search(int[] arr, int key ) {
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
