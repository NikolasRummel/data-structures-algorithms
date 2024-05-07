package de.dhbw.dsa;

/**
 * @author Nikolas Rummel
 * @since 07.05.24, 11:05
 */
public class LinearSearch {


    public int lienarSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 100;
        int result = linearSearch.lienarSearch(array, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
