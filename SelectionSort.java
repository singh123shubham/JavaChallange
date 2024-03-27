public class SelectionSort {
    
    public static void printArray(int[] array) { 
        for(int i=0;i<array.length;i++) {  
            System.out.print(array[i] + " "); 
        }
    }
    public static void main(String args[]){

        int arr[] = {7,2,4,6,8,3,4,9};

        //Selection Sort  O(n^2)
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]  < arr[minIndex]){
                    minIndex = j;
                }
            }         
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        printArray(arr);
    }
}
