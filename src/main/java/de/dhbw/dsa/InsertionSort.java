package de.dhbw.dsa;

import java.util.Arrays;

/**
 * @author Nikolas Rummel
 * @since 07.05.24, 11:05
 */
public class InsertionSort {

    public int[] insertionSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int key = A[i];
            int j = i-1;
            while (j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }

        return A;
    }

    public int[] recursiveInsertionSort(int[] A, int n) {
        if (n > 0) {
            recursiveInsertionSort(A, n-1);
            int key = A[n];
            int j = n-1;
            while (j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
        return A;
    }

    public int[] reverseInsertionSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int key = A[i];
            int j = i-1;
            while (j >= 0 && A[j] < key) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }

        return A;
    }

    public static void main(String[] args) {
        int[] A = {3,5,1,2,7,2};
        int[] B = new InsertionSort().reverseInsertionSort(A);


        System.out.println(Arrays.toString(B));
    }

}
