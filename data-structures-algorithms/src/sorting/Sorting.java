package sorting;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        bubble_sort(new int[]{5, 4, 3, 2, 1});

        System.out.println();
        System.out.println("Selection Sort");
        selection_sort(new int[]{5, 4, 3, 2, 1});
    }

    static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void bubble_sort(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
