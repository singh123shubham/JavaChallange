import java.util.*;
public class BubbleSort {

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,2,6,4,8,9,3,4};

        // bubble sort  O(n^2) time complexity
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    // Bit Opertater Using
                    // arr[j] = arr[j] ^ arr[j+1];
                    // arr[j+1] = arr[j] ^ arr[j+1];
                    // arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
        printArray(arr);
    }
}
