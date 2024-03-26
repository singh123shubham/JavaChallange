import java.util.*;

public class pattern {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // System.out.println(n);

        // ? print a ractangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // ? print a hollow rectangle

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == 1 || j == 1 || i == n || j == n) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // ? print right angle triangle

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // ? print a inverted right angle triangle
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // ? print pattern

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // ? print pattern
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         int a = j + 1;
        //         System.out.print(a);
        //     }
        //     System.out.println();
        // }

        //? cross Pattern 
        // for(int i=1;i<=n ;i++){
        //     for(int j=1;j<=n;j++){
        //         if(j==i  || j==n-i+1){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //? pattern 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //? floyd's Triangle
        // int num = 1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        //?  pattern
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if(( i + j ) % 2 == 0){
        //             System.out.print(1);
        //         }else{
        //             System.out.print(0);
        //         }
        //     }
        //     System.out.println();
        // }

        //? butter fly pattern 

        //upper part 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space = 2 *(n-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // lower part
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     int space =  (2*(n-i)); 
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //? rhombus pattern 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //? number pyramid and num
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        //? palindromic pattern 
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print(" ");
            //     }

            //     // first half num
            //     for(int j=i;j>=1;j--){
            //         System.out.print(j);
            //     }

            //     //second half num
            //     for(int j=2;j<=i;j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            //?  pyramid  pattern star
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
    }
}
