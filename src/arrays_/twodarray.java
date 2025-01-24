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

        // ----------- ques 2. Searching for an element x in a matrix.-----------------------
        System.out.println("enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("enter number of columns: ");
        int column= sc.nextInt();

        System.out.println("enter values of matrix: ");
        int matrix1[][]= new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter value to search: ");
        int number = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix1[i][j]==number){
                    System.out.println("number found at : "+i+","+j);
                }
            }
        }

    }
}
