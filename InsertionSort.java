public class InsertionSort {
    public static void printArray(int[] array) { 
        for(int i=0;i<array.length;i++) {  
            System.out.print(array[i] + " "); 
        }
    }

    public static void main(String args[]) { 
        int arr[] = {1,8,4,5,9,33,5,4,2};

        // inseration sort 
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j  = i-1;
            while (j>=0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}
