import java.util.*;
public class Array {

    // ?Array 
    //List of items of the same datatypes    , type[] arrayName = new type[size]
    public static void main(String[] args){
        // int[] marks = new int[4];
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // System.out.println(marks[1]);

        // for(int i=0;i<=marks.length;i++){
        //     System.out.println(marks[i]+" ");
        // }

        // int number[] = {12,5,3,4,8,6,3,7};

        // for(int i=0;i<number.length;i++){
        //     System.out.println(number[i]);
        // }

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // for(int i = 0;i<size;i++){
        //     arr[i] = sc.nextInt();
        // }

        // int x = sc.nextInt();
        // for(int i=0;i<size;i++){
        //     if(arr[i] == x){
        //         System.out.println(" x is present at index " +i);
        //     }
        // }

        //? Take an array of names as input from the user and print them on the screen
        
        // System.out.println("enter a size of array");
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // System.out.println("enter array element ->>");
        // int array[] = new int [size];
        
        // for(int i=0;i<size;i++){
        //     array[i]=sc.nextInt();
        // }

        // for(int i=0;i<size;i++){
        //     System.out.println(array[i]+" index no  "+i+"\n");
        // }

        //?Find the maximum & minimum number in an array of integers. 
           
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter array Size ->>>");
            // int size = sc.nextInt();

            // System.out.print("Enter array elements ->>>");
            // int array[] = new int[size];
            // for(int i=0;i<size;i++){
            //     array[i] = sc.nextInt();
            // }

            // int max = Integer.MIN_VALUE;
            // int min = Integer.MAX_VALUE;

            // for(int i=0;i<size;i++){
            //     if(array[i]> max){
            //         max = array[i];
            //     }

            //     if(array[i] < min) {
            //         min = array[i];
            //     }
            // }
            // System.out.println("max element is :=>>>>" + max);
            // System.out.println("min element is :->>>>" +min);
        
        //?Take an array of numbers as input and check if it is an array sorted in ascending order

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enetr a array element =>>>");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0;i<size-1;i++){
            if(arr[i] > arr[i+1]){
                isAscending = false;
            }
        }
        if (isAscending == true) {
            System.out.println( "The given array is Ascending Order.");
        } else {
            System.out.println( "The given array is not in Ascending Order.");
        }
    }
}