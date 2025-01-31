package sorting_techniques;

import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter length of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // sorting
        for(int i=1;i<arr.length;i++){  // for unsorted path
            int current = i;
            int j=i-1; // for sorted path
            while(j>=0 && current<arr[j] ){
                //keep swaping
                arr[j+1]=arr[j];

            }
            arr[j+1]=current;
            System.out.print(arr[i]);
        }

    }
}
