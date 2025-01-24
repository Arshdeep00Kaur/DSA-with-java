package arrays_;

import java.util.Scanner;

public class twodarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number of rows: ");
//        int row = sc.nextInt();
//        System.out.println("enter number of columns: ");
//        int column= sc.nextInt();
//
//        System.out.println("enter values of matrix: ");
//        int matrix[][]= new int[row][column];
//        for(int i=0;i<row;i++){
//            for(int j=0;j<column;j++){
//                 matrix[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println("your matrix is:");
//        for(int i=0;i<row;i++){
//            for(int j=0;j<column;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

//        // ----------- ques 2. Searching for an element x in a matrix.-----------------------
//        System.out.println("enter number of rows: ");
//        int row = sc.nextInt();
//        System.out.println("enter number of columns: ");
//        int column= sc.nextInt();
//
//        System.out.println("enter values of matrix: ");
//        int matrix1[][]= new int[row][column];
//        for(int i=0;i<row;i++){
//            for(int j=0;j<column;j++){
//                matrix1[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println("enter value to search: ");
//        int number = sc.nextInt();
//        for(int i=0;i<row;i++){
//            for(int j=0;j<column;j++){
//                if(matrix1[i][j]==number){
//                    System.out.println("number found at : "+i+","+j);
//                }
//            }
//        }

//        -- ques 3: Print the spiral order matrix as output for a given matrix of numbers.----------------
//         Approach:1. We will need 4 variables:
//a. row_start - initialized with 0.
//b. row_end - initialized with n-1.
//c. column_start - initialized with 0.
//d. column_end - initialized with m-1.
//2. First of all, we will traverse in the row row_start from column_start
//to column_end and we will increase the row_start with 1 as we have
//traversed the starting row.
//3. Then we will traverse in the column column_end from row_start to
//row_end and decrease the column_end by 1.
//4. Then we will traverse in the row row_end from column_end to
//column_start and decrease the row_end by 1.
//5. Then we will traverse in the column column_start from row_end to
//row_start and increase the column_start by 1.
//6. We will do the above steps from 2 to 5 until row_start <= row_end
//and column_start <= column_end.
//        System.out.println("enter no. of rows: ");
//        int n=sc.nextInt();  // rows
//        System.out.println("enter no. of columns: ");
//        int m=sc.nextInt();   // columns
//
//        int matrix2[][]=new int[n][m];
//        System.out.println("enter values: ");
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                matrix2[i][j]= sc.nextInt();
//            }
//        }
//
//        int rowStart = 0;
//        int rowEnd =n-1;
//        int columnStart = 0;
//        int columnEnd=m-1;
//        while(columnStart<=columnEnd && rowStart<=rowEnd){
//            for(int col=columnStart;col<=columnEnd;col++){
//                System.out.print(matrix2[rowStart][col]+" ");
//
//            }
//            rowStart++;
//
//            for(int row=rowStart;row<=rowEnd;row++){
//                System.out.print(matrix2[row][columnEnd]+" ");
//
//            }
//            columnEnd--;
//
//            for(int col=columnEnd;col>=columnStart;col--){
//                System.out.print(matrix2[rowEnd][col]+" ");
//
//            }
//            rowEnd--;
//
//            for(int row=rowEnd;row>=rowStart;row--){
//                System.out.print(matrix2[row][columnStart]+" ");
//
//            }
//            columnStart++;
//            System.out.println();
//
//        }

//        -----------ques 4 . transpose of matrix -------------------------------
        System.out.println("enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("enter number of columns");
        int c = sc.nextInt();

        int matrix3[][]=new int[r][c];
        System.out.println("enter your matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix3[i][j]= sc.nextInt();
            }
        }

        // transpose
         for(int j=0;j<c;j++){
             for(int i=0;i<r;i++){
                 System.out.print(matrix3[i][j]+" ");
             }
             System.out.println();
         }

    }
}
