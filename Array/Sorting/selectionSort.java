package Array.Sorting;

import java.util.Scanner;

public class selectionSort {
    //finding the minimum element and swaping it.
    public static void selection(int[ ] arr,int n){

        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {

                    min=j;
                }
            }

                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        selection(arr,n);

        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
