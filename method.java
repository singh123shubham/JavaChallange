import java.util.*;
public class method {

    //  method and function decleration
    public static void printName(String name) {
        System.out.println("My Name is " + name);
        return;
    }

    public static int addNumber(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static int productOfNumber(int a , int b){
        int  multiply=a*b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int a =  sc.nextInt();
        int b = sc.nextInt();

        // call function and method
        printName(name);
        int result = addNumber(a, b);
        System.out.println("sum of two num " + result);

        int ans = productOfNumber(a, b);
        System.out.println("product of two num  "+ans);
        
        System.out.println();
    }
}
