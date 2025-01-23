package arrays_;

import java.util.Scanner;

public class practice_ques_1 {
    public static void main(String[] args){
        // ques 1 : Take an array of names as input from the user and print them on the screen.


//        System.out.println("enter the size of array");
//
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//
//        String names[] = new String[size];
//        // taking values from user
//        System.out.println("enter values: ");
//        for (int i=0;i<size;i++){
//            names[i]=sc.next();
//        }
//        // printing values on string
//        for(int i=0;i<size;i++){
//            System.out.print(names[i]);
//        }

        // -----------------------------------------------
        // ques 2: Find the maximum & minimum number in an array of integers.

//        System.out.println("enter value of string: ");
//        int n = sc.nextInt();
//
//        int numbers[] = new int[n];
//        for (int i=0;i<n;i++){
//            numbers[i]=sc.nextInt();
//        }

//        int min=Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for(int i=0;i<numbers.length;i++){
//            if(numbers[i]<min){
//                min=numbers[i];
//            }
//            if(numbers[i]>max){
//              max = numbers[i];
//            }
//        }

//        System.out.println("max value is : "+max+"min value is: "+min);

        //-----------------------------------------------------------------------------
        // ques 3: Take an array of numbers as input and check if it is an array sorted in ascending order.

        System.out.println("enter value of string: ");
        int n = sc.nextInt();

        int number[] = new int[n];
        for (int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }

        Boolean isascending=true;

        for (int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                isascending=false;

            }

        }
        if(isascending){
            System.out.println("numbers are in ascending");
        }
        else{
            System.out.println("numbers are not in ascending");
        }
    }
}
