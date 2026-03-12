package search;

public class Linear {
    public static void linear_search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + (i+1));
                return;
            }
        }
    }
}
