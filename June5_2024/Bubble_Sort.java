package June5_2024;

import java.util.Scanner;

public class Bubble_Sort {

    static void bubble_sort(int arr[]){
        int size = arr.length;

        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubble_sort(arr);
        System.out.println("After Sorting");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
