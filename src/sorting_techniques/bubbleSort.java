package sorting_techniques;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in array  ");
        int n = sc.nextInt();
        System.out.println("enter elements of array ");
        int arr[]=new int[n];
        // taking input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // bubble sort : time complexity is o(n^2)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(" sorted array is : ");

        // for output
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }


    }
}
