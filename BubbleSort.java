/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class BubbleSort {
    
    private final int[] TestArray;
      //Constructor 
    public BubbleSort(int[] val) {
        this.TestArray = val;
        
    }
    
    //Sort Elements Method
    public void sortElements() {
        
        int len = TestArray.length;
        
        for (int i = 0; i < len - 1; i++) {
            
            System.out.println("Iteration " + (i + 1));
            System.out.println("Array: "
                    +java.util.Arrays.toString(TestArray));
            
            for (int j = 0; j < len - 1 - i; j++) {
                
                //Compare adjacent elements
                if (TestArray[j] > TestArray[j + 1]) {
                    
                    //Swap
                    int temp = TestArray[j];
                    TestArray[j] = TestArray[j + 1];
                    TestArray[j + 1] = temp;
                    
                    System.out.println("Swap: "
                            +java.util.Arrays.toString(TestArray));
                }
            }
            
            System.out.println();
        }
    }
    
    //Display Elements
    public void displayElements() {
        
        for (int a : TestArray) {
            System.out.print(a +" ");
        }
        System.out.println();
    }
}
