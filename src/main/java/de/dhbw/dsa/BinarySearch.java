package de.dhbw.dsa;

/**
 * @author Nikolas Rummel
 * @since 14.05.24, 22:00
 */
public class BinarySearch {

    public int iterativeBinarySearch(int[] arr, int key) {
        int i = 0;
        int j = arr.length - 1;

        while (i != j) {
            int middle = (int) Math.floor((double) (j + i) / 2);
            System.out.println("Middle: " + middle);

            int current = arr[middle];

            if (current == key) {
                return middle;
            }

            if (current < key) {
                i = middle + 1;
            } else {
                j = middle;
            }
        }

        return -1;
    }


    public int recursiveBinarySearch(int[] arr, int key, int i, int j) {
        System.out.println("Rerusive call with i: " + i + " j: " + j);
        if (i <= j) {
            int middle = i + (j - i) / 2;

            if (arr[middle] == key) {
                return middle;
            }

            if (arr[middle] < key) {
                return recursiveBinarySearch(arr, key, middle + 1, j);
            } else {
                return recursiveBinarySearch(arr, key, i, middle - 1);
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 4;
        int result = binarySearch.recursiveBinarySearch(array, key, 0 , array.length - 1);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
