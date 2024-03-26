import java.util.*;
public class Factorial {

    public static int factorialCalcuated(int n){

        if(n<0){
            System.out.println("invalid number");
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    
    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int result = factorialCalcuated(num);

        System.out.println("factorial of this num is --> " + result);

    }
}
