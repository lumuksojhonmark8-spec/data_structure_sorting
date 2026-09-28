/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class SelectionSort2 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        //One by one, move the boundary of the unsorted subarray
        for(int i = 0; i < n - 1; i++) {
            //Find the index of the minimum element in the unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update the index of the new minimum element
                }
            }
            
            //Swap the found minimum element with the first element of the unsorted portion
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};
        
        System.out.println("Original array");
        printArray(data);
        
        selectionSort(data);
        
        System.out.println("Sorted array");
        printArray(data);
        
    }
    
    //Utility method to print array contents
    private static void printArray(int[] data) {
        int[] arr = null;
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
