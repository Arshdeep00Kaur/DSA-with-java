package functions;

import java.util.Scanner;

public class practice_ques1 {
    public static void main(String[] args){
        System.out.println("Enter number to check prime: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        checkPrime(num);
        checkEven(num);
        table(num);

    }
// ------------1----------------------
    // Make a function to check if a number is prime or not.

    public static void checkPrime(int num){
        if(num<2){
            System.out.println("Not prime");
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("Not prime");
                return;
            }

        }
        System.out.println("Prime");
        return;
    }
    //----------------2-------------------------------------------------------
    //Make a function to check if a given number n is even or not.

    public static void checkEven(int num){
        if(num%2==0){
            System.out.println("Even no. ");
        }
        else {
            System.out.println("not even");
        }
    }

    //------------------3---------------------------------
    //Make a function to print the table of a given number n.

    public static void table(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
        return;
    }
}
