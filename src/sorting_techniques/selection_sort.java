package sorting_techniques;

import java.util.Scanner;

public class selection_sort {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //sorting
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=0;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }

            }
            //swap
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
