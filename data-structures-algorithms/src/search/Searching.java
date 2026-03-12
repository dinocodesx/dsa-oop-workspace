package search;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        Linear.linear_search(new int[]{1, 2, 3, 4, 5}, 3);

        System.out.println("Binary Search");
        Binary.binary_search(new int[]{1, 2, 3, 4, 5}, 3);
    }
}
