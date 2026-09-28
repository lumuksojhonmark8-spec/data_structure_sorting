/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class MergeSort2 {
    
    public static void main(String[] args) {
        System.out.println("");
    }
}
    public static void mergeSort2(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort the left half
            mergeSort2(arr, left, mid);

            // Sort the right half
            mergeSort2(arr, mid, right);

            // Sort the two halves
            merge(arr, left, mid, right);
    }
}

