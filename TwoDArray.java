import java.util.*;

public class TwoDArray {
    
   public  static void main(String[] args) {
    // Scanner sc= new Scanner(System.in);
    // System.out.println("Enter a row and col  number for the 2D array:");
    // int rows =sc.nextInt();
    // int cols =sc.nextInt();

    // int arr[][] = new int[rows][cols]; 

    // System.out.println("Enter x element find in matrix");
    // int x = sc.nextInt();


    //displaying elements of array
    //input
    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         arr[i][j] = sc.nextInt();
    //     }
    // }

    // //output
    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         System.out.print(arr[i][j] + " ");
    //     }
    //     System.out.println();
    // }

    //? take a matrix as input from the user . Search for a given number x and print the indices at which place
    
    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         arr[i][j] = sc.nextInt();
    //     }
    // }

    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         if(arr[i][j] == x){
    //             System.out.println(x + "at this position" + i + ","+ j);
    //         }
    //     }
    //     System.out.println();
    // }
    
    //?Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Matrix print ");

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        while(rowStart <= rowEnd && colStart <= colEnd){

            //1
            for(int col = colStart ; col <= colEnd; col++){
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;


            //2
            for(int row = rowStart ; row <= rowEnd;row++){
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;


            //3
            for(int col = colEnd ; col >= colStart; col--){
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;


            //4
            for(int row=rowEnd;row >= rowStart;row--){
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            System.out.println();
        }
   }

}
