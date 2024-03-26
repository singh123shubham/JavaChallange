import java.util.*;

public class fibonacci {

    public static int[] generateFibonacciSequence(int num){
        int[] fibArray = new int [num+1];

        fibArray[0] = 0;
        if(num>0){
            fibArray[1] = 1;
        }

        for(int i=2;i<=num;i++){
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        return fibArray;
    }
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int num = sc.nextInt();

        int[] fibonacciSequence = generateFibonacciSequence(num);
        System.out.println("Fibonacci Sequence:");

        for(int i=0;i<=fibonacciSequence.length;i++){
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}
