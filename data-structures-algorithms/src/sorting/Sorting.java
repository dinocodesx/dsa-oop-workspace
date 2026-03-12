package sorting;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        Bubble.bubble_sort(new int[]{5, 4, 3, 2, 1});

        System.out.println("Selection Sort");
        Selection.selection_sort(new int[]{5, 4, 3, 2, 1});
    }
}
