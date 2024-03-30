public class Recursion {
    
    //? print Number n to 1
    public static void PrintNumber(int n) {
        if(n>0){
            System.out.print(n + " ");
            PrintNumber(n-1);
        }
    }

    //? factorial  of a number using recursion
    public static int factorial(int n){
        if(n==1 || n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    //? Sum Calculate 
    public static int SumCalculate(int num){
        if(num==1){
            return 1;
        }else{
            return num + SumCalculate(num-1);
        }
    }

    //? Fibonacci Series
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return factorial(n-1) + factorial(n-2);
        }
    }

    //? Print x^n (with stack height = n)
    public static int printPower( int x , int n){
        if(n==1){
            return 1;
        }

        if(x==0){
            return 1;
        }

        int p = printPower(x ,n-1);
        int result = x *  p ;
        return result;

    }

    //?BinarySearch 
    public static int BinarySearch(int[] array, int start ,int end , int target){
        if(start <= end){
            int mid = start + (end - start) / 2;

            if(array[mid] == target){
                return mid;
            }else if(array[mid] > target){
                return BinarySearch(array, start, mid-1, target);
            }else{
                return BinarySearch(array, mid+1,end , target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int num = 10;
        PrintNumber(num);
        
        int factorial_result = factorial(5);
        System.out.println(factorial_result );

        System.out.println(SumCalculate(6));

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < 5; i++) {
            System.out.print(fibonacci(i) + " ");
        }


        int ans = printPower(2, 5);
        System.out.println(ans);
        System.out.println("bbbbbb");

        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 2;
        int result = BinarySearch(sortedArray, 0, sortedArray.length - 1, target);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }

    }
}
